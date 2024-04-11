package org.example;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class MapRenderer {
    private Tile[][] map;
    private Canvas canvas;

    public MapRenderer(Tile[][] map, Canvas canvas) {
        this.map = map;
        this.canvas = canvas;
    }

    public void render() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                Tile tile = map[i][j];
                gc.drawImage(TileGraphicFactory.getTileGraphic(tile.getType()), tile.getX(), tile.getY());
            }
        }
    }
}
