package org.example;
import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private String searchCriterion;
    private List<File> foundFiles = new ArrayList<>();

    public SearchVisitor(String searchCriterion) {
        this.searchCriterion = searchCriterion;
    }

    public List<File> getFoundFiles() {
        return foundFiles;
    }

    @Override
    public void visit(File file) {
        if (file.getName().contains(searchCriterion)) {
            foundFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        // No additional action needed for directories
    }
}
