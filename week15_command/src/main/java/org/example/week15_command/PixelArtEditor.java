package org.example.week15_command;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PixelArtEditor extends Application {
    private Grid grid = new Grid();

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setFocusTraversable(true); // Allow gridPane to receive focus

        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                Rectangle rect = new Rectangle(30, 30);
                rect.setStroke(Color.BLACK);
                rect.setFill(Color.WHITE);
                int finalX = x;
                int finalY = y;
                rect.setOnMouseClicked(e -> {
                    grid.setCursor(finalX, finalY);
                    grid.togglePixel();
                    updateGrid(gridPane);
                });
                gridPane.add(rect, x, y);
            }
        }

        Button generateCodeButton = new Button("Generate Code");
        generateCodeButton.setOnAction(e -> new GenerateCodeCommand(grid).execute());

        VBox root = new VBox(10, gridPane, generateCodeButton);
        Scene scene = new Scene(root);

        scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP:
                    new MoveCursorCommand(grid, 0, -1).execute();
                    break;
                case DOWN:
                    new MoveCursorCommand(grid, 0, 1).execute();
                    break;
                case LEFT:
                    new MoveCursorCommand(grid, -1, 0).execute();
                    break;
                case RIGHT:
                    new MoveCursorCommand(grid, 1, 0).execute();
                    break;
                case SPACE:
                    new TogglePixelCommand(grid).execute();
                    break;
            }
            updateGrid(gridPane);
        });

        primaryStage.setScene(scene);
        primaryStage.setTitle("Pixel Art Editor");
        primaryStage.show();
    }

    private void updateGrid(GridPane gridPane) {
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                Rectangle rect = (Rectangle) gridPane.getChildren().get(x + y * 8);
                if (grid.pixels[y][x]) { // Assuming 'pixels' is accessible; might need getter
                    rect.setFill(Color.BLACK);
                } else {
                    rect.setFill(Color.WHITE);
                }
            }
        }
    }
}
