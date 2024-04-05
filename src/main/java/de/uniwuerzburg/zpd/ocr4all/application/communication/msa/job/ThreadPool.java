/**
 * File:     ThreadPool.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.communication.msa.job
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     05.04.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.communication.msa.job;

/**
 * Defines thread pools.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 1.8
 */
public enum ThreadPool {
	/**
	 * The standard thread pool.
	 */
	standard("std"),
	/**
	 * The time-consuming thread pool.
	 */
	timeConsuming("tc");

	/**
	 * The label.
	 */
	private final String label;

	/**
	 * Creates a thread pool.
	 * 
	 * @param label The label.
	 * @since 1.8
	 */
	private ThreadPool(String label) {
		this.label = label;
	}

	/**
	 * Returns the label.
	 *
	 * @return The label.
	 * @since 1.8
	 */
	public String getLabel() {
		return label;
	}
}
