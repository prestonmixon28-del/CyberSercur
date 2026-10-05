public class Main {
    public static void main(String[] args) {

        AuthenticationService authService = new AuthenticationService();
        AuthorizationService authzService = new AuthorizationService();
        AuditService auditService = new AuditService();
        SessionService sessionService = new SessionService();

        String username = "testuser";
        authService.authenticate(username);
        authzService.authorize(username);
        auditService.record("User " + username + " accessed the system");
        sessionService.startSession(username);
}
}
