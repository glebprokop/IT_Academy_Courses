package main.java.by.itAcademy.Prakapenka.lesson19;

/**
 * Обработчик событий уровня Debug
 */

public class DebugHandler extends CheckHandle{

    @Override
    public boolean checkHandle(Handles handle) {
        if (handle == Handles.DEBUG) {
            log.info("Debugging!");
            return true;
        }

        return checkLink(handle);
    }


}
