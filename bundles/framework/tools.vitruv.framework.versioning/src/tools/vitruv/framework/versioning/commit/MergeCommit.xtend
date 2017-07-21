package tools.vitruv.framework.versioning.commit

import java.util.List

interface MergeCommit extends Commit {
	def List<Commit> getCommitsMergedToThis()
}