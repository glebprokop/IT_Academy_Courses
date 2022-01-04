package main.java.by.itAcademy.Prakapenka.lesson19;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * Абстрактный класс, который описывает базовое поведение каждого обработчика событий.
 * В принципе можно было бы обойтись и только им, без создания соответствующего интерфейса.
 */
public abstract class Notifier implements NotifyInterface {
    private NotifyInterface nextNotify;

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
     * @param nextNotify - следущий обработчик событий
     * @return
     */
    @Override
    public NotifyInterface linkWith(NotifyInterface nextNotify) {
        this.nextNotify = nextNotify;
        return nextNotify;
    }

    /**
     * Метод для проверки, обработано ли событие и нужно ли передавать его другому обработчику
     *
     * @param event событие, message - сообщение
     * @return - вызывает обработчик, указанный как next, если событие не было обработано
     */
    @Override
    public boolean checkLink(Events event, String message) {
        if (nextNotify != null){
            return nextNotify.notifyManager(event, message);
        }

        return true;
    }
}
