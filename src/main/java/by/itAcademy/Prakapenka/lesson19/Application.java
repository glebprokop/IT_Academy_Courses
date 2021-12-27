package main.java.by.itAcademy.Prakapenka.lesson19;

/**
 * Паттерн - цепочка обязанностей. Клиентский код.
 */

import java.util.Scanner;

public class Application {

    /**
     * Создание цепочки обязанностей - fatal-error-debug-info.
     * Клиент по желанию может изменить цепочку либо убрать из нее какой-то обработчик
     */

    static HandlerInterface newHandleChecker = new FatalHandler();

    static {
        newHandleChecker.linkWith(new ErrorHandler())
                .linkWith(new DebugHandler())
                .linkWith(new InfoHandler());
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
                    checkingHandle(Handles.FATAL, newHandleChecker);
                    break;
                case ("error"):
                    checkingHandle(Handles.ERROR, newHandleChecker);
                    break;
                case ("info"):
                    checkingHandle(Handles.INFO, newHandleChecker);
                    break;
                case ("debug"):
                    checkingHandle(Handles.DEBUG, newHandleChecker);
                    break;
                case ("exit"):
                    System.out.println("Finish!");
                    break;
                default:
                    checkingHandle(Handles.INFO, newHandleChecker);
            }
        } while (!userInp.equals("exit"));
    }

    /**
     * Метод, который запускает цепочку обязанностей в клиентском коде
     *
     * @param handle - передаваемый параметр - объект enum Handle
     * @param checker - первый элемент цепочки - объект класса FatalHandler (дочерний от HandlerInterface)
     */

    public static void checkingHandle(Handles handle, HandlerInterface checker){
        checker.checkHandle(handle);
    }
}
