package enums;

public enum LogLevel {
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42),
    UNKNOWN(0);
    private final Integer typeLog;
    LogLevel(Integer typeLog){
        this.typeLog = typeLog;
    }
    public Integer getTypeLog(){
        return this.typeLog;
    }
}
