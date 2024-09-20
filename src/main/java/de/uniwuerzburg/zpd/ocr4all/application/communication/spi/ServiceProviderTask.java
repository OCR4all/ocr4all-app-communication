/**
 * File:     ServiceProviderTask.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.communication.action
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     18.09.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.communication.spi;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines service provider tasks.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class ServiceProviderTask implements Serializable {
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
		 * the task was carried out without problems
		 */
		completed,
		/**
		 * The task was carried out with problems
		 */
		inconsistent,
		/**
		 * the task was canceled during execution
		 */
		canceled,
		/**
		 * the task was interrupted due to failures
		 */
		interrupted;
	}

	/**
	 * The state.
	 */
	private State state;

	/**
	 * The throwable and its backtrace stack trace that indicates conditions that an
	 * application might want to examine.
	 */
	@JsonProperty("stack-trace")
	private String stackTrace;

	/**
	 * The task standard output.
	 */
	@JsonProperty("standard-output")
	private String standardOutput;

	/**
	 * The task standard error.
	 */
	@JsonProperty("standard-error")
	private String standardError;

	/**
	 * Default constructor of an evaluation measure for an action.
	 * 
	 * @since 17
	 */
	public ServiceProviderTask() {
		super();
	}

	/**
	 * Creates a service provider task.
	 * 
	 * @param state The state.
	 * @since 17
	 */
	public ServiceProviderTask(State state) {
		this(state, null, null, null);
	}

	/**
	 * Creates a service provider task.
	 * 
	 * @param state      The state.
	 * @param stackTrace The throwable and its backtrace stack trace that indicates
	 *                   conditions that an application might want to examine.
	 * @since 17
	 */
	public ServiceProviderTask(State state, String stackTrace) {
		super();

		this.state = state;
		this.stackTrace = stackTrace;

		standardOutput = null;
		standardError = null;

	}

	/**
	 * Creates a service provider task.
	 * 
	 * @param state     The state.
	 * @param exception The exception.
	 * @since 17
	 */
	public ServiceProviderTask(State state, Exception exception) {
		this(state, exception, null, null);
	}

	/**
	 * Creates a service provider task.
	 * 
	 * @param state          The state.
	 * @param standardOutput The task standard output.
	 * @param standardError  The task standard error.
	 * @since 17
	 */
	public ServiceProviderTask(State state, String standardOutput, String standardError) {
		this(state, null, standardOutput, standardError);
	}

	/**
	 * Creates a service provider task
	 * 
	 * @param state          The state.
	 * @param exception      The exception.
	 * @param standardOutput The task standard output.
	 * @param standardError  The task standard error.
	 * @since 17
	 */
	public ServiceProviderTask(State state, Exception exception, String standardOutput, String standardError) {
		super();

		this.state = state;
		setStackTrace(exception);
		this.standardOutput = standardOutput;
		this.standardError = standardError;
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
	 * Returns the throwable and its backtrace stack trace that indicates conditions
	 * that an application might want to examine.
	 *
	 * @return The stack trace.
	 * @since 17
	 */
	public String getStackTrace() {
		return stackTrace;
	}

	/**
	 * Set the throwable and its backtrace stack trace that indicates conditions
	 * that an application might want to examine.
	 *
	 * @param stackTrace The stack trace to set.
	 * @since 17
	 */
	public void setStackTrace(String stackTrace) {
		this.stackTrace = stackTrace;
	}

	/**
	 * Set the throwable and its backtrace stack trace that indicates conditions
	 * that an application might want to examine.
	 * 
	 * @param e The exception.
	 * @since 17
	 */
	private void setStackTrace(Exception e) {
		if (e == null)
			stackTrace = null;
		else {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);

			setStackTrace(pw.toString());
		}
	}

	/**
	 * Returns the task standard output.
	 *
	 * @return The task standard output.
	 * @since 17
	 */
	public String getStandardOutput() {
		return standardOutput;
	}

	/**
	 * Set the task standard output.
	 *
	 * @param standardOutput The standard output to set.
	 * @since 17
	 */
	public void setStandardOutput(String standardOutput) {
		this.standardOutput = standardOutput;
	}

	/**
	 * Returns the task standard error.
	 *
	 * @return The task standard error.
	 * @since 17
	 */
	public String getStandardError() {
		return standardError;
	}

	/**
	 * Set the task standard error.
	 *
	 * @param standardError The standard error to set.
	 * @since 17
	 */
	public void setStandardError(String standardError) {
		this.standardError = standardError;
	}

}
