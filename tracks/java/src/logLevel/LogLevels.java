package logLevel;

public class LogLevels {
    
    public static String message(String logLine) {
        String message = logLine.split(": ")[1];
        String messageWithoutWhiteSpace = message.trim();
        return messageWithoutWhiteSpace;
    }

    public static String logLevel(String logLine) {
        String log = logLine.substring(logLine.indexOf('[') + 1, logLine.indexOf(']'));;
        return log.toLowerCase();
    }

    public static String reformat(String logLine) {
        String reformattedString = message(logLine) + " (" + logLevel(logLine) + ")";
        return reformattedString;
    }
}
