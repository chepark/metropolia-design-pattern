package org.example;
// Leaf class
public class Employee implements OrganizationComponent {
    private String name;
    private float salary;

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(OrganizationComponent component) {
        // Not applicable for Employee.
    }

    @Override
    public void remove(OrganizationComponent component) {
        // Not applicable for Employee.
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getSalary() {
        return salary;
    }

    @Override
    public void printStructure() {
        System.out.println("Employee: " + name + ", Salary: " + salary);
    }

    @Override
    public String toXml() {
        return "<Employee><Name>" + name + "</Name><Salary>" + salary + "</Salary></Employee>";
    }
}
