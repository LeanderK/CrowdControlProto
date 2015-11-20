/**
 * This class is generated by jOOQ
 */
package edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TagsRecord extends org.jooq.impl.UpdatableRecordImpl<edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.records.TagsRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = 1555060094;

	/**
	 * Setter for <code>crowdcontrolproto.Tags.idTags</code>.
	 */
	public void setIdtags(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrolproto.Tags.idTags</code>.
	 */
	public java.lang.Integer getIdtags() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrolproto.Tags.tag</code>.
	 */
	public void setTag(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrolproto.Tags.tag</code>.
	 */
	public java.lang.String getTag() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrolproto.Tags.experiment_t</code>.
	 */
	public void setExperimentT(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrolproto.Tags.experiment_t</code>.
	 */
	public java.lang.Integer getExperimentT() {
		return (java.lang.Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Tags.TAGS.IDTAGS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Tags.TAGS.TAG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Tags.TAGS.EXPERIMENT_T;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdtags();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getTag();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getExperimentT();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TagsRecord value1(java.lang.Integer value) {
		setIdtags(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TagsRecord value2(java.lang.String value) {
		setTag(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TagsRecord value3(java.lang.Integer value) {
		setExperimentT(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TagsRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.Integer value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TagsRecord
	 */
	public TagsRecord() {
		super(edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Tags.TAGS);
	}

	/**
	 * Create a detached, initialised TagsRecord
	 */
	public TagsRecord(java.lang.Integer idtags, java.lang.String tag, java.lang.Integer experimentT) {
		super(edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Tags.TAGS);

		setValue(0, idtags);
		setValue(1, tag);
		setValue(2, experimentT);
	}
}
