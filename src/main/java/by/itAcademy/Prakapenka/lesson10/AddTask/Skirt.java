package main.java.by.itAcademy.Prakapenka.lesson10.AddTask;

public class Skirt extends Clothes implements ClothesWoman
{

    public Skirt(int size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String toString(){
        return "Skirt";
    }

    @Override
    public void dressWoman() {
        System.out.println("Woman dress skirt");
    }
}
