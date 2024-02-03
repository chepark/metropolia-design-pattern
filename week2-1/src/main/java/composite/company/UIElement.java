package composite.company;

public abstract class UIElement {
    protected String text;

    public abstract void display();

    public void setText(String text) {
        this.text = text;
    }
}
