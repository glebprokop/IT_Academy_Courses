package main.java.by.itAcademy.Prakapenka.lesson12;

public class Parrot extends Pet
{
    final String type = "Parrot";

    public Parrot(String name, int ages) {
        super(name, ages);
    }

    @Override
    public void speak() {
        System.out.println(this.type + " " + this.name + " speak Karrrr");
    }
}
