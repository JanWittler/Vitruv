package tools.vitruv.dsls.commonalities.language

import org.eclipse.emf.common.util.DelegatingEList.UnmodifiableEList
import tools.vitruv.dsls.commonalities.language.elements.Classifier
import tools.vitruv.dsls.commonalities.language.elements.LeastSpecificType
import tools.vitruv.dsls.commonalities.language.elements.MostSpecificType
import tools.vitruv.dsls.commonalities.language.impl.CommonalityImpl

import static extension tools.vitruv.dsls.commonalities.language.extensions.CommonalitiesLanguageModelExtensions.*

package class CommonalityI extends CommonalityImpl {

	override basicGetPackageLikeContainer() {
		getOptionalDirectEContainer(CommonalityFile)?.concept
	}

	override getAllMembers() {
		new UnmodifiableEList((getAttributes() + getReferences()).toList)
	}

	def dispatch isSuperTypeOf(Classifier classifier) {
		classifier == this
	}

	def dispatch isSuperTypeOf(MostSpecificType mostSpecificType) {
		true
	}

	def dispatch isSuperTypeOf(LeastSpecificType leastSpecificType) {
		false
	}

	override basicGetDomain() {
		concept
	}

	override toString() {
		'''«packageLikeContainer»:«name»'''
	}

	override isAbstract() {
		false
	}
}
