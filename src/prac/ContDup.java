package prac;

import java.util.HashMap;

public class ContDup {

	public boolean containsNearbyDuplicate(int[] nums, int k) {
        
		if(nums==null || nums.length==0) return false;
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			if(hm.containsKey(nums[i]) && Math.abs(i-hm.get(nums[i]))<=k){
				return true;
			}else{
				hm.put(nums[i], i);
			}
		}
		return false;
    }
	
	public static void main(String[] args) {
		
		System.out.println(new ContDup().containsNearbyDuplicate(new int[]{1,2,3,4,5,6,1},8));
		
	}
	
}
