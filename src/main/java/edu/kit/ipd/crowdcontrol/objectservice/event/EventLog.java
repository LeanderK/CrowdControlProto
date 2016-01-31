package edu.kit.ipd.crowdcontrol.objectservice.event;

import java.util.LinkedList;
import java.util.List;

/**
 * Can be used to create a stack of messages from a event subscriber.
 * @author MarcelHollerbach
 * @version 0.1
 */
public class EventLog {
    private String name;
    private List<LogEntry> logs;

    /**
     * Create a new Log
     */
    public EventLog() {
        logs = new LinkedList<>();
        name = "";
    }

    /**
     * Get the name of the subscriber
     *
     * @return name of the subscriber
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the subscriber
     *
     * The name will be later used to show which subscriber added the messages
     *
     * @param name name of the subscriber
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Add a new message to this stack
     * @param shortmessage a short explanation on what this message is about. No linebreaks allowed.
     * @param logmessage detailed message what happends exactly. Linebreaks allowed.
     */
    public void addEntry(String shortmessage, String logmessage) {
        logs.add(new LogEntry(shortmessage, logmessage));
    }

    /**
     * Internal class to abstract a log entry
     */
    private class LogEntry {
        private final String shortmessage;
        private final String longmessage;

        private LogEntry(String shortmessage, String longmessage) {
            this.shortmessage = shortmessage;
            this.longmessage = longmessage;
        }

        @Override
        public String toString() {
            return shortmessage+"\n"+longmessage;
        }
    }

    @Override
    public String toString() {
        String msg = "";

        for (LogEntry logEntry : logs) {
            msg += (!getName().isEmpty() ? getName()+" : " : "") +logEntry.toString()+"\n";
        }
        return msg;
    }
}
