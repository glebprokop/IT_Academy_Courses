package main.java.by.itAcademy.Prakapenka.lesson19;

/**
 * Обработчик событий уровня Info
 */

public class InfoHandler extends CheckHandle{

    @Override
    public boolean checkHandle(Handles handle) {
        if (handle == Handles.INFO) {
            System.err.println("Information about program");

            //лог в таком случае записывает в файл, не стал изменять property лога и лезть слишком глубоко
            //log.info("Information about program");
            return true;
        }

        return checkLink(handle);
    }

}
