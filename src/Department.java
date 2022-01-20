import java.util.ArrayList;

public class Department {

    private static Employee[] employees = new Employee[10];

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

    public int getEmployeeCount() {
        return lastAddedEmployeeIndex+1;
    }

    public Employee getEmployeeById(int id) {
        /*
        Iterate over the employees array, get the Employee item
         */
        for (Employee emp : employees) {
            if(emp.getId() == id)
                return emp;
        }

        return null;
    }

    public double getTotalSalary() {
        double total_salary = 0;
        for (Employee emp : employees) {
            total_salary += emp.getSalary();
        }
        return total_salary;
    }
}
