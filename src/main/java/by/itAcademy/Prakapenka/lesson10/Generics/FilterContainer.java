package main.java.by.itAcademy.Prakapenka.lesson10.Generics;

import java.util.Arrays;

public class FilterContainer {

    public static <Type> Type[] filter(Type[] array, Filter filter) {
        int backIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (!filter.apply(array[i])) {
                backIndex++;
            } else {
                array[i - backIndex] = array[i];
            }
        }
        return Arrays.copyOf(array, array.length - backIndex);
    }
}
