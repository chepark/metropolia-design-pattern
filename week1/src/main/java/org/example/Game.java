package org.example;

public class Game {
    static Map createMap(String mapType) {
        return "City".equals(mapType) ? new CityMap() : new WildernessMap();
    }

    public static void main(String[] args) {
        Map map = createMap("Wilderness"); // Or "Wilderness"
        map.display();
    }
}
