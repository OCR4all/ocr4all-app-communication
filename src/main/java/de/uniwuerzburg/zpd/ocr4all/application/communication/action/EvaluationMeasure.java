/**
 * File:     EvaluationMeasure.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.communication.action
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     18.09.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.communication.action;

import java.io.Serializable;

/**
 * Defines evaluation measures for actions.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class EvaluationMeasure implements Serializable {
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Defines states.
	 *
	 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
	 * @version 1.0
	 * @since 1.8
	 */
	public enum State {
		/**
		 * The completed state.
		 */
		completed,
		/**
		 * The inconsistent  state.
		 */
		inconsistent ,
		/**
		 * The interrupted state.
		 */
		interrupted;
	}

	/**
	 * The state.
	 */
	private State state;

	/**
	 * The message.
	 */
	private String message;

	/**
	 * Default constructor of an evaluation measure for an action.
	 * 
	 * @since 17
	 */
	public EvaluationMeasure() {
		super();
	}

	/**
	 * Creates an evaluation measure for an action.
	 * 
	 * @param state   The state.
	 * @param message The message.
	 * @since 17
	 */
	public EvaluationMeasure(State state, String message) {
		super();
		
		this.state = state;
		this.message = message;
	}

	/**
	 * Returns the state.
	 *
	 * @return The state.
	 * @since 17
	 */
	public State getState() {
		return state;
	}

	/**
	 * Set the state.
	 *
	 * @param state The state to set.
	 * @since 17
	 */
	public void setState(State state) {
		this.state = state;
	}

	/**
	 * Returns the message.
	 *
	 * @return The message.
	 * @since 17
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Set the message.
	 *
	 * @param message The message to set.
	 * @since 17
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
