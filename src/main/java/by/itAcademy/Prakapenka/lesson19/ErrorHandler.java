package main.java.by.itAcademy.Prakapenka.lesson19;

/**
 * Обработчик событий уровня Error
 */

public class ErrorHandler extends CheckHandle {

    @Override
    public boolean checkHandle(Handles handle) {
        if (handle == Handles.ERROR) {
            messageSMS(handle);
            log.warning("Non critical error! Type of error - " + handle);
            return true;
        }

        return checkLink(handle);
    }
}
