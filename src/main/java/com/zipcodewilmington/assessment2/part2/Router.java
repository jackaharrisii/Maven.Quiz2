package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class Router {

    HashMap<String, String> testMap = new HashMap<String, String>();

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

    public void update(String path, String studentController) {
        testMap.replace(studentController, path);
    }

    public void remove(String path) {
        testMap.remove(path);
    }
}
