package main.java.by.itAcademy.Prakapenka.lesson16;

import java.util.function.Predicate;

public class LambdaTask
{
    public static void main(String[] args) {
        /**
         * Проверка строк только с учетом букв в верхнем регистре, как указано в задании,
         * строки с буквами нижнего регистра не пройдут фильтр
         */

        Predicate<String> filter = string -> (((string.startsWith("J")) || (string.startsWith("N")))
                && (string.endsWith("A")));

        //тесты для лямбда-фильтра с классом Predicate
        System.out.println(filter.test("JIANNA"));
        System.out.println(filter.test("NASTYA"));
        System.out.println(filter.test("jianna")); //строка с буквами в нижнем регистре
        System.out.println(filter.test("DARIA"));
    }
}
