package com.dsa.extrenal;

public class LinearSearch {
    public static void main(String[] args) {
        int nums [] =new int[1000];
        int target = 900;
        int result1 =linearsearch(nums,target);
        int result2 =binarysearch(nums,target,0,nums.length-1);
        if (result1!=-1) {
            System.out.println("element  found at index :" + result1);

        }else {
            System.out.println("element not found at index");
        }
    }

    private static int linearsearch(int[] nums, int target) {
        int steps=0;
        for (int ele=0;ele<nums.length;ele++){
            steps++;
           if (nums[ele]==target){
               System.out.println("linearsearch taken steps  :"+steps);
               return ele;
           }
        }
        System.out.println("linearsearch taken steps  :"+steps);
        return -1;
    }
    private static int binarysearch(int[] nums, int target ,int left,int right) {


        while (left<=right){
           int mid=(left+right)/2;
           if (nums[mid]==target){
        return mid;

           } else if (nums[mid]<target) {
               return binarysearch(nums,target,mid+1,right);
           }else
               return binarysearch(nums,target,left,mid-1);
        }
//        int steps=0;
//       int left=0;
//       int right=nums.length-1;
//       while (left<=right){
//           steps++;
//           int mid=(left+right)/2;
//           if (nums[mid]==target){
//               System.out.println("binarysearch taken steps  :"+steps);
//               return mid;
//
//            }else if (nums[mid]<target){
//               left=mid+1;
//           }else {
//               right=mid-1;
//           }
//        }
//        System.out.println("binarysearch taken steps  :"+steps);
        return -1;
    }

    }

