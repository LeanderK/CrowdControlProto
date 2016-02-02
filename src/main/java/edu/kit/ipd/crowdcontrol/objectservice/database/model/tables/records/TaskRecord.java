/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TaskRecord extends org.jooq.impl.UpdatableRecordImpl<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TaskRecord> implements org.jooq.Record6<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.TaskStatus, edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.TaskStopgap> {

	private static final long serialVersionUID = 130529033;

	/**
	 * Setter for <code>crowdcontrol.Task.id_task</code>.
	 */
	public void setIdTask(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Task.id_task</code>.
	 */
	public java.lang.Integer getIdTask() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.Task.experiment</code>.
	 */
	public void setExperiment(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Task.experiment</code>.
	 */
	public java.lang.Integer getExperiment() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.Task.platform_data</code>.
	 */
	public void setPlatformData(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Task.platform_data</code>.
	 */
	public java.lang.String getPlatformData() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>crowdcontrol.Task.crowd_platform</code>.
	 */
	public void setCrowdPlatform(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Task.crowd_platform</code>.
	 */
	public java.lang.String getCrowdPlatform() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>crowdcontrol.Task.status</code>.
	 */
	public void setStatus(edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.TaskStatus value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Task.status</code>.
	 */
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.TaskStatus getStatus() {
		return (edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.TaskStatus) getValue(4);
	}

	/**
	 * Setter for <code>crowdcontrol.Task.stopgap</code>.
	 */
	public void setStopgap(edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.TaskStopgap value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Task.stopgap</code>.
	 */
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.TaskStopgap getStopgap() {
		return (edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.TaskStopgap) getValue(5);
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
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.TaskStatus, edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.TaskStopgap> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.TaskStatus, edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.TaskStopgap> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK.ID_TASK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK.EXPERIMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK.PLATFORM_DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK.CROWD_PLATFORM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.TaskStatus> field5() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.TaskStopgap> field6() {
		return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK.STOPGAP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdTask();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getExperiment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getPlatformData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getCrowdPlatform();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.TaskStatus value5() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.TaskStopgap value6() {
		return getStopgap();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TaskRecord value1(java.lang.Integer value) {
		setIdTask(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TaskRecord value2(java.lang.Integer value) {
		setExperiment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TaskRecord value3(java.lang.String value) {
		setPlatformData(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TaskRecord value4(java.lang.String value) {
		setCrowdPlatform(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TaskRecord value5(edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.TaskStatus value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TaskRecord value6(edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.TaskStopgap value) {
		setStopgap(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TaskRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.String value3, java.lang.String value4, edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.TaskStatus value5, edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.TaskStopgap value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TaskRecord
	 */
	public TaskRecord() {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK);
	}

	/**
	 * Create a detached, initialised TaskRecord
	 */
	public TaskRecord(java.lang.Integer idTask, java.lang.Integer experiment, java.lang.String platformData, java.lang.String crowdPlatform, edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.TaskStatus status, edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.TaskStopgap stopgap) {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK);

		setValue(0, idTask);
		setValue(1, experiment);
		setValue(2, platformData);
		setValue(3, crowdPlatform);
		setValue(4, status);
		setValue(5, stopgap);
	}
}
