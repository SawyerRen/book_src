package ch05_singleton.part02;

import java.util.HashMap;
import java.util.Map;

public class InstrumentSpec {
    private final Map<String, Object> properties;

    public InstrumentSpec(Map<String, Object> properties) {
        if (properties == null) {
            this.properties = new HashMap<>();
        } else {
            this.properties = new HashMap<>(properties);
        }
    }

    public Object getProperty(String property) {
        return properties.get(property);
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        for (Map.Entry<String, Object> property : otherSpec.getProperties().entrySet()) {
            String key = property.getKey();
            if (!property.getValue().equals(this.properties.get(key))) {
                return false;
            }
        }
        return true;
    }
}
