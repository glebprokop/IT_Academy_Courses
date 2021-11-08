package main.java.by.itAcademy.Prakapenka.lesson8;

class Circle extends Figure {

    double radius;

    Circle() {
        this.radius = 0;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return this.radius * this.radius * 3.14;
    }

    double calculatePerimeter() {
        return 2 * this.radius * 3.14;
    }

    double calculateDiam() {
        return 2 * this.radius;
    }
}