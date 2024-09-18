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
		 * The inconsistent state.
		 */
		inconsistent,
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
	 * The error rate.
	 */
	private float errorRate;

	/**
	 * The errs.
	 */
	private int errs;

	/**
	 * The total characters.
	 */
	private int totalCharacters;

	/**
	 * The sync errs.
	 */
	private int syncErrs;

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
	 * Creates an evaluation measure for an action.
	 * 
	 * @param state           The state.
	 * @param errorRate       The error rate.
	 * @param errs            The errs.
	 * @param totalCharacters The total characters.
	 * @param syncErrs        The sync errs.
	 * @since 17
	 */
	public EvaluationMeasure(State state, float errorRate, int errs, int totalCharacters, int syncErrs) {
		super();

		this.state = state;
		this.errorRate = errorRate;
		this.errs = errs;
		this.totalCharacters = totalCharacters;
		this.syncErrs = syncErrs;
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

	/**
	 * Returns the error rate.
	 *
	 * @return The error rate.
	 * @since 17
	 */
	public float getErrorRate() {
		return errorRate;
	}

	/**
	 * Set the error rate.
	 *
	 * @param errorRate The error rate to set.
	 * @since 17
	 */
	public void setErrorRate(float errorRate) {
		this.errorRate = errorRate;
	}

	/**
	 * Returns the errs.
	 *
	 * @return The errs.
	 * @since 17
	 */
	public int getErrs() {
		return errs;
	}

	/**
	 * Set the errs.
	 *
	 * @param errs The errs to set.
	 * @since 17
	 */
	public void setErrs(int errs) {
		this.errs = errs;
	}

	/**
	 * Returns the total characters.
	 *
	 * @return The total characters.
	 * @since 17
	 */
	public int getTotalCharacters() {
		return totalCharacters;
	}

	/**
	 * Set the total characters.
	 *
	 * @param totalCharacters The total characters to set.
	 * @since 17
	 */
	public void setTotalCharacters(int totalCharacters) {
		this.totalCharacters = totalCharacters;
	}

	/**
	 * Returns the sync errs.
	 *
	 * @return The sync errs.
	 * @since 17
	 */
	public int getSyncErrs() {
		return syncErrs;
	}

	/**
	 * Set the sync errs.
	 *
	 * @param syncErrs The sync errs to set.
	 * @since 17
	 */
	public void setSyncErrs(int syncErrs) {
		this.syncErrs = syncErrs;
	}

	/**
	 * Defines measure details.
	 *
	 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
	 * @version 1.0
	 * @since 17
	 */
	public static class MeasureDetail implements Serializable {
		/**
		 * The serial version UID.
		 */
		private static final long serialVersionUID = 1L;

		/**
		 * The ground truth.
		 */
		private String groundTruth;

		/**
		 * The prediction.
		 */
		private String prediction;

		/**
		 * The count.
		 */
		private int count;

		/**
		 * The cer.
		 */
		private float cer;

		/**
		 * Default constructor for a measure detail.
		 * 
		 * @since 17
		 */
		public MeasureDetail() {
			super();
		}

		/**
		 * Creates a measure detail.
		 * 
		 * @param groundTruth The ground truth.
		 * @param prediction  The prediction.
		 * @param count       The count.
		 * @param cer         The cer.
		 * @since 17
		 */
		public MeasureDetail(String groundTruth, String prediction, int count, float cer) {
			super();
			this.groundTruth = groundTruth;
			this.prediction = prediction;
			this.count = count;
			this.cer = cer;
		}

		/**
		 * Returns the ground truth.
		 *
		 * @return The ground truth.
		 * @since 17
		 */
		public String getGroundTruth() {
			return groundTruth;
		}

		/**
		 * Set the ground truth.
		 *
		 * @param groundTruth The ground truth to set.
		 * @since 17
		 */
		public void setGroundTruth(String groundTruth) {
			this.groundTruth = groundTruth;
		}

		/**
		 * Returns the prediction.
		 *
		 * @return The prediction.
		 * @since 17
		 */
		public String getPrediction() {
			return prediction;
		}

		/**
		 * Set the prediction.
		 *
		 * @param prediction The prediction to set.
		 * @since 17
		 */
		public void setPrediction(String prediction) {
			this.prediction = prediction;
		}

		/**
		 * Returns the count.
		 *
		 * @return The count.
		 * @since 17
		 */
		public int getCount() {
			return count;
		}

		/**
		 * Set the count.
		 *
		 * @param count The count to set.
		 * @since 17
		 */
		public void setCount(int count) {
			this.count = count;
		}

		/**
		 * Returns the cer.
		 *
		 * @return The cer.
		 * @since 17
		 */
		public float getCer() {
			return cer;
		}

		/**
		 * Set the cer.
		 *
		 * @param cer The cer to set.
		 * @since 17
		 */
		public void setCer(float cer) {
			this.cer = cer;
		}

	}

}
