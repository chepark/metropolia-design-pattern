package org.example.week15_command;

public class GenerateCodeCommand implements Command{
    private Grid grid;

    public GenerateCodeCommand(Grid grid) {
        this.grid = grid;
    }

    @Override
    public void execute() {
        grid.printCode();
    }
}
