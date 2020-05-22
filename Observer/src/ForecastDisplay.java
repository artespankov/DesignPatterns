import java.util.Random;
import java.util.Observable;
import java.util.Observer;


public class ForecastDisplay implements Observer, DisplayElement {
    private final String[] historicalData;
    private float currentPressure = 29.99f;
    private float lastPressure;

//    public ForecastDisplay(WeatherData weatherDataSubject){
//        this.historicalData = new String[] {"Improving weather on the way!",
//                "Watch out for cooler, rainy weather!!",
//                "More of the same."};
//        weatherDataSubject.registerObserver(this);
//    }
//
//    public void update(float temp, float humidity, float pressure) {
//        display();
//    };

    public ForecastDisplay(Observable obs){
        this.historicalData = new String[] {"Improving weather on the way!",
                "Watch out for cooler, rainy weather!!",
                "More of the same."};
        obs.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            this.lastPressure = this.currentPressure;
            this.currentPressure = weatherData.getPressure();
            display();
        }
    };

    public void display() {
        int rand_index = new Random().nextInt(this.historicalData.length);
        System.out.println("Forecast: " + this.historicalData[rand_index]);
    };
}
