package AlternativeClassesWithDifferentInterfaces.Fixed;

public class Square extends Shape {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public double calculateArea() {
        return sideLength * sideLength;
    }
}
