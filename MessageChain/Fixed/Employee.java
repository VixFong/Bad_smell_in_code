package MessageChain.Fixed;

public class Employee {
    private Department department;
    
    public String getDepartmentName() {
        return department.getName();
    }
}

/* Now, the Client class can access the Department object without going through the Employee object: */
