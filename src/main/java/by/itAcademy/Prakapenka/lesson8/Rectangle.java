package main.java.by.itAcademy.Prakapenka.lesson8;

class Rectangle extends Figure
{
    double sizeX;
    double sizeY;

    public double getSizeX() {
        return sizeX;
    }

    public void setSizeX(double sizeX) {
        this.sizeX = sizeX;
    }

    public double getSizeY() {
        return sizeY;
    }

    public void setSizeY(double sizeY) {
        this.sizeY = sizeY;
    }

    Rectangle(){
        this.sizeX = 0;
        this.sizeY = 0;
    }

    Rectangle(double sizeX, double sizeY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    @Override
    double getArea(){
        return this.sizeX * this.sizeY;
    }

    @Override
    double getPerimeter(){
        return this.sizeX * 2 + this.sizeY * 2;
    }
}

