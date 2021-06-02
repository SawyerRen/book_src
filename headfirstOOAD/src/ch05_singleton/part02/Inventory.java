package ch05_singleton.part02;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private final List<Instrument> inventory;

    public Inventory(List<Instrument> inventory) {
        this.inventory = inventory;
    }

    public Instrument getInstrument(String serialNumber) {
        for (Instrument instrument : inventory) {
            if (instrument.getSerialNumber().equals(serialNumber)) return instrument;
        }
        return null;
    }

    public void addInstrument(Instrument instrument) {
        inventory.add(instrument);
    }

    public List<Instrument> search(InstrumentSpec instrumentSpec) {
        List<Instrument> res = new ArrayList<>();
        for (Instrument instrument : this.inventory) {
            if (instrumentSpec.matches(instrument.getInstrumentSpec()))
                res.add(instrument);
        }
        return res;
    }
}
