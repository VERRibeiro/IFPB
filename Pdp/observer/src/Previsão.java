import java.util.Observable;
import java.util.Observer;

public class Previsão implements Observer {

    private Observable WeatherData;

    public Previsão(Observable WeatherData) {
        this.WeatherData = WeatherData;
        WeatherData.addObserver(this);
    }
    @Override
    public void update(Observable WeatherInfo, Object arg) {
        if (WeatherInfo instanceof WeatherData){
            WeatherData weatherData = (WeatherData) WeatherInfo;
            System.out.println("A Previsão é "+ weatherData.toString());
        }
    }
}
