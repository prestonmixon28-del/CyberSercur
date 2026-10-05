public class FirewallAdapter implements SecurityLog {
        private LegacyFirewall  firewall;

        public FirewallAdapter(LegacyFirewall firewall) {
            this.firewall = firewall;
        }

        @Override
        public void logEvent(String message) {
            firewall.recordActivity(message);
        }

        @Override
        public void setSeverity(String level) {
            int alertLevel = Integer.parseInt(level);
            firewall.setAlertLevel(alertLevel);
        }
    
}
