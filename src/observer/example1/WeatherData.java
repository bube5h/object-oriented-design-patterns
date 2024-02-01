package observer.example1;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: observers) {
            o.dataGotChanged();
        }
    }

    public float getTemperature() {
        return 0.0f;
    }

    public float getHumidity() {
        return 0.1f;
    }

}
