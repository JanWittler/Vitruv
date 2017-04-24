/**
 */
package model.commit.impl;

import java.util.Collection;

import model.commit.Commit;
import model.commit.CommitMessage;
import model.commit.CommitPackage;
import model.commit.MergeCommit;

import model.impl.SignedImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tools.vitruv.framework.change.echange.EChange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.commit.impl.CommitImpl#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link model.commit.impl.CommitImpl#getChanges <em>Changes</em>}</li>
 *   <li>{@link model.commit.impl.CommitImpl#getCommitmessage <em>Commitmessage</em>}</li>
 *   <li>{@link model.commit.impl.CommitImpl#getCommitsBranchedFromThis <em>Commits Branched From This</em>}</li>
 *   <li>{@link model.commit.impl.CommitImpl#getCommitsMergedFromThis <em>Commits Merged From This</em>}</li>
 *   <li>{@link model.commit.impl.CommitImpl#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CommitImpl extends SignedImpl implements Commit {
	/**
	 * The default value of the '{@link #getChecksum() <em>Checksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecksum()
	 * @generated
	 * @ordered
	 */
	protected static final long CHECKSUM_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getChecksum() <em>Checksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecksum()
	 * @generated
	 * @ordered
	 */
	protected long checksum = CHECKSUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChanges() <em>Changes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChanges()
	 * @generated
	 * @ordered
	 */
	protected EList<EChange> changes;

	/**
	 * The cached value of the '{@link #getCommitmessage() <em>Commitmessage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitmessage()
	 * @generated
	 * @ordered
	 */
	protected CommitMessage commitmessage;

	/**
	 * The cached value of the '{@link #getCommitsBranchedFromThis() <em>Commits Branched From This</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitsBranchedFromThis()
	 * @generated
	 * @ordered
	 */
	protected EList<Commit> commitsBranchedFromThis;

	/**
	 * The cached value of the '{@link #getCommitsMergedFromThis() <em>Commits Merged From This</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitsMergedFromThis()
	 * @generated
	 * @ordered
	 */
	protected EList<MergeCommit> commitsMergedFromThis;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final int IDENTIFIER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected int identifier = IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommitPackage.Literals.COMMIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getChecksum() {
		return checksum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChecksum(long newChecksum) {
		long oldChecksum = checksum;
		checksum = newChecksum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommitPackage.COMMIT__CHECKSUM, oldChecksum, checksum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EChange> getChanges() {
		if (changes == null) {
			changes = new EObjectResolvingEList<EChange>(EChange.class, this, CommitPackage.COMMIT__CHANGES);
		}
		return changes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitMessage getCommitmessage() {
		if (commitmessage != null && commitmessage.eIsProxy()) {
			InternalEObject oldCommitmessage = (InternalEObject)commitmessage;
			commitmessage = (CommitMessage)eResolveProxy(oldCommitmessage);
			if (commitmessage != oldCommitmessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommitPackage.COMMIT__COMMITMESSAGE, oldCommitmessage, commitmessage));
			}
		}
		return commitmessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitMessage basicGetCommitmessage() {
		return commitmessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommitmessage(CommitMessage newCommitmessage) {
		CommitMessage oldCommitmessage = commitmessage;
		commitmessage = newCommitmessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommitPackage.COMMIT__COMMITMESSAGE, oldCommitmessage, commitmessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Commit> getCommitsBranchedFromThis() {
		if (commitsBranchedFromThis == null) {
			commitsBranchedFromThis = new EObjectResolvingEList<Commit>(Commit.class, this, CommitPackage.COMMIT__COMMITS_BRANCHED_FROM_THIS);
		}
		return commitsBranchedFromThis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MergeCommit> getCommitsMergedFromThis() {
		if (commitsMergedFromThis == null) {
			commitsMergedFromThis = new EObjectWithInverseResolvingEList.ManyInverse<MergeCommit>(MergeCommit.class, this, CommitPackage.COMMIT__COMMITS_MERGED_FROM_THIS, CommitPackage.MERGE_COMMIT__COMMITS_MERGED_TO_THIS);
		}
		return commitsMergedFromThis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(int newIdentifier) {
		int oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommitPackage.COMMIT__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommitPackage.COMMIT__COMMITS_MERGED_FROM_THIS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommitsMergedFromThis()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommitPackage.COMMIT__COMMITS_MERGED_FROM_THIS:
				return ((InternalEList<?>)getCommitsMergedFromThis()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommitPackage.COMMIT__CHECKSUM:
				return getChecksum();
			case CommitPackage.COMMIT__CHANGES:
				return getChanges();
			case CommitPackage.COMMIT__COMMITMESSAGE:
				if (resolve) return getCommitmessage();
				return basicGetCommitmessage();
			case CommitPackage.COMMIT__COMMITS_BRANCHED_FROM_THIS:
				return getCommitsBranchedFromThis();
			case CommitPackage.COMMIT__COMMITS_MERGED_FROM_THIS:
				return getCommitsMergedFromThis();
			case CommitPackage.COMMIT__IDENTIFIER:
				return getIdentifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommitPackage.COMMIT__CHECKSUM:
				setChecksum((Long)newValue);
				return;
			case CommitPackage.COMMIT__CHANGES:
				getChanges().clear();
				getChanges().addAll((Collection<? extends EChange>)newValue);
				return;
			case CommitPackage.COMMIT__COMMITMESSAGE:
				setCommitmessage((CommitMessage)newValue);
				return;
			case CommitPackage.COMMIT__COMMITS_BRANCHED_FROM_THIS:
				getCommitsBranchedFromThis().clear();
				getCommitsBranchedFromThis().addAll((Collection<? extends Commit>)newValue);
				return;
			case CommitPackage.COMMIT__COMMITS_MERGED_FROM_THIS:
				getCommitsMergedFromThis().clear();
				getCommitsMergedFromThis().addAll((Collection<? extends MergeCommit>)newValue);
				return;
			case CommitPackage.COMMIT__IDENTIFIER:
				setIdentifier((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CommitPackage.COMMIT__CHECKSUM:
				setChecksum(CHECKSUM_EDEFAULT);
				return;
			case CommitPackage.COMMIT__CHANGES:
				getChanges().clear();
				return;
			case CommitPackage.COMMIT__COMMITMESSAGE:
				setCommitmessage((CommitMessage)null);
				return;
			case CommitPackage.COMMIT__COMMITS_BRANCHED_FROM_THIS:
				getCommitsBranchedFromThis().clear();
				return;
			case CommitPackage.COMMIT__COMMITS_MERGED_FROM_THIS:
				getCommitsMergedFromThis().clear();
				return;
			case CommitPackage.COMMIT__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CommitPackage.COMMIT__CHECKSUM:
				return checksum != CHECKSUM_EDEFAULT;
			case CommitPackage.COMMIT__CHANGES:
				return changes != null && !changes.isEmpty();
			case CommitPackage.COMMIT__COMMITMESSAGE:
				return commitmessage != null;
			case CommitPackage.COMMIT__COMMITS_BRANCHED_FROM_THIS:
				return commitsBranchedFromThis != null && !commitsBranchedFromThis.isEmpty();
			case CommitPackage.COMMIT__COMMITS_MERGED_FROM_THIS:
				return commitsMergedFromThis != null && !commitsMergedFromThis.isEmpty();
			case CommitPackage.COMMIT__IDENTIFIER:
				return identifier != IDENTIFIER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (checksum: ");
		result.append(checksum);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(')');
		return result.toString();
	}

} //CommitImpl
