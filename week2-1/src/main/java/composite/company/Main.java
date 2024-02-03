package composite.company;

public class Main {
    public static void main(String[] args) {
        UIFactory factory = new AFactory(); // or new BFactory()

        Button button = factory.createButton("Submit");
        TextField textField = factory.createTextField("Hello, World!");
        Checkbox checkbox = factory.createCheckbox("Remember me");

        button.display();
        textField.display();
        checkbox.display();
    }
}