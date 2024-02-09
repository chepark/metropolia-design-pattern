package decorator.example;
import java.io.IOException;
public class BasicPrinter implements Printer{
    public void print(String message) {
        System.out.println(message);
    }
}
