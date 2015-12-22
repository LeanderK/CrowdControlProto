/**
 * This class is generated by jOOQ
 */
package edu.ipd.kit.crowdcontrol.objectservice.database.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Templates extends org.jooq.impl.TableImpl<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.TemplatesRecord> {

	private static final long serialVersionUID = -45248577;

	/**
	 * The singleton instance of <code>crowdcontrol.Templates</code>
	 */
	public static final edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Templates TEMPLATES = new edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Templates();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.TemplatesRecord> getRecordType() {
		return edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.TemplatesRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Templates.idTemplates</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.TemplatesRecord, java.lang.Integer> IDTEMPLATES = createField("idTemplates", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Templates.template</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.TemplatesRecord, java.lang.String> TEMPLATE = createField("template", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * Create a <code>crowdcontrol.Templates</code> table reference
	 */
	public Templates() {
		this("Templates", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Templates</code> table reference
	 */
	public Templates(java.lang.String alias) {
		this(alias, edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Templates.TEMPLATES);
	}

	private Templates(java.lang.String alias, org.jooq.Table<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.TemplatesRecord> aliased) {
		this(alias, aliased, null);
	}

	private Templates(java.lang.String alias, org.jooq.Table<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.TemplatesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, edu.ipd.kit.crowdcontrol.objectservice.database.model.Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.TemplatesRecord> getPrimaryKey() {
		return edu.ipd.kit.crowdcontrol.objectservice.database.model.Keys.KEY_TEMPLATES_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.TemplatesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.TemplatesRecord>>asList(edu.ipd.kit.crowdcontrol.objectservice.database.model.Keys.KEY_TEMPLATES_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Templates as(java.lang.String alias) {
		return new edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Templates(alias, this);
	}

	/**
	 * Rename this table
	 */
	public edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Templates rename(java.lang.String name) {
		return new edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Templates(name, null);
	}
}
