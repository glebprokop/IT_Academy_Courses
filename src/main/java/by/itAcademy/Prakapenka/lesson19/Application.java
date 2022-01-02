package main.java.by.itAcademy.Prakapenka.lesson19;

import java.util.Scanner;

/**
 * Паттерн - цепочка обязанностей. Клиентский код.
 */
public class Application {

    /**
     * Создание цепочки обязанностей (звонок-СМС-лог-консоль).
     * Клиент по желанию может изменить цепочку либо убрать из нее какой-то обработчик
     */
    static HandlerInterface newHandleChecker = new CallHandler();

    static {
        newHandleChecker.linkWith(new SMSHandler())
                .linkWith(new ConsoleHandler())
                .linkWith(new LoggerHandler());
    }

    public static void main(String[] args) {

        /**
         * Имитировал события приложения через switch-case, со вводом из консоли.
         * Ввод события, не указанного в enum, вызывает событие типа info (для блока default в switch-case)
         */
        Scanner sc = new Scanner(System.in);
        String userInp;

        do{
            System.out.println("Input your type of handle: " +
                    "error for ERRORS, " +
                    "fatal for FATAL, " +
                    "info for INFO, " +
                    "debug for DEBUG, " +
                    "exit for EXIT.");

            userInp = sc.nextLine();

            switch (userInp){
                case ("fatal"):
                    checkingHandle(Handles.FATAL, getMessage(sc), newHandleChecker);
                    break;
                case ("error"):
                    checkingHandle(Handles.ERROR, getMessage(sc), newHandleChecker);
                    break;
                case ("debug"):
                    checkingHandle(Handles.DEBUG, getMessage(sc), newHandleChecker);
                    break;
                case ("exit"):
                    System.out.println("Finish!");
                    break;
                default:
                    checkingHandle(Handles.INFO, getMessage(sc), newHandleChecker);
            }
        } while (!userInp.equals("exit"));
    }

    /**
     * Метод, который запускает цепочку обязанностей в клиентском коде
     *
     * @param handle - передаваемый параметр - объект enum Handle
     * @param checker - первый элемент цепочки - объект класса CallHandler (дочерний от HandlerInterface)
     */
    public static void checkingHandle(Handles handle, String message, HandlerInterface checker){
        checker.checkHandle(handle, message);
    }

    /**
     * Получение сообщения о событии.
     *
     * @param sc Сканер для ввода сообщения
     * @return message - введенное сообщение
     */
    public static String getMessage(Scanner sc){
        System.out.println("Введите сообщение для события!");
        return sc.nextLine();
    }
}
