import java.util.*;

class Node{
	int data = 0;
	Node next = null;

	Node(int data){
		this.data = data;
	}
}

class InvalidPositionException extends RuntimeException{
	InvalidPositionException(String str){
		super(str);
	}
}

class LinkedList{
	Node head = null;
	
	// Add newly created Node at first position in LinkedList
	void addFirst(int data){
		Node newNode = new Node(data);

		if(head == null){
			head = newNode;
		}else{
			newNode.next = head;
			head = newNode;
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

	void addAtPosition(int data, int pos){
		if(pos <= 0 || pos >= countNode()+2){
			
			System.out.println("Entered Position is Invalid");
                        //throw new InvalidPositionException("Entered Position is Invalid");
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
			System.out.println("LinkedList is Empty");
			return;
		}else if(countNode() == 1){
			head = null;
		}else{
			head = head.next;
		}
	}

	void removeLast(){
		if(head == null){
                        System.out.println("LinkedList is Empty");
                        return;
                }else if(countNode() == 1){
                        head = null;
                }else{
                        Node temp = head;

			while((temp.next).next != null){
				temp = temp.next;
			}
			temp.next = null;
                }
	}

	void removeAtPosition(int pos){
		if(pos <= 0 || pos >= countNode()+1){

                        System.out.println("Entered Position is Invalid");
                        //throw new InvalidPositionException("Entered Position is Invalid");
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

                }

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
}

class Client{
	public static void main(String[] args){
		LinkedList ll = new LinkedList();

		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);

		ll.printSLL();

		ll.addLast(15);
		ll.printSLL();

		ll.addAtPosition(11, 1);
		ll.printSLL();

		ll.removeAtPosition(2);
		ll.printSLL();
	}
}
