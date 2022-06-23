package org.irbis.lesson4;

public class Notification {
    protected String message;

    public Notification(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void send() {
        System.out.println("Сообщение: " + getMessage());
    }

}
