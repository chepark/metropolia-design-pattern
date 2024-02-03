package composite.company;

public class CityMap extends Map {
    @Override
    Tile createTile() {
        int random = (int) (Math.random() * 3);
        return switch (random) {
            case 0 -> new RoadTile();
            case 1 -> new ForestTile();
            default -> new BuildingTile();
        };
    }
}
