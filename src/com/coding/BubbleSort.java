package com.coding;

public class BubbleSort {

    private void sort(Integer[] input) {
        int swapCounter=0;
        boolean firstTimeRun=true;
        for (int i = 0; i < input.length; i++) {
            if (firstTimeRun||swapCounter>0) {
                swapCounter=0;
                firstTimeRun=false;
                for (int j = 0; j < input.length - 1; j++) {
                    if (input[j] > input[j + 1]) {
                        int temp = input[j];
                        input[j] = input[j + 1];
                        input[j + 1] = temp;
                        swapCounter++;
                    }
                }
            }else{
                break;
            }
        }

    }

    private void printElements(Integer[] input) {
        for (Integer element : input) {
            System.out.print(element + " ");
        }
    }


    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,5,6,7,8};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(input);
        bubbleSort.printElements(input);
    }
}
