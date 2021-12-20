package main.java.by.itAcademy.Prakapenka.lesson10.Generics;

import java.util.Arrays;

public class Application{

    public static void main(String[] args) {
        //test for strings
        String newArray[] = filterString(new String[]{"Java", "IT", "Chicken", "Hleb"});
        System.out.println(Arrays.toString(newArray));

        //test for ints
        Integer newArray2[] = filterInteger(new Integer[]{10, 20, 30, 40, 50});
        System.out.println(Arrays.toString(newArray2));
    }

    public static String[] filterString(String array[]){
        return FilterContainer.filter(array, (p) -> !p.equals("Chicken"));
    }

    public static Integer[] filterInteger(Integer array2[]){
        return FilterContainer.filter(array2, (p) -> (Integer) p < 30);
    }
}
