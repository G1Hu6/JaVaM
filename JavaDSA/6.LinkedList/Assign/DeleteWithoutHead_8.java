/*
 8. Delete without head pointer

 -You are given a pointer/ reference to the node which is to be deleted from the linked list of N
nodes. The task is to delete the node. Pointer/ reference to the head node is not given.

Note: No head reference is given to you. It is guaranteed that the node to be deleted is not a tail

node in the linked list.
Example 1:
Input:
N=2
value[] = {1,2}
node = 1
Output: 2
Explanation: After deleting 1 from the linked list, we have remaining nodes as 2.

Example 2:
Input:
N=4
value[] = {10,20,4,30}
node = 20
Output: 10 4 30
Explanation: After deleting 20 from the linked list, we have remaining nodes as 10, 4 and 30.

Expected Time Complexity : O(1)
Expected Auxiliary Space : O(1)

Constraints:
2 <= N <= 10^3
 */
import java.util.*;

class Node{

	Node next = null;
	int data;

	Node(int data){
	
		this.data = data;
	}
}

class MyLinkedList{
	Node head = null;
	
	void addFirst1(int data){
		Node newNode = new Node(data);

		if(head == null){
			head = newNode;
		}else{
			newNode.next = head;
			head = newNode;
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

	void addLast1(int data){
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

	void removeWithoutHead(Node del){

		if(del == null){
		
			return;
		}
		if(del.next == null){

			System.out.println("Last node");
			return;
		}

		del.data = del.next.data;
		del.next = del.next.next;
	}
}

class Client{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);	
		MyLinkedList ll = new MyLinkedList();

		System.out.println("Enter size :");
		int size = sc.nextInt();

		System.out.println("Enter elements :");
		for(int i = 0; i < size; i++){
		
			int data = sc.nextInt();
			ll.addLast1(data);
		}

		ll.printSLL();
		System.out.println("Enter Node for deletion :");
		
		ll.removeWithoutHead(ll.head.next.next);
		ll.printSLL();
	}
}

