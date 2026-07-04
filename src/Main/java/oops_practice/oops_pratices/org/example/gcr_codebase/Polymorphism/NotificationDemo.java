package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Polymorphism;

class Notification {

    String recipientName;
    String message;

    public Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    public void sendNotification() {
        System.out.println("Sending Notification...");
    }
}

class EmailNotification extends Notification {

    public EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Email sent to " + recipientName);
        System.out.println("Message: " + message);
    }
}

class SMSNotification extends Notification {

    public SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("SMS sent to " + recipientName);
        System.out.println("Message: " + message);
    }
}

class PushNotification extends Notification {

    public PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Push Notification sent to " + recipientName);
        System.out.println("Message: " + message);
    }
}

public class NotificationDemo {

    public static void main(String[] args) {

        Notification[] notifications = {
                new EmailNotification("Nitin", "Your order has been shipped."),
                new SMSNotification("Rahul", "Your OTP is 456789."),
                new PushNotification("Priya", "You have a new friend request."),
                new EmailNotification("Aman", "Welcome to our service!")
        };

        System.out.println("Sent Notifications:\n");

        for (Notification notification : notifications) {
            notification.sendNotification();   // Dynamic Method Dispatch
            System.out.println();
        }
    }
}