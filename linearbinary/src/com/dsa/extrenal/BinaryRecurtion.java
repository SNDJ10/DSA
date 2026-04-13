package com.dsa.extrenal;

public class BinaryRecurtion {
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7,8};
        int target=5;
        int result =linearsearch(number,target);
        if(result!=-1){
            System.out.println("target is found at :" +result);
        }else {
            System.out.println("target vis not found");
        }

    }

    public static int linearsearch(int [] number,int target) {
        int steps=0;
        for (int num=0;num<number.length-1;num++){
            steps++;
            if (number[num]==target){
                System.out.println("linearsearch taken steps  :"+steps);
                return num;
            }
        }
        System.out.println("linearsearch taken is  steps  :"+steps);
        return -1;
    }
    public static int binartSearch(int [] number,int target,int left,int right) {
        //1,2,3,4,5,6,7,8
    while (left<=right){
        int mid= (left+right)/2;
        if (number[mid]==target){
            return mid;


        } else if (number[mid]<target) {
            return binartSearch(number,target ,mid+1,right);
            
        }
        return binartSearch(number,target,left,mid-1);

    }
        return -1;
    }
}
