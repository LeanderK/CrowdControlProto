/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.objectservice.database.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tag extends org.jooq.impl.TableImpl<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TagRecord> {

	private static final long serialVersionUID = -1300434265;

	/**
	 * The singleton instance of <code>crowdcontrol.Tag</code>
	 */
	public static final edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Tag TAG = new edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Tag();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TagRecord> getRecordType() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TagRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Tag.idTag</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TagRecord, java.lang.Integer> IDTAG = createField("idTag", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Tag.tag</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TagRecord, java.lang.String> TAG_ = createField("tag", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Tag.experiment</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TagRecord, java.lang.Integer> EXPERIMENT = createField("experiment", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>crowdcontrol.Tag</code> table reference
	 */
	public Tag() {
		this("Tag", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Tag</code> table reference
	 */
	public Tag(java.lang.String alias) {
		this(alias, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Tag.TAG);
	}

	private Tag(java.lang.String alias, org.jooq.Table<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TagRecord> aliased) {
		this(alias, aliased, null);
	}

	private Tag(java.lang.String alias, org.jooq.Table<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TagRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, edu.kit.ipd.crowdcontrol.objectservice.database.model.Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TagRecord> getPrimaryKey() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.KEY_TAG_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TagRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TagRecord>>asList(edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.KEY_TAG_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TagRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TagRecord, ?>>asList(edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.IDEXPERIMENTTAGS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Tag as(java.lang.String alias) {
		return new edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Tag(alias, this);
	}

	/**
	 * Rename this table
	 */
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Tag rename(java.lang.String name) {
		return new edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Tag(name, null);
	}
}
