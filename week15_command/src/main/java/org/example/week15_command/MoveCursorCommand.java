package org.example.week15_command;

class MoveCursorCommand implements Command {
    private Grid grid;
    private int dx, dy; // Direction to move in the x and y axes.

    public MoveCursorCommand(Grid grid, int dx, int dy) {
        this.grid = grid;
        this.dx = dx;
        this.dy = dy;
    }

    @Override
    public void execute() {
        grid.moveCursor(dx, dy);
    }
}
