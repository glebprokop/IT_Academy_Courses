package main.java.by.itAcademy.Prakapenka.lesson10.Generics;

import java.util.Arrays;

public class Application{

    public static void main(String[] args) {
        //test for strings
        String newArray[] = filterString(new String[]{"Java", "IT", "Chicken", "Hleb"});
        System.out.println(Arrays.toString(newArray));

        //тест для строк - без абстрактного класса
        String newArray3[] = filterStringNoAbstactClass(new String[]{"Java", "IT", "Chicken", "Hleb"});
        System.out.println(Arrays.toString(newArray3));

        //test for ints
        Integer newArray2[] = filterInteger(new Integer[]{10, 20, 30, 40, 50});
        System.out.println(Arrays.toString(newArray2));
    }

    public static String[] filterString(String array[]){
        String[] newArray = FilterContainer.filter(array, new Filter() {
            @Override
            public <String> boolean apply(String o) {
                return o != "Chicken";
            }
        });
        return newArray;
    }

    public static Integer[] filterInteger(Integer array2[]){
        Integer newArray2[] = FilterContainer.filter(array2, new Filter() {
            @Override
            public <Int> boolean apply(Int o) {
                return ((Integer) o > 30);
            }
        });
        return newArray2;
    }

    //создание конкретной реализации в ходе выполнения функции? (способ избежать создания абстрактного класса)
    public static String[] filterStringNoAbstactClass(String array[]){
        //реализация интерфейса фильтр, которая передается в метод
        Filter stringApply = new Filter() {
            @Override
            public <String> boolean apply(String o) {
                return o != "Chicken";
            }
        };
        return FilterContainer.filter(array, stringApply);
    }
}
