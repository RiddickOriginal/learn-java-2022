package org.irbis.lesson5;

public class EmailNotificationService implements NotificationService {
    private String message;
    private String email;

    public EmailNotificationService(String message, String email) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void doNotify() {
        System.out.println("'" + message + "' отправлено по адресу " + email);
    }

    @Override
    public String getUserId() {
        return email;
    }
}
