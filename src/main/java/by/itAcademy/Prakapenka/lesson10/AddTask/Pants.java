package main.java.by.itAcademy.Prakapenka.lesson10.AddTask;

public class Pants extends Clothes implements ClothesWoman, ClothesMan
{

    public Pants(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String toString(){
        return "Pants";
    }

    @Override
    public void dressMan() {
        System.out.println("Man dress pants");
    }

    @Override
    public void dressWoman() {
        System.out.println("Woman dress pants");
    }
}
