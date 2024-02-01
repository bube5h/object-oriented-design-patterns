package observer.example1;

public class WeaterDisplay implements Observer{

    private WeatherData weatherData;

    @Override
    public void dataGotChanged() {
        displayLatestData();
    }

    public void displayLatestData() {
        float temperature = weatherData.getTemperature();
        System.out.println(temperature);
    }

}
