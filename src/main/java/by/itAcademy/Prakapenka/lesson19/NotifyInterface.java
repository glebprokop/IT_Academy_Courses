package main.java.by.itAcademy.Prakapenka.lesson19;

/**
 * Базовый интерфейс всех обработчиков, в принципе мог обойтись и без него только с абстрактным классом,
 * но почему то везде рекомендуют начинать разработку паттерна с интерфейса
 */
public interface NotifyInterface {
    NotifyInterface linkWith(NotifyInterface next);
    boolean notifyManager(Events handle, String message);
    boolean checkLink(Events handle, String message);
}