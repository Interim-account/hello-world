package ll;

public class List {

	Node start;
	
	void insert(int data){
		
		Node newNode = new Node(data);
		newNode.next=start;
		start = newNode;
		
	}
	
	
	void display(){
		
		if(start!=null){
			Node current = start;
			while(current!=null){
				System.out.print(current.val+"->");
				current = current.next;
			}
		}else{
			System.out.println("List empty");
		}
	}
	
	Node modify(){
		
		if(start==null) return null;
		
		Node oddList=null,evenList=null;
		Node head = oddList;
		Node join = evenList;
		Node current = start;
		while(current!=null){
			if(current.val%2==0){
				Node newNode = new Node(current.val);
				newNode.next=evenList;
				evenList = newNode;
			}else{
				Node newNode = new Node(current.val);
				newNode.next=oddList;
				oddList = newNode;
			}
			current = current.next;
		}
		
		oddList.next=join;
		return head;
	}
	
}
