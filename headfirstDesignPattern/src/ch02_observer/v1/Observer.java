package ch02_observer.v1;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
