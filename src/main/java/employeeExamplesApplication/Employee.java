package main.java.employeeExamplesApplication;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String department;
    private final String officeLocation;
    private final String designation;
    private final Double salary;

    public Employee(String firstName, String lastName, String department, String officeLocation, String designation, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.officeLocation = officeLocation;
        this.designation = designation;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public String getDesignation() {
        return designation;
    }

    public Double getSalary() {
        return salary;
    }
}
