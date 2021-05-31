package ch07.board;

import ch07.unit.Unit;

import java.util.LinkedList;
import java.util.List;

public class Tile {
    private final List<Unit> units;

    public Tile() {
        units = new LinkedList<>();
    }

    public List<Unit> getUnits() {
        return units;
    }

    protected void addUnit(Unit unit) {
        units.add(unit);
    }

    protected void removeUnit(Unit unit) {
        units.remove(unit);
    }
}
