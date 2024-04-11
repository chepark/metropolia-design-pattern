package org.example;

public class Tile {
    private TileType type; // intrinsic state
    private int x, y;      // extrinsic state - tile location
    private int imageHeight = 50;
    private int imageWidth = 50;

    public Tile(TileType type, int x, int y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public TileType getType() {
        return type;
    }

    public int getX() {
        return x * imageWidth;
    }

    public int getY() {
        return y *imageHeight;
    }
}



