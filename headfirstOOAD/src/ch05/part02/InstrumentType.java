package ch05.part02;

public enum InstrumentType {
    GUITAR, MANDOLIN;

    @Override
    public String toString() {
        return switch (this) {
            case GUITAR -> "Guitar";
            case MANDOLIN -> "Mandolin";
        };
    }
}
