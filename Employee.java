// class definition
public class Employee {
    // Fields
    private String id;
    private String name;
    private int salary;

    // Constructor to initialize values
    Employee(String id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee
    public void displayEmployee(){
        System.out.println("Employee id: " + this.id);
        System.out.println("Employee name: " + this.name);
        System.out.println("Employee salary: " + this.salary);
    }
}
/*
Employee employee = new Employee("101", "Dushyant", 40000);
employee.displayEmployee();

Employee id: 101
Employee name: Dushyant
Employee salary: 40000
*/