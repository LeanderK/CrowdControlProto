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
public class Tags implements java.io.Serializable {

	private static final long serialVersionUID = -58981063;

	private java.lang.Integer idtags;
	private java.lang.String  tag;
	private java.lang.Integer experimentT;

	public Tags() {}

	public Tags(
		java.lang.Integer idtags,
		java.lang.String  tag,
		java.lang.Integer experimentT
	) {
		this.idtags = idtags;
		this.tag = tag;
		this.experimentT = experimentT;
	}

	public java.lang.Integer getIdtags() {
		return this.idtags;
	}

	public void setIdtags(java.lang.Integer idtags) {
		this.idtags = idtags;
	}

	public java.lang.String getTag() {
		return this.tag;
	}

	public void setTag(java.lang.String tag) {
		this.tag = tag;
	}

	public java.lang.Integer getExperimentT() {
		return this.experimentT;
	}

	public void setExperimentT(java.lang.Integer experimentT) {
		this.experimentT = experimentT;
	}
}
