package main.java.by.itAcademy.Prakapenka.lesson10.Enums;

public class Application {
    public static void main(String[] args) {
        Clothes babyShirt = Clothes.XXS;

        System.out.println(babyShirt);
        System.out.println(babyShirt.getEuroSize());
        System.out.println(babyShirt.getDescription());

        Clothes womenShirt = Clothes.L;

        System.out.println(womenShirt);
        System.out.println(womenShirt.getEuroSize());
        System.out.println(womenShirt.getDescription());
    }
}
