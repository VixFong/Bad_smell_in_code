package AlternativeClassesWithDifferentInterfaces.Wrong;

public class Square {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }
    
    public int calculateArea() {
        return sideLength * sideLength;
    }
}
