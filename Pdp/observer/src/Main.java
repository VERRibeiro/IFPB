public class Main {

    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        Atual atual = new Atual(wd);
        Estatisticas estatisticas = new Estatisticas(wd);
        Previsão previsão = new Previsão(wd);
        wd.setPressure(10);
        wd.setTemperature(20);
        wd.setHumidity(30);

    }
}
