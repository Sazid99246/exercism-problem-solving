package logLevel;

/**
 * The LogLevel enum represents different levels of logging severity.
 * Each log level is associated with a specific integer value to represent its
 * severity or importance.
 */
public enum LogLevel {
    TRACE(1), // Represents fine-grained informational events
    DEBUG(2), // Represents general debugging information
    INFO(4), // Represents informational messages that highlight the progress of the
             // application
    WARNING(5), // Represents potentially harmful situations
    ERROR(6), // Represents error events that might still allow the application to continue
              // running
    FATAL(42), // Represents very severe error events that will presumably lead the application
               // to abort
    UNKNOWN(0); // Represents an unknown log level

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
