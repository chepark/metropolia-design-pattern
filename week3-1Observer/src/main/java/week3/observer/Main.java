package week3.observer;

import java.util.Random;



public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.start();

        WeatherObserver observer1 = new WeatherObserver("ob1");
        WeatherObserver observer2 = new WeatherObserver("ob2");
        WeatherObserver observer3 = new WeatherObserver("ob3");

        weatherStation.registerObserver(observer1);
        weatherStation.registerObserver(observer2);
        weatherStation.registerObserver(observer3);

        try {
            // Let the simulation run for 10 seconds
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        weatherStation.removeObserver(observer2);

    }
}