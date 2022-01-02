package main.java.by.itAcademy.Prakapenka.lesson19;

import java.io.IOException;

public class LoggerHandler extends CheckHandle{

    @Override
    public boolean checkHandle(Handles handle, String message) {
        if (handle.getPriority() >= 2) {
            printMessageInFile(handle, message);
        }

        return checkLink(handle, message);
    }

    public static void printMessageInFile(Handles handle, String message){
        try {
            logger.write("Новое событие - " + handle + ". Сообщение к событию: " + message + "\n");
            logger.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
