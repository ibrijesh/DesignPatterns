package ObserverPattern.Subject;

import ObserverPattern.Observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
