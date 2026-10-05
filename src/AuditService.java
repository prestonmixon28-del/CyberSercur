public class AuditService {
    
    public void record(String message) {
        System.out.println("Recording audit event: " + message);
    }
}
