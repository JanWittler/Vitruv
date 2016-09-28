package mir.routines.simpleChangesTests;

import allElementTypes.NonRoot;
import java.io.IOException;
import mir.routines.simpleChangesTests.RoutinesFacade;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import tools.vitruv.dsls.response.tests.simpleChangesTests.SimpleChangesTestsExecutionMonitor;
import tools.vitruv.extensions.dslsruntime.response.AbstractEffectRealization;
import tools.vitruv.extensions.dslsruntime.response.ResponseExecutionState;
import tools.vitruv.extensions.dslsruntime.response.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class DeleteNonRootEObjectSingleEffect extends AbstractEffectRealization {
  private RoutinesFacade effectFacade;
  
  private DeleteNonRootEObjectSingleEffect.EffectUserExecution userExecution;
  
  private static class EffectUserExecution extends AbstractEffectRealization.UserExecution {
    public EffectUserExecution(final ResponseExecutionState responseExecutionState, final CallHierarchyHaving calledBy) {
      super(responseExecutionState);
    }
    
    public EObject getCorrepondenceSourceTargetElement(final NonRoot containedObject) {
      return containedObject;
    }
    
    public EObject getElement1(final NonRoot containedObject, final NonRoot targetElement) {
      return targetElement;
    }
    
    public void callRoutine1(final NonRoot containedObject, final NonRoot targetElement, @Extension final RoutinesFacade _routinesFacade) {
      SimpleChangesTestsExecutionMonitor _instance = SimpleChangesTestsExecutionMonitor.getInstance();
      _instance.set(SimpleChangesTestsExecutionMonitor.ChangeType.DeleteNonRootEObjectSingle);
    }
  }
  
  public DeleteNonRootEObjectSingleEffect(final ResponseExecutionState responseExecutionState, final CallHierarchyHaving calledBy, final NonRoot containedObject) {
    super(responseExecutionState, calledBy);
    this.userExecution = new mir.routines.simpleChangesTests.DeleteNonRootEObjectSingleEffect.EffectUserExecution(getExecutionState(), this);
    this.effectFacade = new mir.routines.simpleChangesTests.RoutinesFacade(getExecutionState(), this);
    this.containedObject = containedObject;
  }
  
  private NonRoot containedObject;
  
  protected void executeRoutine() throws IOException {
    getLogger().debug("Called routine DeleteNonRootEObjectSingleEffect with input:");
    getLogger().debug("   NonRoot: " + this.containedObject);
    
    NonRoot targetElement = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceTargetElement(containedObject), // correspondence source supplier
    	NonRoot.class,
    	(NonRoot _element) -> true, // correspondence precondition checker
    	null);
    if (targetElement == null) {
    	return;
    }
    initializeRetrieveElementState(targetElement);
    deleteObject(userExecution.getElement1(containedObject, targetElement));
    
    userExecution.callRoutine1(containedObject, targetElement, effectFacade);
    
    postprocessElementStates();
  }
}