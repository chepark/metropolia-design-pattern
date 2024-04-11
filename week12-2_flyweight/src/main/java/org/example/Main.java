package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Flyweight RPG Map Renderer");
        Canvas canvas = new Canvas(500, 250);
        Tile[][] map = generateMapTiles();
        MapRenderer renderer = new MapRenderer(map, canvas);
        renderer.render();

        StackPane root = new StackPane();
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root, 500, 250));
        primaryStage.show();
    }

    private Tile[][] generateMapTiles() {
        Tile[][] map = new Tile[10][5]; // Example size
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                int randomIndex = (int) (Math.random() * TileType.values().length);
                TileType type = TileType.values()[randomIndex];
                map[i][j] = new Tile(type, i, j);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
