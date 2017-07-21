package tools.vitruv.framework.tests

import edu.kit.ipd.sdq.commons.util.java.lang.StringUtil
import java.util.ArrayList
import java.util.Arrays
import java.util.Collection
import java.util.Random
import java.util.concurrent.ConcurrentLinkedQueue
import org.apache.log4j.Logger
import org.eclipse.emf.common.util.URI
import org.eclipse.xtend.lib.annotations.Accessors
import tools.vitruv.framework.userinteraction.UserInteracting
import tools.vitruv.framework.userinteraction.UserInteractionType

/** 
 * The {@link TestUserInteractor} can be used in tests to simulate UserInteracting. It has a queue
 * of next selections. If the queue is empty the {@link TestUserInteractor} decides randomly the
 * next selection. It also allows to simulate the thinking time for a user.
 */
class TestUserInteractor implements UserInteracting {
	static extension Logger = Logger::getLogger(TestUserInteractor)
	val ConcurrentLinkedQueue<Integer> concurrentIntLinkedQueue
	val ConcurrentLinkedQueue<String> concurrentStringLinkedQueue
	val ConcurrentLinkedQueue<URI> concurrentURILinkedQueue
	val Random random
	val int minWaittime
	val int maxWaittime
	val int waitTimeRange
	@Accessors(PUBLIC_GETTER)
	Collection<String> messageLog

	new(int minWaittime, int maxWaittime) {
		if (minWaittime >
			maxWaittime)
			throw new RuntimeException('''Configure min and max waittime properly: Min«minWaittime» Max: «maxWaittime»''')
		
		this.minWaittime = minWaittime
		this.maxWaittime = maxWaittime
		waitTimeRange = maxWaittime - minWaittime
		concurrentIntLinkedQueue = new ConcurrentLinkedQueue<Integer>
		concurrentStringLinkedQueue = new ConcurrentLinkedQueue<String>
		concurrentURILinkedQueue = new ConcurrentLinkedQueue<URI>
		random = new Random
		messageLog = new ArrayList<String>
	}

	new() {
		this(-1, -1)
	}

	def void addNextSelections(Integer... nextSelections) {
		concurrentIntLinkedQueue.clear()
		concurrentIntLinkedQueue.addAll(Arrays.asList(nextSelections))
	}

	def void addNextSelections(String... nextSelections) {
		concurrentStringLinkedQueue.clear()
		concurrentStringLinkedQueue.addAll(Arrays.asList(nextSelections))
	}

	def void addNextSelections(URI... nextSelections) {
		concurrentURILinkedQueue.clear
		concurrentURILinkedQueue.addAll(Arrays.asList(nextSelections))
	}

	override void showMessage(UserInteractionType type, String message) {
		info('''showMessage: «message» Type: «type»''')
		messageLog.add(message)
	}

	override int selectFromMessage(UserInteractionType type, String message, String... selectionDescriptions) {

		info('''selectFromMessage: «message» Type: «type» Choices: «StringUtil.join(selectionDescriptions, ", ")»''')
		return selectFromMessage(selectionDescriptions.length)
	}

	def private int selectFromMessage(int maxLength) {
		simulateUserThinktime
		var int currentSelection
		if (!concurrentIntLinkedQueue.empty) {
			currentSelection = concurrentIntLinkedQueue.poll
			if (currentSelection >= maxLength) {
				warn("currentSelection>maxLength - could lead to array out of bounds exception later on.")
			}
		} else {
			throw new IllegalStateException("No user interaction integer selection specified")
		}
		info('''«TestUserInteractor.getSimpleName()» selected «currentSelection»''')
		return currentSelection
	}

	def private void simulateUserThinktime() {
		if (-1 < maxWaittime) {
			val int currentWaittime = random.nextInt(waitTimeRange + 1) + minWaittime
			try {
				Thread.sleep(currentWaittime)
			} catch (InterruptedException e) {
				trace('''User think time simulation thread interrupted: «e»''', e)
			}

		}
	}

	override String getTextInput(String msg) {
		simulateUserThinktime
		var String text = ""
		if (!concurrentStringLinkedQueue.isEmpty()) {
			text = concurrentStringLinkedQueue.poll
		} else {
			throw new IllegalStateException("No user interaction integer selection specified")
		}
		info('''«TestUserInteractor.getSimpleName()» selecteded «text»''')
		return text
	}

	override URI selectURI(String message) {
		if (concurrentURILinkedQueue.
			isEmpty()) {
			throw new IllegalStateException('''No URI found in «TestUserInteractor.getSimpleName()» for message «message»''')
		}
		val URI result = concurrentURILinkedQueue.poll
		info('''«TestUserInteractor.getSimpleName()» selected «result.toString()»''')
		return result
	}

	def boolean isResourceQueueEmpty() {
		return concurrentURILinkedQueue.isEmpty()
	}

	def Collection<String> getMessageLog() {
		return messageLog
	}
}