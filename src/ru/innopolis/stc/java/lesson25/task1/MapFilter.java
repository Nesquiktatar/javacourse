package ru.innopolis.stc.java.lesson25.task1;

import java.util.HashMap;
import java.util.Map;

public class MapFilter {
    public static boolean isUnique(Map<String, String> mapData) {

        if (mapData.isEmpty()) {
            return true;
        } else {

            for (Map.Entry<String, String> entry : mapData.entrySet()) {
                for (Map.Entry<String, String> innerEntry : mapData.entrySet()) {
                    if (entry.getValue().equals(innerEntry.getValue())) {
                        if (!entry.getKey().equals(innerEntry.getKey())) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("John", "Jonson");
        map.put("Mickey", "Smith");
        map.put("Alex", "Phelps");

        System.out.println(MapFilter.isUnique(map));


    }
}