package InappropriateIntimacy.Fixed;
 import java.util.*;

public class EmployeeDepartment {
    private Department department;
    private List<Employee> employees;

    // constructor and other methods
}



/* We can use the Extract Class technique to create a new class EmployeeDepartment 
that contains the commonalities between Employee and Department: */

/*Now, the Employee and Department classes have a common reference to EmployeeDepartment, 
which acts as an intermediary and reduces the intimacy between the two classes. */