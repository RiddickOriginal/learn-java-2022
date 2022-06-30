package org.irbis.lesson5;

public class InterfaceMain {
    public static void main(String[] args) {
        NotificationService smsService = getService("message 1", "+78005553535");
        NotificationService emailService = getService("message 2", "vvd@irbis.org");

        sendNotification(smsService);
        sendNotification(emailService);
        sendNotification(new SmsNotificationService("jopa jopa", null));
    }

    private static NotificationService getService(String message, String id) {
        if (id.contains("+")) {
            return new SmsNotificationService(message, id);
        }
        return new EmailNotificationService(message, id);
    }

    private static void sendNotification(NotificationService service) {
        if (service.getUserId() != null) {
            service.doNotify();
        }
    }
}
