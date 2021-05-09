package com.coding;

public class ReverseString {
    private static String getReverseString(String data){
        if(data!=null && !data.equalsIgnoreCase("")){
            String reversedString="";
            char[] charArray=data.toCharArray();
            for(int i=charArray.length-1;i>=0;i--){
                reversedString=reversedString+charArray[i];
            }
            return reversedString;
        }else{
            return "Input is invalid";
        }
    }

    private static String getReverseStringUsingBuilder(String data){
        StringBuilder builder=new StringBuilder(data);
        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        String input ="Hello";
        System.out.println(getReverseString(input));
        System.out.println(getReverseStringUsingBuilder(input));
    }
}
