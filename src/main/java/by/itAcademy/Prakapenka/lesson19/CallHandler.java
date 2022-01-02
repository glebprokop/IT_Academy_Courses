package main.java.by.itAcademy.Prakapenka.lesson19;

public class CallHandler extends CheckHandle{

    @Override
    public boolean checkHandle(Handles handle, String message) {
        if (handle.getPriority() >= 4) {
            call(handle, message);
        }

        return checkLink(handle, message);
    }

    /**
     * Здесь описан код для звонка директору
     *
     * @param handle Тип произошедшего события, message - сообщение
     */
    public void call(Handles handle, String message){
        System.out.println("Делаем звонок директору - событие уровня " + handle + ". Сообщение: " + message);
    }

}
