package edu.kit.ipd.sdq.vitruvius.framework.vsum.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

import edu.kit.ipd.sdq.vitruvius.framework.contracts.datatypes.VURI;
import edu.kit.ipd.sdq.vitruvius.framework.util.VitruviusConstants;
import edu.kit.ipd.sdq.vitruvius.framework.vsum.VSUMConstants;

public class FileSystemHelper {
    /** Utility classes should not have a public or default constructor. */
    private FileSystemHelper() {
    }

    public static VURI getCorrespondencesVURI(final VURI[] mmURIs) {
        IFile correspondenceFile = getCorrespondenceIFile(mmURIs);
        return VURI.getInstance(correspondenceFile);
    }

    public static void saveCorrespondenceInstanceMMURIs(final VURI[] mmURIs) {
        IFile correspondenceInstanceIFile = getCorrespondenceIFile(mmURIs);
        Set<VURI> mmURIsSet = new HashSet<VURI>(Arrays.asList(mmURIs));
        saveVURISetToFile(mmURIsSet, correspondenceInstanceIFile.getLocation().toOSString());
    }

    public static IFile getCorrespondenceIFile(final VURI[] mmURIs) {
        String fileName = getCorrespondenceFileName(mmURIs);
        return getCorrespondenceIFile(fileName);
    }

    public static IFile getCorrespondenceIFile(final String fileName) {
        IProject correspondenceProject = getVSUMProject();
        IFolder correspondenceFolder = getCorrespondenceFolder(correspondenceProject);
        IFile correspondenceFile = correspondenceFolder.getFile(fileName);
        return correspondenceFile;
    }

    private static String getCorrespondenceFileName(final VURI[] mmURIs) {
        String fileExtSeparator = VitruviusConstants.getFileExtSeparator();
        String fileExt = VitruviusConstants.getCorrespondencesFileExt();
        VURI[] copyOfMMURIs = Arrays.copyOf(mmURIs, mmURIs.length);
        Arrays.sort(copyOfMMURIs);
        String fileName = "";
        for (VURI uri : copyOfMMURIs) {

            String authority = uri.getEMFUri().authority();
            if (authority != null) {
                int indexOfLastDot = authority.lastIndexOf('.');

                fileName += authority.substring(indexOfLastDot + 1);

            }
            fileName += uri.toString().hashCode();
        }
        fileName = fileName + fileExtSeparator + fileExt;
        return fileName;
    }

    public static void saveVSUMvURIsToFile(final Set<VURI> vuris) {
        String fileName = getVSUMMapFileName();
        saveVURISetToFile(vuris, fileName);
    }

    private static void saveVURISetToFile(final Set<VURI> vuris, final String fileName) {
        Set<String> stringSet = new HashSet<String>(vuris.size());
        for (VURI vuri : vuris) {
            stringSet.add(vuri.getEMFUri().toString());
        }
        saveObjectToFile(stringSet, fileName);
    }

    public static void saveObjectToFile(final Object object, final String fileName) {
        try {
            // TODO: this code could be optimized in a way that a new method is provide for sets of
            // strings where only the new strings are appended to the file
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
            oos.writeObject(object);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException("Could not save '" + object + "' to file '" + fileName + "':  " + e);
        }
    }

    public static Set<VURI> loadVSUMvURIsFromFile() {
        String fileName = getVSUMMapFileName();
        return loadVURISetFromFile(fileName);

    }

    private static Set<VURI> loadVURISetFromFile(final String fileName) {
        Set<String> stringSet = loadStringSetFromFile(fileName);
        Set<VURI> vuris = new HashSet<VURI>(stringSet.size() * 2);
        for (String str : stringSet) {
            vuris.add(VURI.getInstance(str));
        }
        return vuris;
    }

    @SuppressWarnings("unchecked")
    private static Set<String> loadStringSetFromFile(final String fileName) {
        Object obj = loadObjectFromFile(fileName);
        if (obj == null) {
            return Collections.emptySet();
        } else if (obj instanceof Set<?>) {
            return (Set<String>) obj;
        } else {
            throw new RuntimeException("The file with the name '" + fileName + "' does not contain a set of strings!");
        }
    }

    public static Object loadObjectFromFile(final String fileName) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fileInputStream);
            Object obj = ois.readObject();
            ois.close();
            return obj;
        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static IProject getVSUMProject() {
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        IProject vsumProject = root.getProject(VSUMConstants.VSUM_PROJECT_NAME);
        if (!vsumProject.exists()) {
            createProject(vsumProject);
        } else if (!vsumProject.isAccessible()) {
            deleteAndRecreateProject(vsumProject);
        }
        return vsumProject;

    }

    private static void deleteAndRecreateProject(final IProject vsumProject) {
        try {
            vsumProject.delete(true, new NullProgressMonitor());
            createProject(vsumProject);
        } catch (CoreException e) {
            // soften
            throw new RuntimeException(e);
        }
    }

    public static void createProject(final IProject project) {
        try {
            project.create(null);
            project.open(null);
            // IProjectDescription description = project.getDescription();
            // description.setNatureIds(new String[] { VITRUVIUSNATURE.ID });
            // project.setDescription(description, null);
            createFolder(getCorrespondenceFolder(project));
            createFolder(getVSMUFolder(project));
        } catch (CoreException e) {
            // soften
            throw new RuntimeException(e);
        }
    }

    private static IFolder getVSMUFolder(final IProject project) {
        return project.getFolder(VSUMConstants.VSUM_FOLDER_NAME);
    }

    private static void createFolder(final IFolder folder) throws CoreException {
        folder.create(false, true, null);
    }

    private static IFolder getCorrespondenceFolder(final IProject project) {
        IFolder correspondenceFolder = project.getFolder(VSUMConstants.CORRESPONDENCE_FOLDER_NAME);
        return correspondenceFolder;
    }

    private static String getVSUMMapFileName() {
        IFile file = getVSUMProject().getFolder(VSUMConstants.VSUM_FOLDER_NAME)
                .getFile(VSUMConstants.VSUM_INSTANCES_FILE_NAME);
        return file.getLocation().toOSString();
    }

}
