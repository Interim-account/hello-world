package prac;

import java.util.Arrays;

public class Peak {
	
	/*public int findKthLargest(int[] nums, int k) {
        
		if(nums==null || nums.length==0) return Integer.MIN_VALUE;
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		for (int i = 0; i < nums.length; i++) {
			ts.add(nums[i]);
		}
		
		//System.out.println(ts);
		
		int index = ts.size()-k+1;
		int count = 0;
		for(int m:ts){
			++count;
			if(count==index){
				return m;
			}
		}
		
		return 0;
    }*/
	
	public int findKthLargest(int[] nums, int k) {
		
		if(nums==null || nums.length==0) return Integer.MIN_VALUE;
		
		Arrays.sort(nums);
		
		int count = 0;
		for(int i=nums.length-1;i>=0;i--){
			
			++count;
			if(count==k){
				return nums[i];
			}
			
		}
			
			
		return 0;
	}
	 
	 public static void main(String[] args) {
		
		 System.out.println(new Peak().findKthLargest(new int[]{1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6},2));
		 
	}

}
