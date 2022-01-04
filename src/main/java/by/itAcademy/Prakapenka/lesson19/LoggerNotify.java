package main.java.by.itAcademy.Prakapenka.lesson19;

import java.io.IOException;

public class LoggerNotify extends Notifier {

    @Override
    public boolean notifyManager(Events event, String message) {
        if (event.getPriority() >= 2) {
            printMessageInFile(event, message);
        }

        return checkLink(event, message);
    }

    public static void printMessageInFile(Events event, String message){
        try {
            logger.write("Новое событие - " + event + ". Сообщение к событию: " + message + "\n");
            logger.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
