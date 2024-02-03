package week3.observer;

import java.util.ArrayList;
import java.util.Random;

public class WeatherStation extends Thread {
    private ArrayList<WeatherObserver> observers = new ArrayList<>();
    private int maxTemperature = 20;
    private int minTemperature = 10;
    private int temperature;

    public WeatherStation () {
        Random random = new Random();
        this.temperature = random.nextInt((maxTemperature-minTemperature) + 1) + minTemperature;
    }

    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void notifyTempChange() {
        for(WeatherObserver observer: observers) {
            observer.update(temperature);
        }
    }

    public void run () {
        while (true) {
            int tempChange = new Random().nextInt(3) - 1;
            temperature += tempChange;

            notifyTempChange();

            try {
                Thread.sleep(new Random().nextInt(4000) + 1000); // interval between 1-5 sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
