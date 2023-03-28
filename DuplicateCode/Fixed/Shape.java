package Fixed;
public abstract class Shape {
    public abstract int getArea();
    public abstract int getPerimeter();
}

/*In this refactored code, we've introduced an abstract Shape class that 
defines the getArea() and getPerimeter() methods. Both the Rectangle and Square classes 
now extend this Shape class and implement its abstract methods, removing the duplicated 
code for calculating the area and perimeter of the shapes. */

