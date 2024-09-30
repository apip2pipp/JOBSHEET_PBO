package jobsheet2.Square_project;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void displayInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width : " + width);
    }

    public int getArea() {
        return length * width;
    }

    public int getCircumference() {
        return 2 * (length + width);
    }
}
