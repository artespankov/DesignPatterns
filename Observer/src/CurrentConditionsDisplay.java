import java.util.Observable;
import java.util.Observer;


public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

//    public CurrentConditionsDisplay(Subject weatherData) {
//        weatherData.registerObserver(this);
//    }

//    public void update(float temperature, float humidity, float pressure){
//        this.temperature = temperature;
//        this.humidity = humidity;
//        display();
//    }

    public CurrentConditionsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    public void display(){
        System.out.println("Current conditions: " + temperature
                + "F degreees and " + humidity + "% humidity");
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
