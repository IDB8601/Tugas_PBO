interface NotificationSender {
    void send(String message);
}

class EmailSender implements NotificationSender {
    public void send(String message) {
        System.out.println("Mengirim Email: " + message);
    }
}

class SMSSender implements NotificationSender {
    public void send(String message) {
        System.out.println("Mengirim SMS: " + message);
    }
}

class WhatsAppSender implements NotificationSender {
    public void send(String message) {
        System.out.println("Mengirim WhatsApp: " + message);
    }
}

public class Case1 {
    public static void main(String[] args) {
        NotificationSender email = new EmailSender();
        NotificationSender sms = new SMSSender();
        NotificationSender wa = new WhatsAppSender();

        email.send("Halo, ini email test!");
        sms.send("Ini SMS test!");
        wa.send("Ini pesan WhatsApp test!");
    }
}