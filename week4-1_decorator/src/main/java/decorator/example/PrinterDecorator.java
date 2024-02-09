package decorator.example;

import java.io.IOException;

public class PrinterDecorator extends BasicPrinter {
    private BasicPrinter basicPrinter;

    public PrinterDecorator(BasicPrinter p) {
        this.basicPrinter = p;
    }

    @Override
    public void print(String message) {
        basicPrinter.print(message);
    }
}
