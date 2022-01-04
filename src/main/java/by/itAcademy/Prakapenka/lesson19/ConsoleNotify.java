package main.java.by.itAcademy.Prakapenka.lesson19;

public class ConsoleNotify extends Notifier {

    @Override
    public boolean notifyManager(Events event, String message) {
        if (event.getPriority() >= 1) {
            System.out.println("Событие уровня " + event + ". Вывод в консоль: " + message);
        }

        return checkLink(event, message);
    }
}
