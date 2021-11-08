package main.java.by.itAcademy.Prakapenka.lesson8;

public class Application {
    public static void main(String[] args) {
        //create rectangle
        Figure newRectangle = new Rectangle(10, 12);
        System.out.println(newRectangle.calculateArea());

        //create circle
        Figure newCircle = new Circle(100);
        System.out.println(newCircle.calculateArea());
        //System.out.println(newCircle.calculateDiam()); //- this method dont work
        System.out.println(((Circle)newCircle).calculateDiam()); //and now this method work

        //create triangle
 		Triangle newTriangle = new Triangle(3, 4, 5);
 		System.out.println(newTriangle.calculateArea());
        System.out.println(newTriangle.calculatePerimeter());
    }
}
