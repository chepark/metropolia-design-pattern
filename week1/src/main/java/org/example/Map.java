package org.example;

public abstract class Map {
    abstract Tile createTile();

    public void display() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(createTile().getCharacter() + " ");
            }
            System.out.println();
        }
    }
}
