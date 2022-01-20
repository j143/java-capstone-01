public class HRApp {
    public static void main(String [] args) {
        System.out.println("test harness");
        Employee Jason = new Employee(0, "Jason", 20000.02);
        Employee Clarice = new Employee(1, "Clarice", 23000.10);
        System.out.println(Jason.toString());
        System.out.println(Clarice.toString());

        Department department1 = new Department("Physics");
        department1.addEmployee(Jason);
        department1.addEmployee(Clarice);
        department1.getAllEmployees();
        Employee emp1 = department1.getEmployeeById(1);
        System.out.println(emp1.toString());
        System.out.println(department1.getTotalSalary());

    }
}
