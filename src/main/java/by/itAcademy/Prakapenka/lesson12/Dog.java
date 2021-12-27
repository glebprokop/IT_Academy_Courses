package main.java.by.itAcademy.Prakapenka.lesson12;

public class Dog extends Pet
{
    final String type = "Dog";

    public Dog(String name, int ages) {
        super(name, ages);
    }

    @Override
    public void speak() {
        System.out.println(this.type + " " + this.name + " speak Guv");
    }
}
