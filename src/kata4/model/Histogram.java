package kata4.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Histogram <String> {
    private final Map<String,Integer> map = new HashMap<>();
    
    public int get(String key) {
        return map.get(key);
    }
    
    public Set<String> keySet() {
        return map.keySet();
    }
    
    public void increment(String key, int value) {
        map.put(key, value);
    }
    
    
}