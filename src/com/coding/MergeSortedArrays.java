package com.coding;

public class MergeSortedArrays {

    private static int[] getMergeSortedArray(int[]arr1,int[]arr2){
        //initialize pointers
        int i=0;
        int j=0;
        int k=0;
        //initialize resultant array
        int[]resultArray=new int[arr1.length+arr2.length];

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                resultArray[k]=arr1[i];
                k++;
                i++;
            }else{
                resultArray[k]=arr2[j];
                k++;
                j++;
            }
        }
        if(i-1==arr1.length-1){
          for(int l=j;l<arr2.length;l++){
              resultArray[k]=arr2[l];
              k++;
          }
        }else{
            for(int l=i;l<arr1.length;l++){
                resultArray[k]=arr1[l];
                k++;
            }
        }
        return resultArray;

    }
    public static void main(String[] args) {
        int[] array1={0,3,4,31};
        int[] array2={4,6,30};
        int[] resultArray=getMergeSortedArray(array1,array2);
        for(int i:resultArray){
            System.out.print(i);
        }
    }
}
