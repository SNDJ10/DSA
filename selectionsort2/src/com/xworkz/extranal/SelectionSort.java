package com.xworkz.extranal;

public class SelectionSort {
    public static void main(String[] args) {
        int nums [] ={11,3,7,9,5};
        int size= nums.length;
        int minIndex=-1;
        int temp=0;
        System.out.println("before sort");
        for (int num:nums){
            System.out.print(" "+num);

        }
        for (int i=0;i<size-1;i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

            System.out.println();
            for (int num : nums) {
                System.out.print(" " + num);
            }
        }
        System.out.println();
        System.out.println("after sort ");
        for (int num:nums){
            System.out.print(" " +num);

        }
    }
}
