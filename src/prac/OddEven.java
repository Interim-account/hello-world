package prac;

public class OddEven {

	public ListNode oddEvenList(ListNode head) {
        
		if(head==null || head.next==null) return head;
		
		ListNode co=null,ce=null,st=co,mid=ce;
		
		ListNode current=head;
		while(current!=null){
			
			if(current.val%2==0){
				ListNode newNode = new ListNode(current.val);
				newNode.next=ce;
				ce = newNode;
			}else{
				ListNode newNode = new ListNode(current.val);
				newNode.next=co;
				co = newNode;
			}
			
			current = current.next;
		}
		
		co.next=mid;
		
		return st;
    }
	
}
