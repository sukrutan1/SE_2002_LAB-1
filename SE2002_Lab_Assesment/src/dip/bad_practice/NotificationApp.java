class GmailService {
    public void send(String msg) { System.out.println("Gmail: " + msg); }
}

public class NotificationApp {
    // Violation: Tight coupling to a specific implementation
    private GmailService gmail = new GmailService();

    public void notify(String message) {
        gmail.send(message);
    }
}