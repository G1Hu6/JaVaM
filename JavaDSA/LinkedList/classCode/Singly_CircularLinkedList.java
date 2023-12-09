import java.util.*;

class Node{
	int data = 0;
	Node next = null;

	Node(int data){
		this.data = data;
	}
}

class CircularLinkedList{
	Node head = null;

	void addFirst(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			newNode.next = head;
		}else{
			Node temp = head;

			while(temp.next != head){
				temp = temp.next;
			}
			newNode.next = head;
			head = newNode;
			temp.next = head;
		}
	}

	void addLast(int data){
		Node newNode = new Node(data);

		if(head == null){
			head = newNode;
			newNode.next = head; 
		}else{
			Node temp = head;

			while(temp.next != head){
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.next = head;
	
		}
	}

	int countNode(){
		int count = 0;
		if(head == null){
			return count;
		}else{
			Node temp = head;

			while(temp.next != head){
	
				count++;
				temp = temp.next;
			}
			return ++count;
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
			temp.next = newNode;
		}
	}

	void removeFirst(){
		if(head == null){
			System.out.println("Singly CircularLinkedList is Empty!!!");
		}else if(countNode() == 1){
			head = null;
		}else{
			Node temp = head;

			while(temp.next != head){
				temp = temp.next;
			}
			head = head.next;
			temp.next = head;
		} 
	}

	void removeLast(){	
		if(head == null){
			System.out.println("Singly CircularLinkedList is Empty!!!");
		}else if(countNode() == 1){
			head = null;
		}else{
			Node temp = head;

			while(temp.next.next != head){
				temp = temp.next;
			}
			temp.next.next = null;
			temp.next = head;
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
			//temp.next.next = null;
		}
			
	}

	void printSCLL(){
		if(head == null){
			System.out.println("SinglyCircular LinkedList is Empty!!!");
		}else{
			Node temp = head;
			//int dashCount = 0;
			while(temp.next != head ){
				//dashCount++;
				System.out.print(temp.data + " <-> ");
				temp = temp.next;
			}
			System.out.println(temp.data);

			/*
			if(countNode() == 0){
				System.out.print("|_|");
			}else{
			System.out.print(" |_");
			for(int i = 0; i < dashCount; i++){
				System.out.print("___");
			}
			System.out.print("_| ");
			}
			System.out.println();
			*/
		}
	}
}

class Client{
	public static void main(String[] args){
		/*
		LinkedList dll = new LinkedList();

		dll.printDLL();
		dll.addFirst(10);
		dll.addFirst(20);
		dll.addFirst(30);

		dll.printDLL();

		dll.addLast(50);
		dll.printDLL();

		dll.addAtPosition(25,3);
		dll.printDLL();

		dll.removeAtPosition(5);
		dll.printDLL();
		*/

		CircularLinkedList dll = new CircularLinkedList();
		Scanner sc = new Scanner(System.in);
		char ch;

		do{
			System.out.println("******** SinglyCircular LinkedList *******");
			System.out.println("1. Add First");
			System.out.println("2. Add Last");
			System.out.println("3. Add At Position");
			System.out.println("4. Delete First");
			System.out.println("5. Delete Last");
			System.out.println("6. Delete At Position");
			System.out.println("7. Count Nodes");
			System.out.println("8. Print Doubly LinkedList");

			System.out.println("Enter Input :");
			int choise = sc.nextInt();

			switch(choise){
				case 1:{

					System.out.println("Enter Data :");
					int data = sc.nextInt();
					dll.addFirst(data);	
				}
					break;

				case 2:{

					System.out.println("Enter Data :");
                                        int data = sc.nextInt();
                                        dll.addLast(data);
				}
					break;

				case 3:{
					
					System.out.println("Enter Data :");
                                        int data = sc.nextInt();
					System.out.println("Enter Position :");
					int pos = sc.nextInt();
                                        dll.addAtPosition(data, pos);
				}
					break;

				case 4:
					dll.removeFirst();
					break;

				case 5:
					dll.removeLast();
					break;

				case 6:{
					System.out.println("Enter Position :");
                                        int pos = sc.nextInt();
                                        dll.removeAtPosition(pos);
				}
					break;

				case 7:
					System.out.println(dll.countNode());
					break;
				case 8:
					dll.printSCLL();
					break;

				default :{
					System.out.println("Invalid Input");
					choise = sc.nextInt();
				}
					break;

			}
			System.out.println("Continue ?");
			ch = sc.next().charAt(0);
		}while(ch == 'Y' || ch == 'y');
	}
}
