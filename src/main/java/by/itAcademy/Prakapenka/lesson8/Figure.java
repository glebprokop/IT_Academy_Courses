package main.java.by.itAcademy.Prakapenka.lesson8;

abstract class Figure{
    double sizeX;
    double sizeY;

    double getSizeX(){
        return sizeX;
    }

    double getSizeY(){
        return sizeY;
    }

    void setSizeX(double newX){
        this.sizeX = newX;
    }

    void setSizeY(double newY){
        this.sizeY = newY;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();
}