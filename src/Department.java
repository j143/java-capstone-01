import java.util.ArrayList;

public class Department {

    private static Employee [] employee = new Employee[10];

    private int capacity;
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmployee(Employee[] employee, String name) {
        this.employee = employee;
        this.name = name;
    }

    public void getAllEmployees() {
        for(int i=0; i < employee.length; i++) {
            System.out.println("Hello");
        }
    }
}
