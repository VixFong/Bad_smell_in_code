package MessageChain.Wrong;

public class Client {
    public void doSomething() {
        Department department = new Employee().getDepartment();
        String departmentName = department.getName();
        System.out.println(departmentName);
    }
}

/* the Client class is accessing the Department object through the Employee object, creating a message chain. 
To apply the Hide Delegate technique, we can modify the Employee class to hide the Department object: */

/* Go to Fixed Folder */