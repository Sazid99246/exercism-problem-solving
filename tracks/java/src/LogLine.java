import logLevel.LogLevel;

/**
 * The LogLine class represents a single log line and provides functionality
 * to extract specific information from it, such as the log level and the
 * message.
 */
public class LogLine {
    String logLine;

    /**
     * Constructs a LogLine instance with the provided log line string.
     *
     * @param logLine The complete log line string.
     */
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    /**
     * Extracts and returns the log level from the log line.
     * The log level is identified by a specific code within the log line.
     *
     * @return The LogLevel enum corresponding to the log level in the log line.
     */
    public LogLevel getLogLevel() {
        String strLog = this.logLine.substring(1, 4);
        switch (strLog) {
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }

    /**
     * Generates a short format of the log line, containing only the log level and
     * the message.
     * 
     * @return A string in the format "LogLevel: Message".
     */
    public String getOutputForShortLog() {
        String strLog = this.logLine.substring(7);
        LogLevel logLvlType = this.getLogLevel();
        return logLvlType.getTypeLog() + ":" + strLog;
    }
}
