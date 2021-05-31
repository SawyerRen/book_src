package ch07.unit;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Unit {
    private String type;
    private int id;
    private String name;
    private List<Weapon> weapons;
    private Map<String, Object> properties;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void addWeapon(Weapon weapon) {
       if (weapons == null) {
           weapons = new LinkedList<>();
       }
       weapons.add(weapon);
    }

    public Object getProperty(String key) throws IllegalAccessException {
        if (properties == null)
            throw new IllegalAccessException("no properties.");
        Object value = properties.get(key);
        if (value == null)
            throw new IllegalAccessException("invalid key.");
        return value;
    }

    public void setProperty(String key, Object value) {
        if (properties == null) {
            properties = new HashMap<>();
        }
        properties.put(key, value);
    }
}
