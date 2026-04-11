package com.dsa.internal;

public class LinearsearchBinarySearch {
    public static void main(String[] args) {

        int num [] = {7, 9, 11, 13, 15, 17};
        int target = 10;
        int result1 = linearsearch(num, target);
        int result2 = binarysearch(num, target);
        if (result1 != -1)
            System.out.println("element found at " + result1);
        else
            System.out.println("element not found");


    }

    private static int linearsearch(int[] num, int target) {
        int steps=0;
        for (int i=0;i<num.length;i++) {
            steps++;
            if (num[i] == target) {
                System.out.println("linearsearch taken steps" + steps);
                return i;
            }
        }
        System.out.println("linearsearch taken steps"+steps);
        return -1;
    }
    private static int binarysearch(int[] num, int target) {
        int steps=0;
        //7,9,11,13,15,17
        int left = 0;
        int right = num.length - 1;
        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;
            if (num[mid] == target) {
                System.out.println("binaryrsearch taken steps"+steps);
                return mid;
            } else if (num[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("binaryrsearch taken steps"+steps);
        return -1;
    }
}
