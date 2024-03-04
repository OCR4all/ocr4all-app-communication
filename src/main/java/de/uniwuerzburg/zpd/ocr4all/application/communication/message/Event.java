/**
 * File:     Event.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.communication.message
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     04.03.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.communication.message;

import java.time.ZonedDateTime;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.ZonedDateTimeSerializer;

/**
 * Defines events.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class Event<T extends Enum<?>, K, M extends Message> {
	/**
	 * The type.
	 */
	private final T type;

	/**
	 * The key.
	 */
	private final K key;

	/**
	 * The message.
	 */
	private final M message;

	/**
	 * The creation time.
	 */
	private final ZonedDateTime createdAt;

	/**
	 * Default constructor for an event with current creation time.
	 * 
	 * @since 17
	 */
	public Event() {
		this(null, null, null);
	}

	/**
	 * Creates an event with current creation time.
	 * 
	 * @param type    The type.
	 * @param key     The key.
	 * @param message The message.
	 * @since 17
	 */
	public Event(T type, K key, M message) {
		super();

		this.type = type;
		this.key = key;
		this.message = message;

		this.createdAt = ZonedDateTime.now();
	}

	/**
	 * Returns the type.
	 *
	 * @return The type.
	 * @since 17
	 */
	public T getType() {
		return type;
	}

	/**
	 * Returns the key.
	 *
	 * @return The key.
	 * @since 17
	 */
	public K getKey() {
		return key;
	}

	/**
	 * Returns the message.
	 *
	 * @return The message.
	 * @since 17
	 */
	public M getMessage() {
		return message;
	}

	/**
	 * Returns the creation time.
	 * 
	 * @return The creation time.
	 * @since 17
	 */
	@JsonSerialize(using = ZonedDateTimeSerializer.class)
	public ZonedDateTime getCreatedAt() {
		return createdAt;
	}
}
