# java-capstone-01
HR App to print Employee and Department information

```java
public class HRApp {
    public static void main(String [] args) {
        System.out.println("test harness");
        Employee Jason = new Employee(21, "Jason", 20000.02);
        Employee Clarice = new Employee(23, "Clarice", 23000.10);
        System.out.println(Jason.toString());
        System.out.println(Clarice.toString());

        Department department1 = new Department("Physics");
        department1.addEmployee(Jason);
        department1.addEmployee(Clarice);
        department1.getAllEmployees();

    }
}

```

### issues

output
```console
Employee: 71 Clarice 23000.1
Employee: 71 Clarice 23000.1
Employee: 102 Mathison 40000.0
Employee: 102 Mathison 40000.0
Employee: 102 Mathison 40000.0
Employee: 102 Mathison 40000.0
120000.0
40000.0

```
Only the last added element is available. Something to do with `static` keyword.
