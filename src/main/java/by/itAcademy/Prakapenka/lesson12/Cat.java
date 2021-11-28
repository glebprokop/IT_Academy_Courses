package main.java.by.itAcademy.Prakapenka.lesson12;

public class Cat extends Pet
{
    final String type = "Cat";

    public Cat(String name, int ages) {
        super(name, ages);
    }

    @Override
    public void speak() {
        System.out.println(this.type + " " + this.name + " speak May");
    }
}
