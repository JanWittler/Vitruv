package tools.vitruv.framework.versioning.emfstore.impl

import tools.vitruv.framework.versioning.emfstore.VVFactory

class VVFactoryImpl implements VVFactory {
	static def VVFactory init() {
		new VVFactoryImpl
	}

	private new() {
	}

	override createWorkspace() {
		new VVWorkspaceImpl
	}

	override createServer() {
		new VVServerImpl
	}

	override createRemoteProject() {
		new VVRemoteProjectImpl
	}

	override createLocalProject(String name) {
		new VVLocalProjectImpl(name)
	}

}