package main.java.by.itAcademy.Prakapenka.lesson20;

/**
 * Класс, содержащий методы с аннотацией и без.
 */
public class WorkClass {

    @AcademyInfo(year = "2022")
    public static void superYear(){
        System.out.println("This method with annotation");
    }

    public static void noYear(){
        System.out.println("Without annotation");
    }
}
