import java.util.*;

class LinkedList{

	class Node{
                Node next = null;
                int data;

                Node(int data){
                        this.data = data;
                }
	}

	Node head = null;

	void addLast(int data){
		Node newNode = new Node(data);

		if(head == null){
			head = newNode;
		}else{
			Node temp = head;

			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	int countNode(){
		Node temp = head;
		int count = 0;

		while(temp != null){
			count++;
			temp = temp.next;
		}
		return count;
	}

	void printSLL(){
		if(head == null){
			System.out.println("Empty");
		}
		Node temp = head;

		while(temp.next != null){
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print(temp.data + "\n");
	}

	void reverseSwap(){

		int count = countNode();

		if(head == null){
			return;
		}else{
			int len = countNode();
			
			while(count < len/2){
				

			}
		}
	}

	void reverseItr(){
		
		if(head == null){
			return;
		}else{

		Node prev = null;
		Node curr = head;
		Node forward = null;

		while(curr != null){
			forward = curr.next;
			curr.next = prev;	 //curr.next = null;
			prev = curr;
			curr = forward;
		}
		head = prev;
		}
	}

	void reverseRec(){

		//...
	}
}

class Client{
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		Scanner sc = new Scanner(System.in);

		char ch;
		do{
			
			System.out.println("1. Add node");
			System.out.println("2. Print");
			System.out.println("3. Reverse LinkedList by Iterative");
			System.out.println("4. Reverse LinkedList by Recursive");

			System.out.println("Enter Choise :");
			int choise = sc.nextInt();

			switch(choise){

				case 1: {
				
					System.out.println("Enter data");
					int data = sc.nextInt();
					ll.addLast(data);
					break;	
				}
				case 2: {
					ll.printSLL();
					break;
				}
				case 3: {
					ll.reverseItr();
					break;
				}
				case 4: {
					ll.reverseRec();
					break;
				}
			}

			System.out.println("Continue ?");
			ch = sc.next().charAt(0);
		}while(ch == 'Y' && ch == 'y');
	}
}
