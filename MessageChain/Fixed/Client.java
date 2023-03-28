package MessageChain.Fixed;

public class Client {
    public void doSomething() {
        String departmentName = new Employee().getDepartmentName();
        System.out.println(departmentName);
    }
}

/* This simplifies the code and reduces coupling between the Client and the Employee objects. */