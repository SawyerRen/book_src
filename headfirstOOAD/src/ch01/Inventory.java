package ch01;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public List<Guitar> getGuitars() {
        return guitars;
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) return guitar;
        }
        return null;
    }

    public void addGuitar(Guitar guitar) {
        guitars.add(guitar);
    }

    public List<Guitar> search(GuitarSpec guitarSpec) {
        List<Guitar> res = new ArrayList<>();
        for (Guitar guitar : this.guitars) {
            if (guitar.getGuitarSpec().equals(guitarSpec)) res.add(guitar);
        }
        return res;
    }
}
