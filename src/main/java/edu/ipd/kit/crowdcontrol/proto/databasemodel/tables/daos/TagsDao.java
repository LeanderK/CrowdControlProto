/**
 * This class is generated by jOOQ
 */
package edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TagsDao extends org.jooq.impl.DAOImpl<edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.records.TagsRecord, edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.pojos.Tags, java.lang.Integer> {

	/**
	 * Create a new TagsDao without any configuration
	 */
	public TagsDao() {
		super(edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Tags.TAGS, edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.pojos.Tags.class);
	}

	/**
	 * Create a new TagsDao with an attached configuration
	 */
	public TagsDao(org.jooq.Configuration configuration) {
		super(edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Tags.TAGS, edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.pojos.Tags.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.pojos.Tags object) {
		return object.getIdtags();
	}

	/**
	 * Fetch records that have <code>idTags IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.pojos.Tags> fetchByIdtags(java.lang.Integer... values) {
		return fetch(edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Tags.TAGS.IDTAGS, values);
	}

	/**
	 * Fetch a unique record that has <code>idTags = value</code>
	 */
	public edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.pojos.Tags fetchOneByIdtags(java.lang.Integer value) {
		return fetchOne(edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Tags.TAGS.IDTAGS, value);
	}

	/**
	 * Fetch records that have <code>tag IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.pojos.Tags> fetchByTag(java.lang.String... values) {
		return fetch(edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Tags.TAGS.TAG, values);
	}

	/**
	 * Fetch records that have <code>experiment_t IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.pojos.Tags> fetchByExperimentT(java.lang.Integer... values) {
		return fetch(edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Tags.TAGS.EXPERIMENT_T, values);
	}
}
