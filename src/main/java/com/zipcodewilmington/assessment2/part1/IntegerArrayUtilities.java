package com.zipcodewilmington.assessment2.part1;

import com.j256.ormlite.stmt.query.In;

public class IntegerArrayUtilities {

    public Boolean hasEvenLength(Integer[] array) {
        if (array.length %2 == 0){return true;}
        else{return false;}
    }

    public Integer[] range(int start, int stop) {
        Integer[] outputRange = new Integer[stop-start+1];
        for (int i = 0; i < outputRange.length; i++){
            outputRange[i] = start;
            start++;
        }
        return outputRange;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        if(array.length >= 2) {return array[0] + array[1];}
        else {return null;}
    }

    //test is for product of last two, not first two
    public Integer getProductOfFirstTwo(Integer[] array) {
        if (array.length >= 2) {return array[array.length-1] * array[array.length -2];}
        else {return null;}
    }
}
