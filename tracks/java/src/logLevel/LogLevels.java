package logLevel;

/**
 * The LogLevels class provides utilities for parsing and reformating log lines.
 * It offers methods to extract specific parts of a log line, such as the
 * message and log level,
 * and to reformat the log line in a specific structure.
 */
public class LogLevels {

    /**
     * Extracts and returns the message from a log line.
     *
     * @param logLine The log line from which the message is to be extracted.
     * @return The message from the log line, trimmed of leading and trailing
     *         whitespace.
     */
    public static String message(String logLine) {
        String message = logLine.split(": ")[1];
        String messageWithoutWhiteSpace = message.trim();
        return messageWithoutWhiteSpace;
    }

    /**
     * Extracts and returns the log level from a log line.
     *
     * @param logLine The log line from which the log level is to be extracted.
     * @return The log level in lowercase.
     */
    public static String logLevel(String logLine) {
        String log = logLine.substring(logLine.indexOf('[') + 1, logLine.indexOf(']'));
        return log.toLowerCase();
    }

    /**
     * Reformats a log line into a specific structure.
     * The reformatted string will contain the log message followed by the log level
     * in parentheses.
     *
     * @param logLine The log line to be reformatted.
     * @return The reformatted log line.
     */
    public static String reformat(String logLine) {
        String reformattedString = message(logLine) + " (" + logLevel(logLine) + ")";
        return reformattedString;
    }
}
