package com.xworkz.extrenal;

public class LinearSearch {

    public static void main(String[] args) {
        int nums [] ={1,3,5,7,9,11,13,15,17,19};
        int target= 13;
        int result1=linearseach(nums,target);
        int result2=binaryseach(nums,target,0,nums.length-1);
        if (result1!=-1){
            System.out.println("element found at index " + result1);
        }else {
            System.out.println("element not found");
        }
    }

    private static int linearseach(int[] nums, int target) {
        int steps =0;
        for (int i=0;i<nums.length;i++){
            steps++;
            if (nums[i]==target){
                System.out.println("steps taken linear "+steps);
                return i;
            }
        }
        System.out.println("steps taken linear "+steps);
        return -1;
    }


    public static int binaryseach(int[] nums, int target,int left,int right) {
        int steps =0;
      if (left<=right) {
           steps++;
          int mid = (left + right) / 2;
          if (nums[mid] == target) {
              return mid;
          } else if (nums[mid] < target) {
              return binaryseach(nums, target, mid+1, left);

          } else
              return binaryseach(nums, target, right,mid-1);
      }
//        int steps=0;
//        int left=0;
//        int right =nums.length-1;
//        while (left<=right){
//            steps++;
//            int mid =(left+right)/2;
//            if (nums[mid]==target) {
//                System.out.println("steps taken binary "+steps);
//                return mid;
//            }
//        else if (nums[mid]<target) {
//            left=mid+1;
//            }else {
//                right = mid - 1;
//            }
//        }
//        System.out.println("steps taken binary "+steps);
        return -1;
    }


}
