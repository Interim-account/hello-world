import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ZeroShift {
	
	 public List<String> summaryRanges(int[] nums) {
	        
	        if(nums==null || nums.length==0) return null;
	        
	        
	        List<String> li = new ArrayList<>();
	        if(nums.length==1){
	            String s = new Integer(nums[0]).toString();
	            li.add(s);
	            return li;
	        }
	        
	        int start = nums[0];
	        boolean flag = true;
	        int i=1;
	        StringBuilder sb = null,temp=null;
	        while(i<nums.length){
	        	if(flag){
	        		sb = new StringBuilder();
	        		temp = new StringBuilder();
	        		temp.append(start);
	        		sb.append(start);
	        	}
	        	
	        	if(nums[i]==++start){
	        		flag = false;
	        		temp.append(nums[i]);
	        		i++;
	        		continue;
	        	}else{
	        		
	        		flag = true;
	        		
	        		if(temp!=null && temp.length()==1){
	        			li.add(sb.toString());
	        			start = nums[i];
	        		}else if(temp!=null && temp.length()>1 &&i!=nums.length-1){
	        			sb.append("->");
	        			sb.append(nums[i-1]);
	        			li.add(sb.toString());
	        			start = nums[i];
	        		}else if(temp!=null && temp.length()>1 &&i==nums.length-1){
	        			sb.append("->");
	        			sb.append(nums[i]);
	        			li.add(sb.toString());
	        		}
	        		
	        		sb=null;
        			temp=null;
	        		
	        	}
	        	i++;
	        }
	        return li;
	    }
      
	public static void main(String[] args) {
		List<String> range = new ZeroShift().summaryRanges(new int[]{1,2,3,12,5,6,7,8,9,10,12,13,14,17});
		System.out.println(range);
	}
}
