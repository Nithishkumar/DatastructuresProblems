package com.coding;

public class HashTable {
    private  int[] hashArray;
    public HashTable(int data){
        this.hashArray=new int[data];
    }
    private int hashFunction(String key){
        int hashCode=0;
        for(int i=0;i<key.length();i++){
            hashCode=((hashCode+key.charAt(i)*i)%this.hashArray.length);
        }
        return hashCode;
    }

    private void set(String key,int value){
        int hashCode=hashFunction(key);
        this.hashArray[hashCode]=value;
    }

    private int get(String key){
        int hashCode=hashFunction(key);
        return this.hashArray[hashCode];
    }

    public static void main(String[] args) {
        HashTable hashTable=new HashTable(50);
        hashTable.set("hello",7);
        hashTable.set("Hi",6);
        System.out.println(hashTable.get("hello"));
        System.out.println(hashTable.get("Hi"));
    }

}
