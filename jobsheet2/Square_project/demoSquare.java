package jobsheet2.Square_project;

public class demoSquare {
    public static void main(String[] args) {
        Rectangle square = new Rectangle(10, 5);
        square.displayInfo();
        System.out.println("Area: " + square.getArea());
        System.out.println("Circumference: " + square.getCircumference());
    }
}
