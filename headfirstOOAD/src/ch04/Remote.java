package ch04;

import ch02.DogDoor;

public class Remote {
    private DogDoor door;

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
