/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.daos;

import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Task;
import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TaskRecord;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TaskDao extends org.jooq.impl.DAOImpl<TaskRecord, Task, java.lang.Integer> {

	/**
	 * Create a new TaskDao without any configuration
	 */
	public TaskDao() {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK, Task.class);
	}

	/**
	 * Create a new TaskDao with an attached configuration
	 */
	public TaskDao(org.jooq.Configuration configuration) {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK, Task.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(Task object) {
		return object.getIdtask();
	}

	/**
	 * Fetch records that have <code>idTask IN (values)</code>
	 */
	public java.util.List<Task> fetchByIdtask(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK.IDTASK, values);
	}

	/**
	 * Fetch a unique record that has <code>idTask = value</code>
	 */
	public Task fetchOneByIdtask(java.lang.Integer value) {
		return fetchOne(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK.IDTASK, value);
	}

	/**
	 * Fetch records that have <code>experiment IN (values)</code>
	 */
	public java.util.List<Task> fetchByExperiment(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK.EXPERIMENT, values);
	}

	/**
	 * Fetch records that have <code>running IN (values)</code>
	 */
	public java.util.List<Task> fetchByRunning(java.lang.Boolean... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK.RUNNING, values);
	}

	/**
	 * Fetch records that have <code>platform_data IN (values)</code>
	 */
	public java.util.List<Task> fetchByPlatformData(java.lang.String... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK.PLATFORM_DATA, values);
	}

	/**
	 * Fetch records that have <code>crowd_platform IN (values)</code>
	 */
	public java.util.List<Task> fetchByCrowdPlatform(java.lang.String... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Task.TASK.CROWD_PLATFORM, values);
	}
}
