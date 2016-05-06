package prac;

public class FibDP {
	
	public int rob(int[] nums) {
        
		if(nums==null || nums.length==0) return 0;
		
		int rp=0, dnrp=0;
		
		for (int i = 0; i < nums.length; i++) {
			int cnr = Math.max(rp, dnrp);
			int cir = dnrp + nums[i];
			dnrp = cnr;
			rp = cir;
		}
		
		return Math.max(rp, dnrp);
    }
	
	public static void main(String[] args) {
		
		System.out.println(new FibDP().rob(new int[]{2,5,4,7,5,2,1}));
		
	}

}
