/**
 * File:     JobResponse.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.communication.msa.api.domain
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     14.03.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.communication.msa.api.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.uniwuerzburg.zpd.ocr4all.application.communication.msa.job.State;
import de.uniwuerzburg.zpd.ocr4all.application.communication.msa.job.ThreadPool;

/**
 * Defines job responses for the api.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class JobResponse extends JobCoreResponse  {
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The created time.
	 */
	@JsonProperty("created-time")
	private final Date created;

	/**
	 * The start time.
	 */
	@JsonProperty("start-time")
	private final Date start;

	/**
	 * The end time.
	 */
	@JsonProperty("end-time")
	private final Date end;

	/**
	 * The thread pool.
	 */
	@JsonProperty("thread-pool")
	private final ThreadPool threadPool;

	/**
	 * The key.
	 */
	private final String key;

	/**
	 * The description.
	 */
	private final String description;

	/**
	 * The message.
	 */
	private final String message;

	/**
	 * Creates a job response for the api.
	 * 
	 * @param id          The id.
	 * @param state       The state.
	 * @param created     The created time.
	 * @param start       The start time.
	 * @param end         The end time.
	 * @param threadPool  The thread pool.
	 * @param key         The key.
	 * @param description The description.
	 * @param message     The message.
	 * @since 17
	 */
	public JobResponse(int id, State state, Date created, Date start, Date end, ThreadPool threadPool, String key,
			String description, String message) {
		super(id, state);
		
		this.created = created;
		this.start = start;
		this.end = end;
		this.threadPool = threadPool;
		this.key = key;
		this.description = description;
		this.message = message;
	}

	/**
	 * Returns the created time.
	 *
	 * @return The created time.
	 * @since 17
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * Returns the start time.
	 *
	 * @return The start time.
	 * @since 17
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * Returns the end time.
	 *
	 * @return The end time.
	 * @since 17
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * Returns the thread pool.
	 *
	 * @return The thread pool.
	 * @since 17
	 */
	public ThreadPool getThreadPool() {
		return threadPool;
	}

	/**
	 * Returns the key.
	 *
	 * @return The key.
	 * @since 17
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Returns the description.
	 *
	 * @return The description.
	 * @since 17
	 */
	public String getDescription() {
		return description;
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

}
