package ch05;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Instrument> inventory;

    public Inventory(List<Instrument> inventory) {
        this.inventory = inventory;
    }

    public Instrument getGuitar(String serialNumber) {
        for (Instrument instrument : inventory) {
            if (instrument.getSerialNumber().equals(serialNumber)) return instrument;
        }
        return null;
    }

    public void addInstrument(Instrument instrument) {
        inventory.add(instrument);
    }

    public List<Guitar> search(GuitarSpec guitarSpec) {
        List<Guitar> res = new ArrayList<>();
        for (Instrument instrument : this.inventory) {
            if (guitarSpec.matches(instrument.getInstrumentSpec()))
                res.add((Guitar) instrument);
        }
        return res;
    }
}
