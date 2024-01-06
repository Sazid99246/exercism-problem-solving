package logLevel;

/**
 * The LogLevel enum represents different levels of logging severity.
 * Each log level is associated with a specific integer value to represent its
 * severity or importance.
 */
public enum LogLevel {
    /**
     * Represents fine-grained informational events
     */
    TRACE(1),
 
    /**
     * Represents general debugging information
     */
    DEBUG(2),
 
    /**
     * Represents informational messages that highlight the progress of the
     * application
     */
    INFO(4),
 
    /**
     * Represents potentially harmful situations
     */
    WARNING(5),
 
    /**
     * Represents error events that might still allow the application to continue
     * running
     */
    ERROR(6),
 
    /**
     * Represents very severe error events that will presumably lead the application
     * to abort
     */
    FATAL(42),
 
    /**
     * Represents an unknown log level
     */
    UNKNOWN(0);

    /**
     * The integer value associated with the log level.
     */
    private final Integer typeLog;

    /**
     * Constructs a new LogLevel with the specified integer value.
     *
     * @param typeLog The integer value associated with the log level.
     */
    LogLevel(Integer typeLog) {
        this.typeLog = typeLog;
    }

    /**
     * Retrieves the integer value associated with the log level.
     *
     * @return The integer value of the log level.
     */
    public Integer getTypeLog() {
        return this.typeLog;
    }
}
