package com.coding;

import java.util.HashSet;
import java.util.Set;

public class RecurringCharacter {
    public static void main(String[] args) {
        int[] input={2,5,1,2,3,5,1,2,4};
        System.out.println(recurringCharacter(input));
    }
    private static String recurringCharacter(int[]inputArray){
        Set<Integer> inputSet=new HashSet<>();
        for(int i:inputArray){
            if(!inputSet.add(i)){
                return  String.valueOf(i);
            }
        }
        return "undefined";
    }
}
