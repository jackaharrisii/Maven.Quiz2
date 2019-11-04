package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;

public class ArrayUtility {        // this makes sense for all but test3 - why did the array order change for test3, and why did it still pass? is it simply checking to see if the array contains the numbers and not the order?
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] mergedArray = new Integer[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++){
            mergedArray[i] = array1[i];
        }
        for (int j = array1.length; j < mergedArray.length; j++){
            mergedArray[j] = array2[j-array1.length];
        }
        return mergedArray;
    }

    //I think there's a more elegant way to do this without the counter - come back if I have time at the end
    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] rotatedArray = new Integer[array.length];
        for (int i = 0; i < array.length - index; i++){
            rotatedArray[i] = array[index + i];
        }
        Integer counter = 0;
        for (int j = array.length - index; j < array.length; j++){
            rotatedArray[j] = array[counter];
            counter++;
        }
        return rotatedArray;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int counter = 0;
        for (int i = 0; i < array1.length; i++){
            if (array1[i].equals(valueToEvaluate)) {counter++;}
        }
        for (int j = 0; j < array2.length; j++){
            if (array2[j].equals(valueToEvaluate)) {counter++;}
        }
        return counter;
    }

    public Integer mostCommon(Integer[] array) {
        Arrays.sort(array);
        int currentCounter = 1;
        int maxCounter = 1;
        Integer mostCommonInteger = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i].equals(array[i-1])){
                currentCounter++;
            }
            else{
                if (currentCounter > maxCounter){
                    maxCounter = currentCounter;
                    mostCommonInteger = array[i-1];
                }
                currentCounter = 1;
            }
        }
        if (currentCounter > maxCounter){
            maxCounter = currentCounter;
            mostCommonInteger = array[array.length-1];
        }
        return mostCommonInteger;
    }
}
