package prac;

import java.util.ArrayList;
import java.util.List;

public class Range {

	static List<String> /*ArrayList<Integer>*/ range(int[] ar){
		
		if(ar==null || ar.length==0) return null;
		
		List<String> li = new ArrayList<>();
		ArrayList<Integer> al = new ArrayList<>();
		int count = ar[0];
		al.add(ar[0]);
		for (int i = 1; i < ar.length; i++) {
			if(++count == ar[i]){
				continue;
			}else{
				al.add(ar[i-1]);
				count = ar[i];
				al.add(ar[i]);
			}
		}
		al.add(ar[ar.length-1]);
		System.out.println(al);
		
		for(int i=0;i<al.size();i+=2){
			if((int)al.get(i)==(int)al.get(i+1)){
				li.add(new Integer(al.get(i)).toString());
			}else{
				li.add(al.get(i)+"->"+al.get(i+1));
			}
		}
		
		return li;
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println(Range.range(new int[]{-1000000000,-9999,0,1,2,10,100,1000,999999999,1000000000}));
		//System.out.println(Range.range(new int[]{-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,9,10,11,12,13,17,20,21,22,23,25}));
		
	}
}
