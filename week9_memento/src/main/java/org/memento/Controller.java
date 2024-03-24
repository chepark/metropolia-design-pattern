package org.memento;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> undoHistory; // Memento undoHistory
    private List<IMemento> redoHistory; // Memento redoHistory

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.undoHistory = new ArrayList<>();
        this.redoHistory = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!undoHistory.isEmpty()) {
            System.out.println("Memento found in undoHistory");
            IMemento previousState = undoHistory.remove(undoHistory.size() - 1);
            redoHistory.add(model.createMemento());
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    public void redo() {
        if(!redoHistory.isEmpty()) {
            System.out.println("Memento found in redoHistory");
            IMemento previousState = redoHistory.removeLast();
            undoHistory.add(model.createMemento());
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        undoHistory.add(currentState);
    }
}
