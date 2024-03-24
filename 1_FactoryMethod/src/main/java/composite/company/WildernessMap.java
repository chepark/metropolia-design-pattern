package composite.company;

public class WildernessMap extends Map {
    @Override
    Tile createTile() {
        int random = (int) (Math.random() * 3);
        return switch (random) {
            case 0 -> new SwampTile();
            case 1 -> new ForestTile();
            default -> new WaterTile();
        };
    }
}
