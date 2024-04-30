/**
 * File:     JobCoreResponse.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.communication.msa.api.domain
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     05.04.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.communication.msa.api.domain;

import java.io.Serializable;

import de.uniwuerzburg.zpd.ocr4all.application.communication.msa.job.State;

/**
 * Defines job core responses for the api.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class JobCoreResponse implements Serializable {
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The id.
	 */
	private int id;

	/**
	 * The state.
	 */
	private State state;

	/**
	 * Default constructor for a job core response for the api.
	 * 
	 * @since 17
	 */
	public JobCoreResponse() {
		super();
	}

	/**
	 * Creates a job core response for the api.
	 * 
	 * @param id    The id.
	 * @param state The state.
	 * @since 17
	 */
	public JobCoreResponse(int id, State state) {
		super();

		this.id = id;
		this.state = state;
	}

	/**
	 * Returns the id.
	 *
	 * @return The id.
	 * @since 17
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set the id.
	 *
	 * @param id The id to set.
	 * @since 17
	 */
	public void setId(int id) {
		this.id = id;
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

}
