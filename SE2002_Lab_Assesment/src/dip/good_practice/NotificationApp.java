class GmailService implements MessageService{
    public void send(String msg) { System.out.println("Gmail: " + msg); }
}

public class NotificationApp {
    // Violation: Tight coupling to a specific implementation
    private MessageService service;

    public NotificationApp(MessageService service){
        this.service=service;

    }

    public void notify(String message) {
        service.send(message);
    }
}