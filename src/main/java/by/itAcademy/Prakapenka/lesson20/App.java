package main.java.by.itAcademy.Prakapenka.lesson20;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {

        WorkClass newWC = new WorkClass();
        Class checkerClass = newWC.getClass();
        Class checkingAnn = AcademyInfo.class;

        // Вывод значения boolean для определения наличия передаваемой аннотации
        System.out.println(isPresentAnnotation(checkerClass, checkingAnn));
    }

    public static boolean isPresentAnnotation(Class clazz, Class annotation) {
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(annotation)) {
                return true;
            }
        }

        return false;
    }
}


