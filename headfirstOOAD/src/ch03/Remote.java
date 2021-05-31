package ch03;

import ch02.DogDoor;

import java.util.Timer;
import java.util.TimerTask;

public class Remote {
    private ch02.DogDoor door;

    public Remote(DogDoor door) {
        this.door = door;
    }

    public void pressButton() {
        System.out.println("press the remote control button");
        if (door.isOpen()) {
            door.close();
        } else {
            door.open();
        }
    }
}
