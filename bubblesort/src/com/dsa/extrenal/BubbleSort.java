package com.dsa.extrenal;

public class BubbleSort {
    public static void main(String[] args) {
        int num[] = {9, 5, 4, 8, 6, 7};
        int size = num.length;
        int temp = 0;
        System.out.println("before sorting");
        for (int nums : num) {
            System.out.print(nums + " ");
        }


        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size  - 1; j++) {

                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }

            }
            System.out.println("");
            for (int nums : num) {
                System.out.print(nums + " ");
            }
        }
        System.out.println();
        System.out.println("after sorting sorting");
        for (int nums : num) {
            System.out.print(nums + " ");
        }

    }
}

