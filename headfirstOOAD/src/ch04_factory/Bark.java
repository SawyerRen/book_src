package ch04_factory;

public class Bark {
    private String sound;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public boolean equals(Object o) {
        if (o instanceof Bark) {
            Bark otherBark = (Bark) o;
            return this.sound.equalsIgnoreCase(otherBark.sound);
        }
        return false;
    }
}
