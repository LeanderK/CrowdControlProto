/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.objectservice.database.model;

import edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.*;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Crowdcontrol extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -1263048633;

	/**
	 * The singleton instance of <code>crowdcontrol</code>
	 */
	public static final Crowdcontrol CROWDCONTROL = new Crowdcontrol();

	/**
	 * No further instances allowed
	 */
	private Crowdcontrol() {
		super("crowdcontrol");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			Answer.ANSWER,
			Constraint.CONSTRAINT,
			Experiment.EXPERIMENT,
			Experimentspopulation.EXPERIMENTSPOPULATION,
			Giftcode.GIFTCODE,
			Notification.NOTIFICATION,
			Payment.PAYMENT,
			Platform.PLATFORM,
			Population.POPULATION,
			Populationansweroption.POPULATIONANSWEROPTION,
			Populationresult.POPULATIONRESULT,
			Rating.RATING,
			Tag.TAG,
			Task.TASK,
			Template.TEMPLATE,
			Worker.WORKER);
	}
}
