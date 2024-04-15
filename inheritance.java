class Shape {
    // Method to calculate the area (to be overridden by subclasses)
    public double area() {
        return 0; // Default implementation returns 0
    }
}

class Circle extends Shape {
    private double radius;

    // Constructor for Circle class
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override the area method to calculate the area of a circle
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor for Rectangle class
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override the area method to calculate the area of a rectangle
    @Override
    public double area() {
        return length * width;
    }
}

public class inheritance {
    public static void main(String[] args) {
        // Create instances of Circle and Rectangle
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Calculate and print the areas
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
