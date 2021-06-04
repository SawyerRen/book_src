package ch12_compound.duck;

import ch02_observer.v1.Observer;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
