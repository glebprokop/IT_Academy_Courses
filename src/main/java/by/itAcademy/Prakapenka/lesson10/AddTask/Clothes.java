package main.java.by.itAcademy.Prakapenka.lesson10.AddTask;

public abstract class Clothes
{
    Size size;
    int cost;
    String color;

    public Clothes(Size size, int cost, String color){
        this.color = color;
        this.cost = cost;
        this.size = size;
    }
}
