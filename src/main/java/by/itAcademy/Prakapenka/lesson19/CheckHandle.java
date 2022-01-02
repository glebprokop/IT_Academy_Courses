package main.java.by.itAcademy.Prakapenka.lesson19;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * Абстрактный класс, который описывает базовое поведение каждого обработчика событий.
 * В принципе можно было бы обойтись и только им, без создания соответствующего интерфейса.
 */
public abstract class CheckHandle implements HandlerInterface {
    private HandlerInterface nextHandler;

    /**
     * Создание логгера, который будет записывать информацию о поступающих ошибках в Logger.txt.
     * Статический инициализатор - блок для инициализации статической переменной (логгера). Необходим
     * для ведения единого логгера в программе.
     */
    static BufferedWriter logger;

    static {
        try {
            logger = new BufferedWriter(new FileWriter("Logger.txt"));
        } catch (Exception e) {
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
     * @param handle событие, message - сообщение
     * @return - вызывает обработчик, указанный как next, если событие не было обработано
     */
    @Override
    public boolean checkLink(Handles handle, String message) {
        if (nextHandler != null){
            return nextHandler.checkHandle(handle, message);
        }

        return true;
    }
}
