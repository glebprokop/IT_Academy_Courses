package main.java.by.itAcademy.Prakapenka.lesson10.Generics;

public class Application {

    public static void main(String[] args) {
        //test for strings
        String newArray[] = filterString();
        for (String x : newArray){
            System.out.print(x + " ");
        }
        System.out.println();

        //test for ints
        Integer newArray2[] = filterInteger();
        for (Integer y : newArray2){
            System.out.print(y + " ");
        }
    }

    public static String[] filterString(){
        String array[] = new String[]{"Java", "IT", "Chicken", "Hleb"};

        String[] newArray = FilterContainer.filter(array, new Filter() {
            @Override
            public boolean apply(Object o) {
                return o != "Chicken";
            }
        });
        return newArray;
    }

    public static Integer[] filterInteger(){
        Integer array2[] = new Integer[]{10, 20, 30, 40, 50};
        Integer newArray2[] = FilterContainer.filter(array2, new Filter() {
            @Override
            public boolean apply(Object o) {
                return ((Integer) o > 30);
            }
        });
        return newArray2;
    }
}
