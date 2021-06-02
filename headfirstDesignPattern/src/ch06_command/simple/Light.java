package ch06_command.simple;

public class Light {
    private boolean on;

    public void on() {
        on = true;
    }

    public boolean isOn() {
        return on;
    }

    public void off() {
        on = false;
    }
}
