package com.tav;

import java.util.HashMap;
import java.util.Map;

public class PutTitlesInHashMap {

    public static Map<String, Integer> putTitlesInHasMap(String[] titles) {
        Map<String, Integer> titlesMap = new HashMap<>();
        for (String title : titles) {
            Integer amt = titlesMap.get(title);
            if (amt != null) {
                titlesMap.put(title, amt + 1);
            } else {
                titlesMap.put(title, 1);
            }
        }
        return titlesMap;
    }

    public static void main(String[] args) {
        String[] titles = {
                "Harry potter", "The alchemist", "The alchemist", "Harry potter", "Kafka on the shore",
                "Norwegian wood", "The alchemist", "The rosy project", "The alchemist", "Harry potter"
        };
        System.out.println(putTitlesInHasMap(titles));
    }
}
