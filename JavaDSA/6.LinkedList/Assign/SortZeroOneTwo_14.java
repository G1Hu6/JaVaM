import java.util.*;

import java.util.*;

class Node{
	int data = 0;
	Node prev = null;
	Node next = null;

	Node(int data){
		this.data = data;
	}
}

class LinkedList{
	Node head = null;

	void addFirst(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}else{
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

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
			newNode.prev = temp;	// temp.next.prev = temp;
		}
	}

	int countNode(){
		int count = 0;
		if(head == null){
			return count;
		}else{
			Node temp = head;

			while(temp != null){
	
				count++;
				temp = temp.next;
			}
			return count;
		}
	}

	void addAtPosition(int data, int pos){
		if(pos <= 0 || pos >= countNode()+2){

			System.out.println("Entered Position is Invalid");
		}else if(pos == 1){
			
			addFirst(data);
		}else if(pos == countNode()+1){
		
			addLast(data);
		}else{
			
			Node newNode = new Node(data);
                	Node temp = head;

			while(pos-2 != 0){
				temp = temp.next;
				pos--;
			}
			newNode.next = temp.next;
			(temp.next).prev = newNode;
			temp.next = newNode;
			newNode.prev = temp;
		}
	}

	void removeFirst(){
		if(head == null){
			System.out.println("Doubly LinkedList is Empty!!!");
		}else if(countNode() == 1){
			head = null;
		}else{
			head = head.next;
			head.prev = null;
		} 
	}

	void removeLast(){	
		if(head == null){
			System.out.println("Doubly LinkedList is Empty!!!");
		}else if(countNode() == 1){
			head = null;
		}else{
			Node temp = head;

			while(temp.next != null){
				temp = temp.next;
			}
			temp.prev.next = null;
			//temp.prev = null;
		} 
	}

	void removeAtPosition(int pos){		
		if(pos <= 0 || pos >= countNode()+1){

			System.out.println("Entered Position is Invalid");
		}else if(pos == 1){
			
			removeFirst();
		}else if(pos == countNode()){
		
			removeLast();
		}else{
                	Node temp = head;

			while(pos-2 != 0){
				temp = temp.next;
				pos--;
			}
			temp.next = temp.next.next;
			temp.next.prev = temp;
		}
			
	}

	void printDLL(){
		if(head == null){
			System.out.println("Doubly LinkedList is Empty!!!");
		}else{
			Node temp = head;

			while(temp != null){
				if(temp.next == null){
					System.out.print(temp.data);
				}else{
					System.out.print(temp.data + " <-> ");
				}
				temp = temp.next;
			}
			 System.out.println();
		}
	}

	void sortLL(){
	
		if(head == null){
		
			return;
		}else{
		
			Node start = head;
			Node end = head;
			while(end.next != null){
			
				end = end.next;
			}
			Node mid = head;

			while(mid != end.next){
			
				if(mid.data == 0){
				
					int temp = start.data;
					start.data = mid.data;
					mid.data = temp;

					mid = mid.next;
					start = start.next;
				}else if(mid.data == 1){
				
					mid = mid.next;
				}else if(mid.data == 2){
				
					int temp = mid.data;
					mid.data = end.data;
					end.data = temp;

					end = end.prev;
				}
			}
		}
	}
}

class SortZeroOneTwo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);	
		LinkedList ll = new LinkedList();

		System.out.println("Enter size :");
		int size = sc.nextInt();

		System.out.println("Enter elements :");
		for(int i = 0; i < size; i++){
		
			int data = sc.nextInt();
			ll.addLast(data);
		}

		ll.printDLL();
		ll.sortLL();
		ll.printDLL();
	}
}
