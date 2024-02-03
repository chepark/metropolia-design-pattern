package composite.company;

public interface OrganizationComponent {
    void add(OrganizationComponent component);

    void remove(OrganizationComponent component);

    String getName();
    float getSalary();
    void printStructure();
    String toXml();
}
