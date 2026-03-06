class Employee {
    protected String name;

    protected Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculateSalary() {
        return 0.0;
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeTester {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("George", 5000.0);
        Employee partTime = new PartTimeEmployee("Lucy", 20.0, 160);

        System.out.println(fullTime.getName() + "'s salary: " + fullTime.calculateSalary());
        System.out.println(partTime.getName() + "'s salary: " + partTime.calculateSalary());
    }
}