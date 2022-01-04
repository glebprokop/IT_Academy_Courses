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
    static NotifyInterface userNotifier = new CallNotify();

    static {
        userNotifier.linkWith(new SMSNotify())
                .linkWith(new ConsoleNotify())
                .linkWith(new LoggerNotify());
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
                    startNotifying(Events.FATAL, getMessage(sc), userNotifier);
                    break;
                case ("error"):
                    startNotifying(Events.ERROR, getMessage(sc), userNotifier);
                    break;
                case ("debug"):
                    startNotifying(Events.DEBUG, getMessage(sc), userNotifier);
                    break;
                case ("exit"):
                    System.out.println("Finish!");
                    break;
                default:
                    startNotifying(Events.INFO, getMessage(sc), userNotifier);
            }
        } while (!userInp.equals("exit"));
    }

    /**
     * Метод, который запускает цепочку обязанностей в клиентском коде
     *
     * @param event - передаваемый параметр - объект enum Handle
     * @param userNotifier - первый элемент цепочки - объект класса CallNotify (дочерний от HandlerInterface)
     */
    public static void startNotifying(Events event, String message, NotifyInterface userNotifier){
        userNotifier.notifyManager(event, message);
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
