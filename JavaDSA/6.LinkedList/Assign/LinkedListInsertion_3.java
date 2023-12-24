import java.util.*;

class Node{
	int data = 0;
	Node next = null;

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

	void createNewLinkedList(){
		
		if(head == null){
		
			System.out.println("LinkedList is empty");
		}else{
		
			LinkedList<Integer> val = new LinkedList<Integer>();
			Node temp = head;
			while(temp.next != null){
				
				int a = temp.data;
				if(temp.next.data == 0){
					
					val.addFirst(a);
				}else if(temp.next.data == 1){
				
					val.addLast(a);
				}
				temp = temp.next;
			}
			
			System.out.println(val);
		}
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
		ll.createNewLinkedList();
	}
}
