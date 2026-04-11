package com.dsa.external;

public class LinearSearch {
    public static void main(String[] args) {
        int nums[] ={5,7,9,11,13,15};
        int target=9;
        int result =linearsearch(nums,target);
        if (result!=-1)
        System.out.println("element index found at  : "+result);
        else
            System.out.println("element not found");

    }

     private static int linearsearch(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            if (nums[i]==target)
               return i;
        }
        return -1;
    }

}
