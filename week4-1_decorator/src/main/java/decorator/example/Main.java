package decorator.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BasicPrinter basicPrinter = new BasicPrinter();
        PrinterDecorator filePrinter = new FilePrinter(basicPrinter);
        PrinterDecorator encryptedPrinter = new EncryptedPrinter(basicPrinter);

        // Using basic printer
        basicPrinter.print("Hello, World!");

        // Using file printer
        filePrinter.print("This message goes to a file.");

        // Using encrypted printer
        encryptedPrinter.print("This message is encrypted.");
    }
}