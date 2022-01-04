package main.java.by.itAcademy.Prakapenka.lesson19;

public class SMSNotify extends Notifier {

    @Override
    public boolean notifyManager(Events event, String message) {
        if (event.getPriority() >= 3) {
            messageSMS(event, message);
        }

        return checkLink(event, message);
    }

    /**
     * Здесь описан код, отправляющий СМС для СЕО
     *
     * @param event Тип произошедшего события, message - сообщение
     */
    public void messageSMS (Events event, String message){
        System.out.println("СМС для СЕО - событие уровня " + event + ". Сообщение: " + message);
    }
}
