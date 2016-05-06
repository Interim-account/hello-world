import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

class MinStack {
    
    ArrayList<Integer> al = new ArrayList<>();
    TreeMap<Integer,Integer> tm = new TreeMap<>();
    
    public void push(int x) {
        al.add(x);
        
        if(!tm.containsKey(x)){
        	tm.put(x, 1);
        }else{
        	int val = tm.get(x);
        	tm.put(x, ++val);
        }
    }

    public void pop() {
        
    	if(tm.containsKey(al.get(al.size()-1))){
    		int val = tm.get(al.get(al.size()-1));
    		if(val>1){
    			tm.put(al.get(al.size()-1), --val);
    		}else{
    			tm.remove(al.get(al.size()-1));
    		}
    	}
    	
    	if(!al.isEmpty()){
        	al.remove(al.size()-1);
        }
   
    }

    public int top() {
        if(!al.isEmpty()){
        	return al.get(al.size()-1);
        }
        
        return -1;
    }

    public int getMin() {
        Set<Map.Entry<Integer, Integer>> st = tm.entrySet();
        for(Map.Entry<Integer, Integer> m:st){
        	if(m.getValue()>0){
        		return m.getKey();
        	}
        }
        return -1;
    }
    
}