/**
 * File:     Message.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.communication.message
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     04.03.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.communication.message;

/**
 * Defines messages.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class Message {
	/**
	 * The content.
	 */
	private final String content;

	/**
	 * Default constructor for a message.
	 * 
	 * @since 17
	 */
	public Message() {
		this(null);
	}

	/**
	 * Creates a message.
	 * 
	 * @param content The content.
	 * @since 17
	 */
	public Message(String content) {
		super();

		this.content = content;
	}

	/**
	 * Returns the content.
	 *
	 * @return The content.
	 * @since 17
	 */
	public String getContent() {
		return content;
	}

}
