import java.util.Observable;
import java.util.Observer;

public class Atual implements Observer {


    private Observable WeatherData;

    public Atual(Observable WeatherData) {
        this.WeatherData = WeatherData;
        WeatherData.addObserver(this);
    }
    @Override
    public void update(Observable WeatherInfo, Object arg) {
        if (WeatherInfo instanceof WeatherData){
            WeatherData weatherData = (WeatherData) WeatherInfo;
            System.out.println("As condições atuais mudaram para "+ weatherData.toString());
        }
    }
}
