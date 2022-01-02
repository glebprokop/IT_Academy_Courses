package main.java.by.itAcademy.Prakapenka.lesson20;

import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {

        WorkClass newWC = new WorkClass();
        Method[] methods = newWC.getClass().getDeclaredMethods();

        for(Method method : methods){
            if (method.isAnnotationPresent(AcademyInfo.class)){
                System.out.println("Method " + method.getName() + " in class " + method.getDeclaringClass() +
                        " has our annotation with field " + method.getAnnotation(AcademyInfo.class).year());
            }
        }
    }
}


