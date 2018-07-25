package tools.vitruv.framework.userinteraction.types

import tools.vitruv.framework.userinteraction.types.InteractionFactory
import tools.vitruv.framework.userinteraction.WindowModality
import tools.vitruv.framework.userinteraction.resultprovider.InteractionResultProvider

/**
 * @author Heiko Klare
 */
public class InteractionFactoryImpl implements InteractionFactory {
	private final InteractionResultProvider interactionResultProvider;
	private final WindowModality windowModality;
	
	new(InteractionResultProvider interactionResultProvider, WindowModality windowModality) {
		this.windowModality = windowModality;
		this.interactionResultProvider = interactionResultProvider;
	}
	
	override createConfirmationInteraction() {
		return new ConfirmationInteraction(interactionResultProvider, windowModality);
	}
	
	override createNotificationInteraction() {
		return new NotificationInteraction(interactionResultProvider, windowModality);
	}
	
	override createTextInputInteraction() {
		return new TextInputInteraction(interactionResultProvider, windowModality);
	}
	
	override createMultipleChoiceSingleSelectionInteraction() {
		return new MultipleChoiceSingleSelectionInteraction(interactionResultProvider, windowModality);
	}
	
	override createMultipleChoiceMultipleSelectionInteraction() {
		return new MultipleChoiceMultipleSelectionInteraction(interactionResultProvider, windowModality);
	}
}