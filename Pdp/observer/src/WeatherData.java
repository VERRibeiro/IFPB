import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {
    private double temperature = 0;
    private double humidity = 0;
    private double pressure = 0;

    public double getTemperature(){
        return this.temperature;
    }
    public double getHumidity(){
        return this.humidity;
    }

    public double getPressure() {
        return pressure;
    }
    public void setTemperature(double t){
        this.temperature = t;
        measurementsChanged();
    }
    public void setHumidity(double h){
        this.humidity = h;
        measurementsChanged();
    }
    public void setPressure(double p){
        this.pressure = p;
        measurementsChanged();

    }

    private void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure
                ;
    }
}
