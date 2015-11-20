/**
 * This class is generated by jOOQ
 */
package edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Experiment implements java.io.Serializable {

	private static final long serialVersionUID = 1885636715;

	private java.lang.Integer idexperiment;
	private java.lang.String  pictureUrl;
	private java.lang.String  pictureLicenseUrl;
	private java.lang.String  question;
	private java.lang.String  ratingOptions;
	private java.lang.String  titel;
	private java.lang.Integer maxRatingsPerAssignment;
	private java.lang.Integer maxAnswersPerAssignment;

	public Experiment() {}

	public Experiment(
		java.lang.Integer idexperiment,
		java.lang.String  pictureUrl,
		java.lang.String  pictureLicenseUrl,
		java.lang.String  question,
		java.lang.String  ratingOptions,
		java.lang.String  titel,
		java.lang.Integer maxRatingsPerAssignment,
		java.lang.Integer maxAnswersPerAssignment
	) {
		this.idexperiment = idexperiment;
		this.pictureUrl = pictureUrl;
		this.pictureLicenseUrl = pictureLicenseUrl;
		this.question = question;
		this.ratingOptions = ratingOptions;
		this.titel = titel;
		this.maxRatingsPerAssignment = maxRatingsPerAssignment;
		this.maxAnswersPerAssignment = maxAnswersPerAssignment;
	}

	public java.lang.Integer getIdexperiment() {
		return this.idexperiment;
	}

	public void setIdexperiment(java.lang.Integer idexperiment) {
		this.idexperiment = idexperiment;
	}

	public java.lang.String getPictureUrl() {
		return this.pictureUrl;
	}

	public void setPictureUrl(java.lang.String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public java.lang.String getPictureLicenseUrl() {
		return this.pictureLicenseUrl;
	}

	public void setPictureLicenseUrl(java.lang.String pictureLicenseUrl) {
		this.pictureLicenseUrl = pictureLicenseUrl;
	}

	public java.lang.String getQuestion() {
		return this.question;
	}

	public void setQuestion(java.lang.String question) {
		this.question = question;
	}

	public java.lang.String getRatingOptions() {
		return this.ratingOptions;
	}

	public void setRatingOptions(java.lang.String ratingOptions) {
		this.ratingOptions = ratingOptions;
	}

	public java.lang.String getTitel() {
		return this.titel;
	}

	public void setTitel(java.lang.String titel) {
		this.titel = titel;
	}

	public java.lang.Integer getMaxRatingsPerAssignment() {
		return this.maxRatingsPerAssignment;
	}

	public void setMaxRatingsPerAssignment(java.lang.Integer maxRatingsPerAssignment) {
		this.maxRatingsPerAssignment = maxRatingsPerAssignment;
	}

	public java.lang.Integer getMaxAnswersPerAssignment() {
		return this.maxAnswersPerAssignment;
	}

	public void setMaxAnswersPerAssignment(java.lang.Integer maxAnswersPerAssignment) {
		this.maxAnswersPerAssignment = maxAnswersPerAssignment;
	}
}
