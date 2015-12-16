package edu.ipd.kit.crowdcontrol.objectservice.database.operations;

import edu.ipd.kit.crowdcontrol.objectservice.database.model.Tables;
import edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.ExperimentRecord;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;

import java.util.Optional;

/**
 * responsible for the CRUD operations on the Experiment
 * @author LeanderK
 * @version 1.0
 */
public class ExperimentOperations extends AbstractOperation {
    protected ExperimentOperations(DSLContext create) {
        super(create);
    }

    /**
     * inserts the Experiment into the database
     * @param experimentRecord the record to insert
     * @return the resulting id of the experiment
     */
    public int insertNewExperiment(ExperimentRecord experimentRecord) {
        return create.executeInsert(experimentRecord);
    }

    /**
     * returns the experiment corresponding to the id
     * @param id the id
     * @return the optional experiment
     */
    public Optional<ExperimentRecord> getExperiment(int id) {
        return create.selectFrom(Tables.EXPERIMENT)
                .where(Tables.EXPERIMENT.IDEXPERIMENT.eq(id))
                .fetchOptional();
    }

    /**
     * updates the experiment and returns whether it was successful
     * @param experimentRecord the record to update
     * @return true if successful, false if not
     */
    public boolean updateExperiment(ExperimentRecord experimentRecord) {
        return doIfNotRunning(experimentRecord.getIdexperiment(), trans ->
                DSL.using(trans).executeUpdate(experimentRecord) == 1);
    }

    /**
     * deletes the experiment with the passed id if it is not running.
     * @param id the id of the experiment to delete
     * @return true if deleted, false if not
     * @throws IllegalArgumentException if the experiment is running
     */
    public boolean deleteExperiment(int id) throws IllegalArgumentException {
        return doIfNotRunning(id, trans -> {
            int deleted = DSL.using(trans)
                    .deleteFrom(Tables.EXPERIMENT)
                    .where(Tables.EXPERIMENT.IDEXPERIMENT.eq(id))
                    .execute();
            return deleted == 1;
        });
    }
}
