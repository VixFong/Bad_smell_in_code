package AlternativeClassesWithDifferentInterfaces.Fixed;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    
    public int calculateAreaAsInt() {
        return (int) calculateArea();
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

