package org.example.week15_command;

public class Grid {
    public boolean[][] pixels = new boolean[8][8];
    private int cursorX = 0, cursorY = 0;

    public void moveCursor(int dx, int dy) {
        int newX = cursorX + dx;
        int newY = cursorY + dy;
        if (newX >= 0 && newX < 8) {
            cursorX = newX;
        }
        if (newY >= 0 && newY < 8) {
            cursorY = newY;
        }
    }

    public void togglePixel() {
        pixels[cursorY][cursorX] = !pixels[cursorY][cursorX];
    }

    public void printCode() {
        System.out.println("int[][] pixelArt = {");
        for (boolean[] row : pixels) {
            System.out.print("    {");
            for (int i = 0; i < row.length; i++) {
                System.out.print((row[i] ? 1 : 0) + (i < row.length - 1 ? ", " : ""));
            }
            System.out.println("},");
        }
        System.out.println("};");
    }

    public void setCursor(int x, int y) {
        if (x >= 0 && x < 8 && y >= 0 && y < 8) {
            cursorX = x;
            cursorY = y;
        }
    }
}

