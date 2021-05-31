package ch07.board;

import ch07.unit.Unit;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final int width;
    private final int height;
    private List<List<Tile>> tiles;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        initialize();
    }

    private void initialize() {
        tiles = new ArrayList<>(width);
        for (int i = 0; i < width; i++) {
            tiles.add(i, new ArrayList<>(height));
            for (int j = 0; j < height; j++) {
                tiles.get(i).add(j, new Tile());
            }
        }
    }

    public Tile getTile(int x, int y) {
        return tiles.get(x - 1).get(y - 1);
    }

    public void addUnit(Unit unit, int x, int y) {
        Tile tile = getTile(x, y);
        tile.addUnit(unit);
    }

    public void removeUnit(Unit unit, int x, int y) {
        Tile tile = getTile(x, y);
        tile.removeUnit(unit);
    }

    public void removeUnits(int x, int y) {
        Tile tile = getTile(x, y);
        tile.getUnits().clear();
    }

    public List<Unit> getUnits(int x, int y) {
        return getTile(x, y).getUnits();
    }
}
