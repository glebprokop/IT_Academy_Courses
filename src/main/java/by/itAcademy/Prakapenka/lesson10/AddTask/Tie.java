package main.java.by.itAcademy.Prakapenka.lesson10.AddTask;

public class Tie extends Clothes implements ClothesMan
{

    public Tie(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String toString(){
        return "Tie";
    }

    @Override
    public void dressMan() {
        System.out.println("Man dress tie");
    }
}
