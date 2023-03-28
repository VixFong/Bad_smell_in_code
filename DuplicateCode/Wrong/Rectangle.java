public class Rectangle {
    private int width;
    private int height;
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public int getArea() {
        return width * height;
    }
    
    public int getPerimeter() {
        return 2 * (width + height);
    }
}
/* both the Rectangle and Square classes have methods to calculate their 
area and perimeter, but the code for calculating these values is duplicated. 
Specifically, the getArea() and getPerimeter() methods in the Square class are nearly 
identical to those in the Rectangle class. */