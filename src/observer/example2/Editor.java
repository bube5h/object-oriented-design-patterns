package observer.example2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Editor implements Subject{

    private final Map<EventType, List<Observer>> observers = new HashMap<>();

    @Override
    public void registerObserver(EventType eventType, Observer o) {
        if(!observers.containsKey(eventType)) {
            observers.put(eventType, new ArrayList<>());
        }
        observers.get(eventType).add(o);
    }

    @Override
    public void removeObserver(EventType eventType, Observer o) {
        if(!observers.containsKey(eventType)) {
            return;
        }

        observers.get(eventType).remove(o);
    }

    @Override
    public void notifyObservers(EventType eventType, String data) {
        List<Observer> observerList = observers.get(eventType);
        for(Observer observer: observerList) {
            observer.update(eventType, data);
        }
    }

}
