package main.java.by.itAcademy.Prakapenka.lesson8;

class Triangle extends Figure
{
    double sizeX;
    double sizeY;
    double sizeZ;

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

    public double getSizeZ() {
        return sizeZ;
    }

    public void setSizeZ(double sizeZ) {
        this.sizeZ = sizeZ;
    }

    Triangle(){
        this.sizeX = 0;
        this.sizeY = 0;
        this.sizeZ = 0;
    }

    Triangle(double sizeX, double sizeY, double sizeZ){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.sizeZ = sizeZ;
    }

    @Override
    double getArea(){
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sizeX) * (p - sizeY) * (p - sizeZ));
    }

    @Override
    double getPerimeter(){
        return this.sizeX + this.sizeY + this.sizeZ;
    }
}