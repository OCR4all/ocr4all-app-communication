/**
 * File:     State.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.communication.msa.job
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     05.04.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.communication.msa.job;

/**
 * Defines job states.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 1.8
 */
public enum State {
	/**
	 * The initialized state.
	 */
	initialized,
	/**
	 * The scheduled state.
	 */
	scheduled,
	/**
	 * The running state.
	 */
	running,
	/**
	 * The completed state.
	 */
	completed,
	/**
	 * The canceled state.
	 */
	canceled,
	/**
	 * The interrupted state.
	 */
	interrupted;

	/**
	 * Returns true if the job is done.
	 * 
	 * @return True if the job is done.
	 * @since 17
	 */
	public boolean isDone() {
		switch (this) {
		case canceled:
		case completed:
		case interrupted:
			return true;
		default:
			return false;
		}
	}
}
