package edu.kit.ipd.sdq.vitruvius.framework.contracts.change.impl

import edu.kit.ipd.sdq.vitruvius.framework.contracts.change.impl.ConcreteChangeImpl
import edu.kit.ipd.sdq.vitruvius.framework.contracts.change.ConcreteChange
import edu.kit.ipd.sdq.vitruvius.framework.contracts.datatypes.VURI
import edu.kit.ipd.sdq.vitruvius.framework.contracts.interfaces.ChangePreparing

class EmptyChangeImpl extends ConcreteChangeImpl implements ConcreteChange {
	
	new(VURI vuri) {
		super(vuri);
	}
	
	override isPrepared() {
		return true;
	}
	
	override prepare(ChangePreparing preparer) {
		// Do nothing, empty changes do not have to be prepared
	}
	
}