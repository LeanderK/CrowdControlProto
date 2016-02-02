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
public class ChosenAnswerQualityParam extends org.jooq.impl.TableImpl<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ChosenAnswerQualityParamRecord> {

	private static final long serialVersionUID = -1353267484;

	/**
	 * The singleton instance of <code>crowdcontrol.Chosen_Answer_Quality_Param</code>
	 */
	public static final edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ChosenAnswerQualityParam CHOSEN_ANSWER_QUALITY_PARAM = new edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ChosenAnswerQualityParam();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ChosenAnswerQualityParamRecord> getRecordType() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ChosenAnswerQualityParamRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Chosen_Answer_Quality_Param.id_Algorithm_Answer_Quality_Param_Chosen</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ChosenAnswerQualityParamRecord, java.lang.Integer> ID_ALGORITHM_ANSWER_QUALITY_PARAM_CHOSEN = createField("id_Algorithm_Answer_Quality_Param_Chosen", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Chosen_Answer_Quality_Param.value</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ChosenAnswerQualityParamRecord, java.lang.String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR.length(191).nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Chosen_Answer_Quality_Param.experiment</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ChosenAnswerQualityParamRecord, java.lang.Integer> EXPERIMENT = createField("experiment", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Chosen_Answer_Quality_Param.param</code>.
	 */
	public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ChosenAnswerQualityParamRecord, java.lang.Integer> PARAM = createField("param", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>crowdcontrol.Chosen_Answer_Quality_Param</code> table reference
	 */
	public ChosenAnswerQualityParam() {
		this("Chosen_Answer_Quality_Param", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Chosen_Answer_Quality_Param</code> table reference
	 */
	public ChosenAnswerQualityParam(java.lang.String alias) {
		this(alias, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ChosenAnswerQualityParam.CHOSEN_ANSWER_QUALITY_PARAM);
	}

	private ChosenAnswerQualityParam(java.lang.String alias, org.jooq.Table<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ChosenAnswerQualityParamRecord> aliased) {
		this(alias, aliased, null);
	}

	private ChosenAnswerQualityParam(java.lang.String alias, org.jooq.Table<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ChosenAnswerQualityParamRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, edu.kit.ipd.crowdcontrol.objectservice.database.model.Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ChosenAnswerQualityParamRecord, java.lang.Integer> getIdentity() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.IDENTITY_CHOSEN_ANSWER_QUALITY_PARAM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ChosenAnswerQualityParamRecord> getPrimaryKey() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.KEY_CHOSEN_ANSWER_QUALITY_PARAM_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ChosenAnswerQualityParamRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ChosenAnswerQualityParamRecord>>asList(edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.KEY_CHOSEN_ANSWER_QUALITY_PARAM_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ChosenAnswerQualityParamRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ChosenAnswerQualityParamRecord, ?>>asList(edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.ANSWERQUALITYPARAMREFEXPERIMENT, edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.CHOSENANSWERQUALITYPARAM);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ChosenAnswerQualityParam as(java.lang.String alias) {
		return new edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ChosenAnswerQualityParam(alias, this);
	}

	/**
	 * Rename this table
	 */
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ChosenAnswerQualityParam rename(java.lang.String name) {
		return new edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.ChosenAnswerQualityParam(name, null);
	}
}
