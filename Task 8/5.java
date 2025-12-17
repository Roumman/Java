interface Notifier {
    void send(String message);
}

class EmailNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SmsNotifier implements Notifier {
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class NotificationService {
    private Notifier notifier;
    
    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }
    
    public void notify(String message) {
        notifier.send(message);
    }
}
