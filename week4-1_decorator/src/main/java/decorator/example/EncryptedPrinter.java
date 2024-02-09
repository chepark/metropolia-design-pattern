package decorator.example;

import java.util.Base64;

public class EncryptedPrinter extends PrinterDecorator {
    public EncryptedPrinter(BasicPrinter p) {
        super(p);
    }


    @Override
    public void print(String message) {
        String encryptedMessage = Base64.getEncoder().encodeToString(message.getBytes());
        super.print(encryptedMessage);
    }
}
