public class HRApp {
    public static void main(String [] args) {
        System.out.println("test harness");
        Employee Jason = new Employee(21, "Jason", 20000.02);
        Employee Clarice = new Employee(23, "Clarice", 23000.10);
        System.out.println(Jason.toString());
        System.out.println(Clarice.toString());

        Department department1 = new Department("Physics");
//        department1.addEmployee(Jason, "Physics");

    }
}
