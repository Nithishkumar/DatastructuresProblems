package com.coding;

import java.util.ArrayList;
import java.util.List;

public class StackImplementationWithArray {
    private List<String> stackList;
    private int top=0;
    public StackImplementationWithArray(){
        stackList=new ArrayList<>();
    }

    private void push(String s){
        stackList.add(s);
        top++;
    }

    private String pop(){
        String s=stackList.get(top-1);
        stackList.remove(top-1);
        top--;
        return s;
    }


    public static void main(String[] args) {
        StackImplementationWithArray s=new StackImplementationWithArray();
        s.push("h");
        s.push("i");
        System.out.println(s.pop());
        System.out.println(s.pop());

    }


}
