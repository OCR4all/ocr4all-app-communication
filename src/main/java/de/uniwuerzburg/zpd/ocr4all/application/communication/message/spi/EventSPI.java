/**
 * File:     EventSPI.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.communication.message.spi
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     04.03.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.communication.message.spi;

import de.uniwuerzburg.zpd.ocr4all.application.communication.message.Event;
import de.uniwuerzburg.zpd.ocr4all.application.communication.message.Message;

/**
 * Defines events for spi.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class EventSPI extends Event<EventSPI.Type, String, Message> {
	/**
	 * Defines types.
	 *
	 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
	 * @version 1.0
	 * @since 17
	 */
	public enum Type {
		/**
		 * The process was scheduled.
		 */
		scheduled,
		/**
		 * The process is running.
		 */
		running,
		/**
		 * the process was carried out without problems.
		 */
		completed,
		/**
		 * the process was aborted during execution.
		 */
		canceled,
		/**
		 * the process was interrupted due to failures.
		 */
		interrupted
	}

	/**
	 * Default constructor for an event for spi with current creation time.
	 * 
	 * @since 17
	 */
	public EventSPI() {
		super();
	}

	/**
	 * Creates an event for spi with current creation time.
	 * 
	 * @param type    The type.
	 * @param key     The key.
	 * @param message The message.
	 * @since 17
	 */
	public EventSPI(Type type, String key, Message message) {
		super(type, key, message);
	}

}
