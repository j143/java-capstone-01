import java.util.ArrayList;

public class Department {

    private static Employee [] employees = new Employee[10];

    private int capacity;
    private String name;

    private int lastAddedEmployeeIndex = -1;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        if(lastAddedEmployeeIndex < employees.length) { // before first element -1 < 0, second element 0 < 1
            lastAddedEmployeeIndex++;
            employees[lastAddedEmployeeIndex] = employee;
        }
    }

    public void getAllEmployees() {
        for(int i=0; i < employees.length && employees[i] != null; i++) {
            System.out.println(employees[i]);
        }
    }
}
