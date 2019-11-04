package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class ListUtility {

    List<Integer> integerList = new ArrayList<Integer>(3);
    Set<Integer> integerSet = new LinkedHashSet<Integer>();

    //come back to this one - I'm not sure what exactly they're asking for
    //writing the code for the contains method at the bottom fixed this
    public Boolean add(int i) {
        int oldSize = integerList.size();
        integerList.add(i);
        if (integerList.size() == oldSize + 1){return true;}
        else {return false;}
    }

    public Integer size() {
        return integerList.size();
    }

    public List<Integer> getUnique() {
        List<Integer> uniqueList = new ArrayList();
        for (int i = 0; i < integerList.size(); i++){
            if (uniqueList.contains(integerList.get(i)) == false) {uniqueList.add(integerList.get(i));}
        }
        return uniqueList;
    }

    public String join() {
        String listAsNewString = "";
        for (int i = 0; i < integerList.size() -1; i++){             //add all but the last element, then a comma and space
            listAsNewString += integerList.get(i) + ", ";
        }
        listAsNewString += integerList.get(integerList.size()-1);    //add the last element
        return listAsNewString;
    }

    public Integer mostCommon() {
        List<Integer> sortedIntegerList = new LinkedList<>(integerList);
        int currentCounter = 1;
        int maxCounter = 1;
        Integer mostCommonInteger = sortedIntegerList.get(0);

        for (int i = 1; i < sortedIntegerList.size(); i++){
            if (sortedIntegerList.get(i).equals(sortedIntegerList.get(i-1))){
                currentCounter++;
            }
            else{
                if (currentCounter > maxCounter){
                    maxCounter = currentCounter;
                    mostCommonInteger = sortedIntegerList.get(i-1);
                }
                currentCounter = 1;
            }
        }
        if (currentCounter > maxCounter){
            maxCounter = currentCounter;
            mostCommonInteger = sortedIntegerList.get(sortedIntegerList.size()-1);
        }
        return mostCommonInteger;    }

    public Boolean contains(Integer valueToAdd) {
        if (integerList.contains(valueToAdd)) {return true;}
        else {return false;}
    }
}
