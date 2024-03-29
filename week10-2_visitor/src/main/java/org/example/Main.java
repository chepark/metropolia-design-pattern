package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        File file1 = new File("file1.txt", 10);
        File file2 = new File("file2.mp3", 50);

        Directory subDir = new Directory("subdir");
        File file3 = new File("file3.doc", 5);

        root.addElement(file1);
        root.addElement(file2);
        root.addElement(subDir);
        subDir.addElement(file3);

        // Calculate total size
        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);
        System.out.println("Total size: " + sizeVisitor.getTotalSize() + " MB");

        // Search for files containing 'file'
        SearchVisitor searchVisitor = new SearchVisitor("file");
        root.accept(searchVisitor);
        System.out.println("Found files: ");
        for (File file : searchVisitor.getFoundFiles()) {
            System.out.println(file.getName());
        }
    }
}
