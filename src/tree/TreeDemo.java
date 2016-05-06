package tree;

import java.util.Scanner;

public class TreeDemo {

	static void run(){
		
		Scanner sc = new Scanner(System.in);
		Scanner scs = new Scanner(System.in);
		char cho = 'n';
		TreeClass tr = new TreeClass();
		
		do{
			System.out.println("Enter value");
			int inp = sc.nextInt();
			tr.insert(inp);
			System.out.println("Want to enter again");
			cho = scs.nextLine().charAt(0);
		}while(cho=='y');
		
		System.out.println("In traversal mode");
		
		char chi = 'n';
		do{
			System.out.println("1: Pre-order\n2: In-order\n3: Post-order");
			int inp = sc.nextInt();
			switch(inp){
			
			case 1:{
				new TreeOps().preOrderTraversal(tr.root);
				break;
			}
			case 2:{
				new TreeOps().inOrderTraversal(tr.root);
				break;
			}
			case 3:{
				new TreeOps().postOrderTraversal(tr.root);
				break;
			}
			
			}
			
			System.out.println("Traverse again..??");
			chi = scs.nextLine().charAt(0);
		}while(chi=='y');
		
	}
	
	public static void main(String[] args) {
		run();
	}
	
}
