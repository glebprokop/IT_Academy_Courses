package main.java.by.itAcademy.Prakapenka.lesson19;

/**
 * Абстрактный класс, который описывает базовое поведение каждого обработчика событий.
 * В принципе можно было бы обойтись и только им, без создания соответствующего интерфейса.
 */

import java.io.IOException;
import java.util.logging.*;
import java.util.logging.Logger;

public abstract class CheckHandle implements HandlerInterface {
    private HandlerInterface nextHandler;

    /**
     * Создание логгера, который будет записывать информацию о поступающих ошибках в Log.config
     */

    static Logger log = Logger.getLogger(CheckHandle.class.getName());
    static Handler fileHandler;

    static {
        try {
            fileHandler = new FileHandler("Log.config", true);
            log.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод, который связывает элементы цепочки обязанностей (вызывается из клиентского кода - здесь Application)
     *
     * @param nextHandler - следущий обработчик событий
     * @return
     */

    @Override
    public HandlerInterface linkWith(HandlerInterface nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    /**
     * Метод для проверки, обработано ли событие и нужно ли передавать его другому обработчику
     *
     * @param handle - событие
     * @return - вызывает обработчик, указанный как next, если событие не было обработано
     */

    @Override
    public boolean checkLink(Handles handle) {
        if (handle == null){
            return true;
        }

        return nextHandler.checkHandle(handle);
    }

    /**
     * Здесь описан код, отправляющий СМС для СЕО
     *
     * @param handle - тип произошедшего события
     */

    public void messageSMS (Handles handle){
        System.out.println("СМС для СЕО - ошибка типа " + handle);
    }


    /**
     * Здесь описан код звонка директору
     *
     * @param handle - тип произошедшего события
     */

    public void messageCall (Handles handle){
        System.out.println("Звоним директору - ошибка типа " + handle);
    }
}
