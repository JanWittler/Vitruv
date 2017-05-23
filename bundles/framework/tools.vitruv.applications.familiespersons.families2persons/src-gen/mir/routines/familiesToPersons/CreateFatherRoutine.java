package mir.routines.familiesToPersons;

import edu.kit.ipd.sdq.metamodels.families.Family;
import edu.kit.ipd.sdq.metamodels.families.Member;
import edu.kit.ipd.sdq.metamodels.persons.Male;
import edu.kit.ipd.sdq.metamodels.persons.impl.PersonsFactoryImpl;
import java.io.IOException;
import mir.routines.familiesToPersons.RoutinesFacade;
import org.eclipse.emf.ecore.EObject;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateFatherRoutine extends AbstractRepairRoutineRealization {
  private RoutinesFacade actionsFacade;
  
  private CreateFatherRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final Member member, final Male person) {
      return member;
    }
    
    public EObject getElement4(final Member member, final Male person) {
      return person;
    }
    
    public EObject getElement2(final Member member, final Male person) {
      return person;
    }
    
    public EObject getElement3(final Member member, final Male person) {
      Family _familyFather = member.getFamilyFather();
      return _familyFather;
    }
    
    public void updatePersonElement(final Member member, final Male person) {
      String _firstName = member.getFirstName();
      String _plus = (_firstName + " ");
      Family _familyFather = member.getFamilyFather();
      String _lastName = _familyFather.getLastName();
      String _plus_1 = (_plus + _lastName);
      person.setFullName(_plus_1);
    }
  }
  
  public CreateFatherRoutine(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Member member) {
    super(reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.familiesToPersons.CreateFatherRoutine.ActionUserExecution(getExecutionState(), this);
    this.actionsFacade = new mir.routines.familiesToPersons.RoutinesFacade(getExecutionState(), this);
    this.member = member;
  }
  
  private Member member;
  
  protected void executeRoutine() throws IOException {
    getLogger().debug("Called routine CreateFatherRoutine with input:");
    getLogger().debug("   Member: " + this.member);
    
    Male person = PersonsFactoryImpl.eINSTANCE.createMale();
    userExecution.updatePersonElement(member, person);
    
    addCorrespondenceBetween(userExecution.getElement1(member, person), userExecution.getElement2(member, person), "");
    
    addCorrespondenceBetween(userExecution.getElement3(member, person), userExecution.getElement4(member, person), "");
    
    postprocessElements();
  }
}
