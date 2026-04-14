package com.dsa.internal;

public class Linearsearch {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6};
        int target = 4;
        int result1 = linearsearch(nums, target);
        int result2 = binarysearch(nums, target, 0, nums.length - 1);
        if (result1 != -1)
            System.out.println("this is index found" + result1);
        else
            System.out.println("element is not found");
    }

    public static int linearsearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("steps we taken linearsearch :" + steps);
                return i;
            }
        }
        System.out.println("steps we taken linearsearch :" + steps);
        return -1;

    }

    public static int binarysearch(int[] nums, int target, int left, int right) {
        int steps = 0;
        if (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;

            } else if (nums[mid] < target) {
                return binarysearch(nums, target, mid + 1, right);
            } else {
                return binarysearch(nums, target, left, mid - 1);
            }
        }
//       int left=0;
//       int right=nums.length-1;
//      while (left<=right){
//          steps++;
//    int mid =(left+right)/2;
//    if (nums[mid]==target) {
//        System.out.println("steps we taken binary :"+steps );
//        return mid;
//    } else if (nums[mid]<target) {
//       left=mid+1;
//    }else
//        right=mid-1;
//}
//        System.out.println("steps we taken  binary:"+steps );
            return -1;

        }

}
