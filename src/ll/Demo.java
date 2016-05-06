package ll;

import java.util.Scanner;

public class Demo {

	static List li = new List();
	
	static void insert(){

		Scanner sc = new Scanner(System.in);
		Scanner scs = new Scanner(System.in);
		char ch='n';
		do{
			System.out.println("Enter data");
			int inp = sc.nextInt();
			li.insert(inp);
			li.display();
			System.out.println("\nEnter again");
			ch = scs.nextLine().charAt(0);
		}while(ch=='y'||ch=='Y');
	}
	
	static void displayModified(){
		
		Node o = li.modify();
		if(o==null){
			System.out.println("o empty");
		}
		while(o!=null){
			System.out.print(o.val+"->");
			o = o.next;
		}
	}

	
	public static void main(String[] args) {
		insert();
		System.out.println("Modified\n");
		displayModified();
	}

}
