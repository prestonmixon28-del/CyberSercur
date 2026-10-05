public class Main {
    public static void main(String[] args) {

        LegacyFirewall oldFirewall = new LegacyFirewall();

        FirewallAdapter log = new FirewallAdapter(oldFirewall);
        log.logEvent("Test event");
        log.setSeverity("3");
}
}
