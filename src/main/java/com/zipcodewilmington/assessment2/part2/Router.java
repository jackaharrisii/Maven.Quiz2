package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class Router {

    LinkedHashMap<String, String> testMap = new LinkedHashMap<String, String>();

    public void add(String path, String controller) {
        testMap.put(path, controller);
    }

    public Integer size() {
        return testMap.size();
    }

    public String getController(String path) {
        String outputString = (String)testMap.get(path);
        return outputString;
    }

    public String toString(){
        StringBuilder resultOfToString = new StringBuilder();
        for(String key: this.testMap.keySet()) {
            resultOfToString.append(key).append(testMap.get(key)).append("\n");
        }
        return resultOfToString.toString();
    }

    public void update(String path, String studentController) {
        testMap.replace(path, studentController);
    }

    public void remove(String path) {
        testMap.remove(path);
    }
}
