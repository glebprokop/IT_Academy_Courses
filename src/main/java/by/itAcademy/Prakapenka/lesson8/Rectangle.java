package main.java.by.itAcademy.Prakapenka.lesson8;

class Rectangle extends Figure
{

    Rectangle(){
        this.sizeX = 0;
        this.sizeY = 0;
    }

    Rectangle(double sizeX, double sizeY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    double calculateArea(){
        return this.sizeX * this.sizeY;
    }

    double calculatePerimeter(){
        return this.sizeX * 2 + this.sizeY * 2;
    }
}

