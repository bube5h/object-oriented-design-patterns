package observer.example2;

public interface Subject {

    void registerObserver(EventType eventType, Observer o);

    void removeObserver(EventType eventType, Observer o);

    void notifyObservers(EventType eventType, String data);

}
