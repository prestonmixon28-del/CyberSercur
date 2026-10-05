public class LegacyFirewall {
    public void recordActivity(String message) {
        System.out.println("legacy firewall log" + message);
}

public void setAlertLevel(int level) {
        System.out.println("legacy firewall alert level set to " + level);
    }
}
