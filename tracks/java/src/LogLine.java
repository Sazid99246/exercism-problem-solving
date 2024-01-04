import logLevel.LogLevel;

public class LogLine {
    String logLine;
    public LogLine(String logLine) {
        this.logLine = logLine;
    }
    public LogLevel getLogLevel() {
        String strLog = this.logLine.substring(1, 4);
        switch (strLog){
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
    public String getOutputForShortLog() {
         String strLog = this.logLine.substring(7);
        LogLevel logLvlType = this.getLogLevel();
        return logLvlType.getTypeLog() + ":" + String.valueOf(strLog);
    }
}
