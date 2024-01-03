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

	boolean isContainLoop(int k){
	
		if(head == null){
			
			System.out.println("Linked List is empty");
			return false;
		}else if(k <= 0 && k > countNode()){
		
			System.out.println("Invalid value of k");
			return false;
		}else{
		
			Node slow = head;
			Node fast = head.next;
			while(slow != fast && fast != null){
			
				fast = fast.next;
				if(fast != null){
				
					fast = fast.next;
				}
				slow = slow.next;
			}
			if(fast == null){
			
				return false;
			}else{

				return true;
			}
		}
	}
}

class DetectLoopInLinkedList{

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

		System.out.println("Enter k :");
                int k = sc.nextInt();
		
		if(!ll.isContainLoop(k)){
		
			System.out.println("Not contain loop");
		}else{
	
			System.out.println("Given LL contain loop");
		}
	}
}
