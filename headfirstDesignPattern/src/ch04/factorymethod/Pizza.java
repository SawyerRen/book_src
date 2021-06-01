package ch04.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public void prepare() {
    }

    void bake() {
    }

    void cut() {
    }

    void box() {
    }

    public String getName() {
        return name;
    }
}
