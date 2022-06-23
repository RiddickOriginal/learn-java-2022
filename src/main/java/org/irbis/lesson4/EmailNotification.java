package org.irbis.lesson4;

public class EmailNotification extends Notification {

    private String email;

    public EmailNotification(String message, String email) {
        super(message);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void send() {
        System.out.println("Email: " + getEmail());
        super.send();
    }

}
