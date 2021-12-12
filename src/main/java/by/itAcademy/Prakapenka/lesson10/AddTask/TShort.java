package main.java.by.itAcademy.Prakapenka.lesson10.AddTask;

public class TShort extends Clothes implements ClothesMan, ClothesWoman
{

    public TShort(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String toString(){
        return "T-Short";
    }

    @Override
    public void dressMan() {
        System.out.println("Man dress T-Short");
    }

    @Override
    public void dressWoman() {
        System.out.println("Woman dress T-Short");
    }
}
