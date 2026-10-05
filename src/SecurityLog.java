public interface SecurityLog {
    void logEvent(String message);
    void setSeverity(String level);
}