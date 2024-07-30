// Person.java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


public class Employee extends Person {
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }
}


public class Main {
    public static void main(String[] args) {
        
        Person person = new Person("John Doe", 30);
        person.display();

        
        Employee employee = new Employee("Jane Doe", 25, 50000.0);
        employee.display();
    }
}