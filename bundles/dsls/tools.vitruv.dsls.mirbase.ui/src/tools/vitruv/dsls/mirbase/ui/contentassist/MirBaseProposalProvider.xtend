/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package tools.vitruv.dsls.mirbase.ui.contentassist

import com.google.inject.Inject
import tools.vitruv.dsls.mirbase.services.MirBaseGrammarAccess
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.jface.text.contentassist.ICompletionProposal
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class MirBaseProposalProvider extends AbstractMirBaseProposalProvider {
	
	@Inject
	MirBaseGrammarAccess grammarAccess;
	
	override completeMetamodelImport_UseQualifiedNames(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		val realKeyword = "using qualified names";
		val ICompletionProposal proposal = createCompletionProposal(realKeyword, realKeyword,
				getImage(grammarAccess.metamodelImportRule), context);
		getPriorityHelper().adjustKeywordPriority(proposal, context.getPrefix());
		acceptor.accept(proposal)
	}
	
}
