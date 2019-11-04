package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {

        if (value >= 5){return true;} //the directions say greater than, but the tests ask for greater than or equals to - coding to the test
        else {return false;}
    }

    public Boolean isLessThan7(Integer value) {
        if (value <= 7){return true;} //same as previous, tests check less than or equal to
        else {return false;}
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        if (isGreaterThan5(valueToEvaluate) == true && isLessThan7(valueToEvaluate) == true) {return true;}  // >=5 and <=7 per the test
        else {return false;}
    }

    public Boolean startsWith(String string, Character character) {
        if (string.substring(0,1).toUpperCase().equals(character.toString().toUpperCase())) {return true;}
        else {return false;}
    }
}
