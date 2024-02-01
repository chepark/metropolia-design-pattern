package org.example;
import java.util.ArrayList;
import java.util.List;

public class Department implements OrganizationComponent {
    private String name;
    private List<OrganizationComponent> members = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void add(OrganizationComponent component) {
        members.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        members.remove(component);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getSalary() {
        float totalSalary = 0;
        for (OrganizationComponent member : members) {
            totalSalary += member.getSalary();
        }
        return totalSalary;
    }

    @Override
    public void printStructure() {
        System.out.println("Department: " + name);
        for (OrganizationComponent member : members) {
            member.printStructure();
        }
    }

    @Override
    public String toXml() {
        StringBuilder sb = new StringBuilder();
        sb.append("<Department><Name>").append(name).append("</Name>");
        for (OrganizationComponent member : members) {
            sb.append(member.toXml());
        }
        sb.append("</Department>");
        return sb.toString();
    }
}

