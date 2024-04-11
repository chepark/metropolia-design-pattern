package org.example;

import javafx.scene.image.Image;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TileGraphicFactory {
    private static final Map<TileType, Image> tiles = new HashMap<>();

    public static Image getTileGraphic(TileType type) {
        if (!tiles.containsKey(type)) {
            tiles.put(type, new Image(Objects.requireNonNull(TileGraphicFactory.class.getResourceAsStream("/" + type.name().toLowerCase() + ".png"))));
        }
        return tiles.get(type);
    }
}

