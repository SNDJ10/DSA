class BinaryTest{
	public static void main (String [] args){
		int [] nums ={2,4,6,8,70};
		int target=70;
		int result = linearSearch(nums,target);
		int result1 = binarySearch(nums,target,0,nums.length);
		if(result!=-1){
			System.out.println("linearSearch "+result);
		}
		if(result1!=-1){
			System.out.println("binarySearch "+result1);
		}
		
	}
		public static int linearSearch(int [] nums,int target){
			int steps=0;
			for(int found=0;found<nums.length;found++){
				steps++;
				if(nums[found]==target){
					System.out.println("linearSearch steps "+steps);
					return found;
				}
			}
			System.out.println("linearSearch  steps"+steps);
			return -1;
		}
		public static int binarySearch(int [] nums ,int target,int left,int right){
			
			 
			while(left<=right){
				steps++;
				int mid =(left+right)/2;
				if(nums[mid]==target){
					System.out.println("binarySearch  steps"+steps);
					return mid;
					
				}else if(nums[mid]<target){
					return binarySearch(nums ,target,mid+1,right);
				}else{
					 return binarySearch(nums ,target,left,mid-1);
				}
			}
			System.out.println("binarySearch steps "+steps);
			return-1;
		}
}