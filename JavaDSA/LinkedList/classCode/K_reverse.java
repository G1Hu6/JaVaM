
import java.util.*;

class LinkedList{
	Node head = null;
	
	class Node{
		int data = 0;
		Node next = null;

		Node(int data){
			this.data = data;
		}
	}
	
	//  Add newly created Node at last position in LinkedList
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
	
	// Print created SinglyLinkedList
	void printSLL(){
		if(head == null){
			System.out.println("LinkedList is Empty!!!");
		}else{
			Node temp = head;

			while(temp != null){
				if(temp.next == null){
					System.out.print(temp.data);
				}else{
					System.out.print(temp.data + " -> ");
				}
				temp = temp.next;
			}
			System.out.println();
		}
	}

	Node kReverse(Node prev, Node curr, Node forward, int k){
		
		Node temp = curr;
		if(curr == null){
			return curr;
		}

		int count = 0;

		while(count < k && curr != null){
			
			forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr = forward;
			count++;
		}
		temp.next = kReverse(prev, curr, forward, k);
		
		head = prev;
		return prev;

	}
}

class K_ReverseLinkedList{
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		Scanner sc = new Scanner(System.in);

		char ch;
		do{

			System.out.println("1. Add node");
			System.out.println("2. Print");
			System.out.println("3. Kth Reverse LinkedList By Recursive");
			//System.out.println("4. Reverse LinkedList by Recursive");

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
					ll.kReverse(null, ll.head, null, 3);
					break;
				}
				default: {
					System.out.println("Incorrect Input");
					break;	
				}
			}

			System.out.println("Continue ?");
			ch = sc.next().charAt(0);
		}while(ch == 'Y' || ch == 'y');
	}
}
