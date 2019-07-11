package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author PNidadav
 * @project Practise
 */
public class LRUCache {

    LinkedHashMap<Integer, Integer> linkedMap;

    public LRUCache(int capacity) {
        this.linkedMap = new LinkedHashMap<Integer, Integer>(capacity, 1.0f, true ){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest){
                return this.size() > capacity;
            }
        };

    }

    public int get(int key) {

        if(linkedMap.containsKey(key)){
            return linkedMap.get(key);
        }

        return -1;

    }

    public void put(int key, int value) {

        if(!linkedMap.containsKey(key)){
            linkedMap.put(key, value);
        } else {
            linkedMap.remove(key);
            linkedMap.put(key, value);
        }

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */