package main.java.by.itAcademy.Prakapenka.lesson19;

public class CallNotify extends Notifier {

    @Override
    public boolean notifyManager(Events event, String message) {
        if (event.getPriority() >= 4) {
            call(event, message);
        }

        return checkLink(event, message);
    }

    /**
     * Здесь описан код для звонка директору
     *
     * @param event Тип произошедшего события, message - сообщение
     */
    public void call(Events event, String message){
        System.out.println("Делаем звонок директору - событие уровня " + event + ". Сообщение: " + message);
    }

}
