package ShotgunSurgery.Fixed;

public class Calculator {
    public int calculate(int x) {
        // perform calculation using formula
        return x * 3 + 2;
    }
}

/*  With this design, if we need to modify the formula used in the calculations, we only need to modify the Calculator class. 
The ClassA, ClassB, and ClassC classes do not need to change, and we have avoided shotgun surgery.*/