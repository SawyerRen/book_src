package ch01_strategy;

public enum Type {
    ACOUSTIC, ELECTRIC;

    public String toString() {
        return switch (this) {
            case ACOUSTIC -> "acoustic";
            case ELECTRIC -> "electric";
        };
    }
}
