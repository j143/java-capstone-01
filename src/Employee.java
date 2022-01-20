public class Employee {
    private static int id;
    private static String name;
    private static double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Employee.id = id;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Employee.name = name;
    }

    public static double getSalary() {
        return salary;
    }

    public static void setSalary(double salary) {
        Employee.salary = salary;
    }

    public String toString() {
        return "Employee: " + getId() + " " + getName() + " " + getSalary();
    }

}
