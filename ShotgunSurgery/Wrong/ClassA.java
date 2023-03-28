package ShotgunSurgery.Wrong;
public class ClassA {
    public int calculate(int x) {
        // perform calculation using formula
        return x * 2 + 1;
    }
}

/* Later on, we decide that we need to modify the formula used in the calculations. With the current design,
 we would need to modify the calculation code in each of the three classes, which is a textbook example of shotgun surgery.*/

 /* To avoid this, we can create a new class called Calculator that contains the formula and the calculation method: */