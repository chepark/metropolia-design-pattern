package org.example;

public class Main {
    public static void main(String[] args) {
        OrganizationComponent softwareDevelopmentDepartment = new Department("Software Development");
        OrganizationComponent testingDepartment = new Department("Testing");
        OrganizationComponent hrDepartment = new Department("Human Resources");

        OrganizationComponent donald = new Employee("Donald Doe", 50000);
        OrganizationComponent john = new Employee("John Doe", 75000);
        OrganizationComponent tiffany = new Employee("Tiffany Doe", 92000);
        OrganizationComponent jane = new Employee("Jane Doe", 80000);

        softwareDevelopmentDepartment.add(donald);
        testingDepartment.add(john);
        testingDepartment.add(tiffany);
        hrDepartment.add(jane);

        softwareDevelopmentDepartment.add(testingDepartment);

        OrganizationComponent organization = new Department("Organization");
        organization.add(softwareDevelopmentDepartment);
        organization.add(hrDepartment);

        organization.printStructure(); // Prints the entire organization structure.
        System.out.println("Total Salary: " + organization.getSalary()); // Prints the total salary of the organization.

        System.out.println("Organization Structure in XML Format:");
        System.out.println(organization.toXml()); // Prints the organization structure in XML format.
    }
}
