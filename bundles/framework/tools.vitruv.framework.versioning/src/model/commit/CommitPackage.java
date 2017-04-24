/**
 */
package model.commit;

import model.ModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.commit.CommitFactory
 * @model kind="package"
 * @generated
 */
public interface CommitPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "commit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tools.vitruv/versioning/1.0/commit";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tools.vitruv.framework.versioning.commit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommitPackage eINSTANCE = model.commit.impl.CommitPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.commit.impl.CommitImpl <em>Commit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.commit.impl.CommitImpl
	 * @see model.commit.impl.CommitPackageImpl#getCommit()
	 * @generated
	 */
	int COMMIT = 2;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__SIGNATURE = ModelPackage.SIGNED__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__CHECKSUM = ModelPackage.SIGNED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Changes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__CHANGES = ModelPackage.SIGNED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Commitmessage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__COMMITMESSAGE = ModelPackage.SIGNED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Commits Branched From This</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__COMMITS_BRANCHED_FROM_THIS = ModelPackage.SIGNED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Commits Merged From This</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__COMMITS_MERGED_FROM_THIS = ModelPackage.SIGNED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__IDENTIFIER = ModelPackage.SIGNED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_FEATURE_COUNT = ModelPackage.SIGNED_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_OPERATION_COUNT = ModelPackage.SIGNED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.commit.impl.MergeCommitImpl <em>Merge Commit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.commit.impl.MergeCommitImpl
	 * @see model.commit.impl.CommitPackageImpl#getMergeCommit()
	 * @generated
	 */
	int MERGE_COMMIT = 0;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMMIT__SIGNATURE = COMMIT__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMMIT__CHECKSUM = COMMIT__CHECKSUM;

	/**
	 * The feature id for the '<em><b>Changes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMMIT__CHANGES = COMMIT__CHANGES;

	/**
	 * The feature id for the '<em><b>Commitmessage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMMIT__COMMITMESSAGE = COMMIT__COMMITMESSAGE;

	/**
	 * The feature id for the '<em><b>Commits Branched From This</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMMIT__COMMITS_BRANCHED_FROM_THIS = COMMIT__COMMITS_BRANCHED_FROM_THIS;

	/**
	 * The feature id for the '<em><b>Commits Merged From This</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMMIT__COMMITS_MERGED_FROM_THIS = COMMIT__COMMITS_MERGED_FROM_THIS;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMMIT__IDENTIFIER = COMMIT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Commits Merged To This</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMMIT__COMMITS_MERGED_TO_THIS = COMMIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Merge Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMMIT_FEATURE_COUNT = COMMIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Merge Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_COMMIT_OPERATION_COUNT = COMMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.commit.impl.SimpleCommitImpl <em>Simple Commit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.commit.impl.SimpleCommitImpl
	 * @see model.commit.impl.CommitPackageImpl#getSimpleCommit()
	 * @generated
	 */
	int SIMPLE_COMMIT = 1;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMMIT__SIGNATURE = COMMIT__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMMIT__CHECKSUM = COMMIT__CHECKSUM;

	/**
	 * The feature id for the '<em><b>Changes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMMIT__CHANGES = COMMIT__CHANGES;

	/**
	 * The feature id for the '<em><b>Commitmessage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMMIT__COMMITMESSAGE = COMMIT__COMMITMESSAGE;

	/**
	 * The feature id for the '<em><b>Commits Branched From This</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMMIT__COMMITS_BRANCHED_FROM_THIS = COMMIT__COMMITS_BRANCHED_FROM_THIS;

	/**
	 * The feature id for the '<em><b>Commits Merged From This</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMMIT__COMMITS_MERGED_FROM_THIS = COMMIT__COMMITS_MERGED_FROM_THIS;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMMIT__IDENTIFIER = COMMIT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMMIT__PARENT = COMMIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMMIT_FEATURE_COUNT = COMMIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMMIT_OPERATION_COUNT = COMMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.commit.impl.CommitMessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.commit.impl.CommitMessageImpl
	 * @see model.commit.impl.CommitPackageImpl#getCommitMessage()
	 * @generated
	 */
	int COMMIT_MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_MESSAGE__DATE = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_MESSAGE__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_MESSAGE__AUTHOR = 2;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_MESSAGE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link model.commit.MergeCommit <em>Merge Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Commit</em>'.
	 * @see model.commit.MergeCommit
	 * @generated
	 */
	EClass getMergeCommit();

	/**
	 * Returns the meta object for the reference list '{@link model.commit.MergeCommit#getCommitsMergedToThis <em>Commits Merged To This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commits Merged To This</em>'.
	 * @see model.commit.MergeCommit#getCommitsMergedToThis()
	 * @see #getMergeCommit()
	 * @generated
	 */
	EReference getMergeCommit_CommitsMergedToThis();

	/**
	 * Returns the meta object for class '{@link model.commit.SimpleCommit <em>Simple Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Commit</em>'.
	 * @see model.commit.SimpleCommit
	 * @generated
	 */
	EClass getSimpleCommit();

	/**
	 * Returns the meta object for the reference '{@link model.commit.SimpleCommit#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see model.commit.SimpleCommit#getParent()
	 * @see #getSimpleCommit()
	 * @generated
	 */
	EReference getSimpleCommit_Parent();

	/**
	 * Returns the meta object for class '{@link model.commit.Commit <em>Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commit</em>'.
	 * @see model.commit.Commit
	 * @generated
	 */
	EClass getCommit();

	/**
	 * Returns the meta object for the attribute '{@link model.commit.Commit#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checksum</em>'.
	 * @see model.commit.Commit#getChecksum()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Checksum();

	/**
	 * Returns the meta object for the reference list '{@link model.commit.Commit#getChanges <em>Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Changes</em>'.
	 * @see model.commit.Commit#getChanges()
	 * @see #getCommit()
	 * @generated
	 */
	EReference getCommit_Changes();

	/**
	 * Returns the meta object for the reference '{@link model.commit.Commit#getCommitmessage <em>Commitmessage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commitmessage</em>'.
	 * @see model.commit.Commit#getCommitmessage()
	 * @see #getCommit()
	 * @generated
	 */
	EReference getCommit_Commitmessage();

	/**
	 * Returns the meta object for the reference list '{@link model.commit.Commit#getCommitsBranchedFromThis <em>Commits Branched From This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commits Branched From This</em>'.
	 * @see model.commit.Commit#getCommitsBranchedFromThis()
	 * @see #getCommit()
	 * @generated
	 */
	EReference getCommit_CommitsBranchedFromThis();

	/**
	 * Returns the meta object for the reference list '{@link model.commit.Commit#getCommitsMergedFromThis <em>Commits Merged From This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commits Merged From This</em>'.
	 * @see model.commit.Commit#getCommitsMergedFromThis()
	 * @see #getCommit()
	 * @generated
	 */
	EReference getCommit_CommitsMergedFromThis();

	/**
	 * Returns the meta object for the attribute '{@link model.commit.Commit#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see model.commit.Commit#getIdentifier()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Identifier();

	/**
	 * Returns the meta object for class '{@link model.commit.CommitMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see model.commit.CommitMessage
	 * @generated
	 */
	EClass getCommitMessage();

	/**
	 * Returns the meta object for the attribute '{@link model.commit.CommitMessage#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see model.commit.CommitMessage#getDate()
	 * @see #getCommitMessage()
	 * @generated
	 */
	EAttribute getCommitMessage_Date();

	/**
	 * Returns the meta object for the attribute '{@link model.commit.CommitMessage#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see model.commit.CommitMessage#getMessage()
	 * @see #getCommitMessage()
	 * @generated
	 */
	EAttribute getCommitMessage_Message();

	/**
	 * Returns the meta object for the reference '{@link model.commit.CommitMessage#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see model.commit.CommitMessage#getAuthor()
	 * @see #getCommitMessage()
	 * @generated
	 */
	EReference getCommitMessage_Author();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommitFactory getCommitFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.commit.impl.MergeCommitImpl <em>Merge Commit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.commit.impl.MergeCommitImpl
		 * @see model.commit.impl.CommitPackageImpl#getMergeCommit()
		 * @generated
		 */
		EClass MERGE_COMMIT = eINSTANCE.getMergeCommit();

		/**
		 * The meta object literal for the '<em><b>Commits Merged To This</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_COMMIT__COMMITS_MERGED_TO_THIS = eINSTANCE.getMergeCommit_CommitsMergedToThis();

		/**
		 * The meta object literal for the '{@link model.commit.impl.SimpleCommitImpl <em>Simple Commit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.commit.impl.SimpleCommitImpl
		 * @see model.commit.impl.CommitPackageImpl#getSimpleCommit()
		 * @generated
		 */
		EClass SIMPLE_COMMIT = eINSTANCE.getSimpleCommit();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_COMMIT__PARENT = eINSTANCE.getSimpleCommit_Parent();

		/**
		 * The meta object literal for the '{@link model.commit.impl.CommitImpl <em>Commit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.commit.impl.CommitImpl
		 * @see model.commit.impl.CommitPackageImpl#getCommit()
		 * @generated
		 */
		EClass COMMIT = eINSTANCE.getCommit();

		/**
		 * The meta object literal for the '<em><b>Checksum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__CHECKSUM = eINSTANCE.getCommit_Checksum();

		/**
		 * The meta object literal for the '<em><b>Changes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT__CHANGES = eINSTANCE.getCommit_Changes();

		/**
		 * The meta object literal for the '<em><b>Commitmessage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT__COMMITMESSAGE = eINSTANCE.getCommit_Commitmessage();

		/**
		 * The meta object literal for the '<em><b>Commits Branched From This</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT__COMMITS_BRANCHED_FROM_THIS = eINSTANCE.getCommit_CommitsBranchedFromThis();

		/**
		 * The meta object literal for the '<em><b>Commits Merged From This</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT__COMMITS_MERGED_FROM_THIS = eINSTANCE.getCommit_CommitsMergedFromThis();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__IDENTIFIER = eINSTANCE.getCommit_Identifier();

		/**
		 * The meta object literal for the '{@link model.commit.impl.CommitMessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.commit.impl.CommitMessageImpl
		 * @see model.commit.impl.CommitPackageImpl#getCommitMessage()
		 * @generated
		 */
		EClass COMMIT_MESSAGE = eINSTANCE.getCommitMessage();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT_MESSAGE__DATE = eINSTANCE.getCommitMessage_Date();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT_MESSAGE__MESSAGE = eINSTANCE.getCommitMessage_Message();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT_MESSAGE__AUTHOR = eINSTANCE.getCommitMessage_Author();

	}

} //CommitPackage
