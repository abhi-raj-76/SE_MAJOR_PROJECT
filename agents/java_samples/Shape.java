public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing " + color);
    }
}

public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void draw() {
        System.out.println("Drawing circle with radius " + radius + " and color " + color);
    }
}

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void draw() {
        System.out.println("Drawing rectangle with width " + width + " and height " + height + " and color " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("blue");
        shape.draw();

        Circle circle = new Circle("red", 5);
        circle.draw();

        Rectangle rectangle = new Rectangle("green", 10, 20);
        rectangle.draw();
    }
}