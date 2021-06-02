package ch05_singleton.part01;

public class GuitarSpec extends InstrumentSpec {

    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
        super(builder, model, type, backWood, topWood);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    @Override
    public boolean matches(InstrumentSpec otherSpec) {
        if (!super.matches(otherSpec)) return false;
        if (otherSpec instanceof GuitarSpec) {
            GuitarSpec spec = (GuitarSpec) otherSpec;
            return numStrings == spec.getNumStrings();
        }
        return false;
    }
}
