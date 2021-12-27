package main.java.by.itAcademy.Prakapenka.lesson19;

/**
 * Обработчик событий уровня Fatal
 */

public class FatalHandler extends CheckHandle{

    @Override
    public boolean checkHandle(Handles handle) {
        if (handle == Handles.FATAL) {
            messageSMS(handle);
            messageCall(handle);
            log.warning("Fatal error!");

            return true;
        }

        return checkLink(handle);
    }
}
