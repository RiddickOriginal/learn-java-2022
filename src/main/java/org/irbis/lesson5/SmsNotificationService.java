package org.irbis.lesson5;

public class SmsNotificationService implements NotificationService{
    private String message;
    private String phoneNumber;

    public SmsNotificationService(String message, String phoneNumber) {
        this.message = message;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void doNotify() {
        System.out.println("'" + message + "' отправлено по номеру " + phoneNumber);
    }

    @Override
    public String getUserId() {
        return phoneNumber;
    }

    public boolean checkBalance() {
        return true;
    }
}
