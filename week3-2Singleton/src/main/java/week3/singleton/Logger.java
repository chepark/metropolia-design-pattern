package week3.singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger logInstance;
    private String fileName;
    private FileWriter writer;

    public Logger() {
        this.fileName = "logs.txt";
        try {
            writer = new FileWriter(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if(logInstance == null) {
            logInstance = new Logger();
        }
        return logInstance;
    }
    public void write(String message)  {
        try {
            writer.write(message);
            writer.write("\n");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void setFileName(String filename) {
        this.fileName = filename;
        try {
            writer = new FileWriter(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() throws IOException {
        if(writer != null) {
            writer.close();
        }
    }
}
