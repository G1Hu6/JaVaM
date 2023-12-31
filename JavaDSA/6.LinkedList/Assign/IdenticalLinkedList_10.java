import java.util.*;

class Node{
	int data = 0;
	Node next = null;

	Node(int data){
		this.data = data;
	}
}

class IdenticalLinkedList{
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

	static boolean isIdentical(IdenticalLinkedList l1, IdenticalLinkedList l2){
	
		if(l1.countNode() != l2.countNode()){
		
			return false;
		}else{
		
			Node temp1 = l1.head;
			Node temp2 = l2.head;

			while(temp1 != null){
			
				if(temp1.data != temp2.data){
				
					return false;
				}else{
				
					temp1 = temp1.next;
					temp2 = temp2.next;
				}
			}
			return true;
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

		Scanner sc = new Scanner(System.in);	
		IdenticalLinkedList ll1 = new IdenticalLinkedList();
		IdenticalLinkedList ll2 = new IdenticalLinkedList();
		
		IdenticalLinkedList ll = new IdenticalLinkedList();

		System.out.println("Enter size :");
		int size1 = sc.nextInt();

		System.out.println("Enter elements :");
		for(int i = 0; i < size1; i++){
		
			int data = sc.nextInt();
			ll1.addLast1(data);
		}

		System.out.println("Enter size :");
                int size2 = sc.nextInt();

                System.out.println("Enter elements :");
                for(int i = 0; i < size2; i++){

                        int data = sc.nextInt();
                        ll2.addLast1(data);
                }
		
		if(ll.isIdentical(ll1, ll2)){
		
			System.out.println("Identical");
		}else{
		
			System.out.println("Not Identical");
		}
	}
}
