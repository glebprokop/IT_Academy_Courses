package main.java.by.itAcademy.Prakapenka.lesson19;

/**
 * Базовый интерфейс всех обработчиков, в принципе мог обойтись и без него только с абстрактным классом,
 * но почему то везде рекомендуют начинать разработку паттерна с интерфейса
 */

public interface HandlerInterface {
    HandlerInterface linkWith(HandlerInterface next);
    boolean checkHandle(Handles handle);
    boolean checkLink(Handles handle);
}
