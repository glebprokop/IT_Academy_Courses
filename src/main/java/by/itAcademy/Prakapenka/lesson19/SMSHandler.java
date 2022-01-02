package main.java.by.itAcademy.Prakapenka.lesson19;

public class SMSHandler extends CheckHandle{

    @Override
    public boolean checkHandle(Handles handle, String message) {
        if (handle.getPriority() >= 3) {
            messageSMS(handle, message);
        }

        return checkLink(handle, message);
    }

    /**
     * Здесь описан код, отправляющий СМС для СЕО
     *
     * @param handle Тип произошедшего события, message - сообщение
     */
    public void messageSMS (Handles handle, String message){
        System.out.println("СМС для СЕО - событие уровня " + handle + ". Сообщение: " + message);
    }
}
