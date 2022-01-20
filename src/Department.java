import java.util.ArrayList;

public class Department {

    private static Employee [] employees = new Employee[10];

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

    public void addEmployee(Employee[] employees, String name) {
        this.employees = employees;
        this.name = name;
    }

    public void getAllEmployees() {
        for(int i=0; i < employees.length; i++) {
            System.out.println("Hello");
        }
    }
}
