package org.example;

import javafx.scene.image.Image;

import java.util.Objects;

public class TileGraphic implements Flyweight {
    private final Image image;

    public TileGraphic(TileType type) {
        this.image = new Image(Objects.requireNonNull(TileGraphicFactory.class.getResourceAsStream("/" + type.name().toLowerCase() + ".png")));
    }

    @Override
    public Image getImage() {
        return image;
    }
}
