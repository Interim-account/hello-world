package prac;

public class ListOperations {

	public ListNode insertionSortList(ListNode head) {

		if(head==null) return null;
		if(head.next==null) return head;

		if(head.val>head.next.val){
			int temp = head.val;
			head.val = head.next.val;
			head.next.val=temp;
		}

		if(head.next.next==null) return head;


		ListNode current = head.next.next;


		return null;
	}


	void insert(ListNode head, ListNode newNode){

		newNode.next=head;
		head = newNode;

	}

	void display(ListNode head){

		if(head!=null){
			ListNode current = head;
			while(current!=null){
				System.out.print(current.val+"->");
				current = current.next;
			}
		}else{
			System.out.println("List empty");
		}

	}

}
