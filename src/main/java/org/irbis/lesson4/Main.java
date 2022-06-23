package org.irbis.lesson4;

public class Main {
    public static void main(String[] args) {
        Notification[] notifications = {
                new Notification(
                        "Привет"
                ),
                new EmailNotification(
                        "Ты просрочил кредит!",
                        "karatel-dead2@mail.ru"
                )
        };


        for (Notification notification : notifications) {
            notification.send();
        }

    }
}
