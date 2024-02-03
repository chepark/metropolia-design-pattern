package week3.observer;

public class WeatherObserver implements Observer {
    public String observerName;
    public WeatherObserver (String name) {
        this.observerName = name;
    }
    @Override
    public void update(int temperature) {
        System.out.println(observerName + ": " + temperature);
    }
}
