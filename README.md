Employee:
A protected String name instance variable.
A protected constructor that initializes the name.
A method public double calculateSalary() that returns 0.0.

FullTimeEmployee:
A private double monthlySalary instance variable.
A constructor that takes name and monthlySalary as arguments.
Override calculateSalary() to return the monthly salary.

PartTimeEmployee:
private double hourlyRate and private int hoursWorked instance variables.
A constructor that takes name, hourlyRate, and hoursWorked as arguments.
Override calculateSalary() to return the product of hourlyRate and hoursWorked.

Create an EmployeeTester class with a main method that creates instances of FullTimeEmployee and PartTimeEmployee, and demonstrates polymorphism by calling calculateSalary() on both.

// EmployeeTester.java
public class EmployeeTester {
public static void main(String[] args) {
Employee fullTime = new FullTimeEmployee("Alice", 5000.0);
Employee partTime = new PartTimeEmployee("Bob", 20.0, 160);
System.out.println(fullTime.getName() + "'s salary: " + fullTime.calculateSalary());
System.out.println(partTime.getName() + "'s salary: " + partTime.calculateSalary());
}
}
 
Example Output:
Alice's salary: 5000.0
Bob's salary: 3200.0
