/**
 * File:     SystemJobResponse.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.communication.msa.api.domain
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     05.04.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.communication.msa.api.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.uniwuerzburg.zpd.ocr4all.application.communication.msa.job.State;

/**
 * Defines system job responses for the api.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class SystemJobResponse extends JobCoreResponse {
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The system process standard output.
	 */
	@JsonProperty("standard-output")
	private final String standardOutput;

	/**
	 * The system process standard error.
	 */
	@JsonProperty("standard-error")
	private final String standardError;

	/**
	 * The exit value. By convention, the value 0 indicates normal termination. -1
	 * if the exit value is not set.
	 */
	@JsonProperty("exit-value")
	private final int exitValue;

	/**
	 * Creates a system job response for the api.
	 * 
	 * @param id    The id.
	 * @param state The state.
	 * @since 17
	 */
	public SystemJobResponse(int id, State state, String standardOutput, String standardError, int exitValue) {
		super(id, state);

		this.standardOutput = standardOutput;
		this.standardError = standardError;
		this.exitValue = exitValue;
	}

	/**
	 * Returns the system process standard output.
	 *
	 * @return The system process standard output.
	 * @since 1.8
	 */
	public String getStandardOutput() {
		return standardOutput;
	}

	/**
	 * Returns the system process standard error.
	 *
	 * @return The system process standard error.
	 * @since 1.8
	 */
	public String getStandardError() {
		return standardError;
	}

	/**
	 * Returns the exit value. By convention, the value 0 indicates normal
	 * termination. -1 if the exit value is not set.
	 *
	 * @return The exit value.
	 * @since 1.8
	 */
	public int getExitValue() {
		return exitValue;
	}

}
