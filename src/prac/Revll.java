package prac;

import java.util.ArrayList;
import java.util.HashMap;

public class Revll {

	public ListNode deleteDuplicates(ListNode head) {
        
		if(head==null) return head;
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		ListNode current = head;
		
		while(current!=null){
			if(!hm.containsKey(current.val)){
				hm.put(current.val, 1);
			}else{
				int val = hm.get(current.val);
				hm.put(current.val, ++val);
			}
			current = current.next;
		}
		
		while(head!=null){
			if(hm.get(head.val)>1){
				head = head.next;
			}else{
				break;
			}
		}
		
		ListNode prev = head;
		
		if(head.next==null) return head;
		
		ListNode cur = head.next;
		
		while(cur!=null){
			if(hm.get(cur.val)>1){
				cur = cur.next;
				continue;
			}else{
				prev.next=cur;
				prev = cur;
				cur = prev.next;
			}
			
		}
		
		return head;
    }
}
