package com.coding;

import java.util.HashMap;
import java.util.Map;

public class ArrayWithSameElementOrNot {

    private static Boolean checkArrayWithSameElementOrNot(char[] input1,char[] input2){
        Map<Character,Character> elementsMap=new HashMap<>();
        for (char c : input1) {
            elementsMap.put(c,c);
        }
        for(char c:input2){
            if(elementsMap.containsKey(c)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[] input1={'a','b','c'};
        char[] input2={'e','e','e'};
        System.out.println("Same element present :"+checkArrayWithSameElementOrNot(input1,input2));
    }
}
