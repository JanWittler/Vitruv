package tools.vitruv.extensions.changevisualization.tree;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.InputEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import tools.vitruv.extensions.changevisualization.ui.ChangeVisualizationUI;

/**
 * Displays all structural features of an EObject in a scrollable UI. It shows the names of the
 * structural features on the left and their values as TextField on the right. This information
 * is extended by the eClass name and the runtime class name of the eObject.
 * 
 * @author Andreas Loeffler
 */
public class EObjectStructuralFeaturePanel extends JScrollPane{

	/**
	 * Needed for eclipse to stop warning about serialVersionIds. This feature will never been used. 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Implements the usual strg + mousewheel zoom behaviour
	 */
	private final MouseWheelListener mwl=new MouseWheelListener() {
		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {	
			//Implements the usual strg + mousewheel behaviour for zooming
			if ((e.getModifiersEx() & InputEvent.CTRL_DOWN_MASK) == 0) return;
			if(e.getWheelRotation()<=-1) {
				for(JLabel label:getAllLabels()) {
					float newSize=label.getFont().getSize()+2;
					if(newSize>30) newSize=30;
					label.setFont(label.getFont().deriveFont(newSize));					
				}
				for(JTextField field:getAllFields()) {
					float newSize=field.getFont().getSize()+2;
					if(newSize>30) newSize=30;
					field.setFont(field.getFont().deriveFont(newSize));					
				}
			}else if(e.getWheelRotation()>=1) {
				for(JLabel label:getAllLabels()) {
					float newSize=label.getFont().getSize()-2;
					if(newSize<5) newSize=5;
					label.setFont(label.getFont().deriveFont(newSize));					
				}
				for(JTextField field:getAllFields()) {
					float newSize=field.getFont().getSize()-2;
					if(newSize<5) newSize=5;
					field.setFont(field.getFont().deriveFont(newSize));					
				}				
			}
		}	
	};
	
	/**
	 * List of all added JTextFields used for mouse wheel zooming
	 */
	private List<JTextField> allFields=new Vector<JTextField>();
	
	/**
	 * List of all added JLabels used for mouse wheel zooming
	 */
	private List<JLabel> allLabels=new Vector<JLabel>();

	/**
	 * Constructs an EObjectStructuralFeaturePanel visualizing all structural features of a given EObject
	 * 
	 * @param eObj The EObject to visualize
	 */
	public EObjectStructuralFeaturePanel(EObject eObj) {
		//Create the basic layout and panel structure
		JPanel pane = new JPanel(new BorderLayout());
		JPanel left = new JPanel(new GridLayout(1,1));
		left.setBorder(new EmptyBorder(5,5,5,5));
		JPanel center=new JPanel(new GridLayout(1,1));
		center.setBorder(new EmptyBorder(5,5,5,5));			
		pane.add(left,BorderLayout.WEST);
		pane.add(center,BorderLayout.CENTER);

		//add general information
		createEClassInformation(center,left,eObj);

		//Add runtime class information
		createRuntimeClassInformation(center,left,eObj);

		//add strucutral feature information
		createStructuralFeatureInformation(center,left,eObj);		

		//Put it into this scrollPane
		setViewportView(pane);
		
		this.addMouseWheelListener(mwl);
	}

	protected List<JTextField> getAllFields() {
		return allFields;
	}
	
	private List<JLabel> getAllLabels() {
		return allLabels;
	}

	/**
	 * Creates the lines for all strucutral features
	 * 
	 * @param center The center panel
	 * @param left The left panel
	 * @param eObj The eObject
	 */
	private void createStructuralFeatureInformation(JPanel center, JPanel left, EObject eObj) {
		for (EStructuralFeature feature:eObj.eClass().getEAllStructuralFeatures()) {
			if(feature==null) {
				continue;
			}
			Object fObj=eObj.eGet(feature);
			if(fObj==null) {
				fObj="";
			}
			createLine(center,left,feature.getName(),String.valueOf(fObj));
		}	
	}

	/**
	 * Creates the line with the runtime class information
	 * 
	 * @param center The center panel
	 * @param left The left panel
	 * @param eObj The eObject
	 */
	private void createRuntimeClassInformation(JPanel center, JPanel left, EObject eObj) {
		createLine(center,left,"runtime class",eObj.getClass().getName());
	}

	/**
	 * Creates the line with the eClass information
	 * 
	 * @param center The center panel
	 * @param left The left panel
	 * @param eObj The eObject
	 */
	private void createEClassInformation(JPanel center, JPanel left, EObject eObj) {
		createLine(center,left,"eClass",eObj.eClass().getName());
	}		

	/**
	 * Create a line in the center and left panel with the given texts
	 * 
	 * @param center The center panel
	 * @param left The left panel
	 * @param labelText The text for the label
	 * @param fieldText The text for the field
	 */
	private void createLine(JPanel center,JPanel left,String labelText,String fieldText) {
		//Create the label
		JLabel label=new JLabel(labelText,JLabel.RIGHT);
		label.setFont(ChangeVisualizationUI.DEFAULT_LABEL_FONT);
		allLabels.add(label);
		
		//Create the field
		JTextField field=new JTextField(fieldText);
		field.setEditable(false);
		field.setFont(ChangeVisualizationUI.DEFAULT_TEXTFIELD_FONT);
		allFields.add(field);
		
		//Add label to left and increase the layout dimension
		((GridLayout)left.getLayout()).setRows(((GridLayout)left.getLayout()).getRows()+1);
		left.add(label);

		//Add field to center and increase the layout dimension
		((GridLayout)center.getLayout()).setRows(((GridLayout)center.getLayout()).getRows()+1);
		center.add(field);
	}

}
