package ch04;

public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(Bark bark) {
        System.out.println("heard a bark");
        for (Bark allowedBark : door.getAllowedBarks()) {
            if (allowedBark.equals(bark)) {
                door.open();
                return;
            }
        }
    }
}
