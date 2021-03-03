package sample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ListStudent {
    Map<String, Integer> hashMap;
    Map<String, Integer> treeMap;
    Map<String, Integer> linkedHashMap;

    ListStudent() {
        hashMap = new HashMap<>();
        linkedHashMap = new LinkedHashMap<>();
    }

    public void addElementToMap(String name, Integer age) {
        try {
            if (isElementExist(name)) {
                throw new ElementExitException(name);
            } else {
                hashMap.put(name, age);
                linkedHashMap.put(name, age);
            }
        } catch (ElementExitException e) {
            e.showException(name);
        }

    }

    public boolean isElementExist(String name) {
        return hashMap.get(name) != null;
    }

    @Override
    public String toString() {
        return "hashMap=" + hashMap + "\n" +
                "linkedHashMap=" + linkedHashMap +
                '}';
    }
}
