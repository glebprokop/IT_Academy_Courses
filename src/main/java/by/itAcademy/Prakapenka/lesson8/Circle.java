package main.java.by.itAcademy.Prakapenka.lesson8;

class Circle extends Figure
{

    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    Circle() {
        this.radius = 0;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return this.radius * this.radius * 3.14;
    }

    @Override
    double getPerimeter() {
        return 2 * this.radius * 3.14;
    }

    double getDiam() {
        return 2 * this.radius;
    }
}