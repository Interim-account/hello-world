package prac;

import java.util.ArrayList;
import java.util.List;

public class PascTri {

	public List<List<Integer>> generate(int rows) {
        
		List<List<Integer>> li = new ArrayList<>();
		
        if(rows==0) return li;
        
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        li.add(l1);
        
        if(rows==1) return li;
        
        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(1);
        li.add(l2);
        
        if(rows==2) return li;
        
        for(int i=2;i<rows;i++){
        	
        	List<Integer> al = new ArrayList<>();
        	List<Integer> te = li.get(i-1);
        	
        	al.add(1);
        	for(int j=1;j<i;j++){
        		al.add(te.get(j-1)+te.get(j));
        	}
        	al.add(1);
        	li.add(al);
        }
        
        return li;
    }
	
	public static void main(String[] args) {
		
		System.out.println(new PascTri().generate(5));
		
	}
}
