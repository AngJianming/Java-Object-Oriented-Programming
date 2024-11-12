package Lab3;

public class Rectangle {
    private double width;
    private double height;
    private static String color = "yellow";

    public Rectangle() {}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }
    public static String getColor() { return color; }
    public static void setColor(String color) { Rectangle.color = color; }

    public double findArea() { return width * height; }
    public double findPerimeter() { return 2 * (width + height); }
}

