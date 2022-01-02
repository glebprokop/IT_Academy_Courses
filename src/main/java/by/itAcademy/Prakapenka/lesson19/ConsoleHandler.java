package main.java.by.itAcademy.Prakapenka.lesson19;

public class ConsoleHandler extends CheckHandle{

    @Override
    public boolean checkHandle(Handles handle, String message) {
        if (handle.getPriority() >= 1) {
            System.out.println("Событие уровня " + handle + ". Вывод в консоль: " + message);
        }

        return checkLink(handle, message);
    }
}
