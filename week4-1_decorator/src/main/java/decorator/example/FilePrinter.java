package decorator.example;

import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter extends PrinterDecorator {

    public FilePrinter(BasicPrinter p) {
        super(p);
    }

    @Override
    public void print(String message) {
        try {
            FileWriter myFile = new FileWriter("printer.txt");
            myFile.write(message);
            myFile.flush();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
