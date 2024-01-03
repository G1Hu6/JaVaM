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

	void removeLoop(Node meet){
	
		Node ptr1 = meet;
		Node ptr2 = meet;

		while(ptr2.next != ptr1){
		
			ptr2 = ptr2.next;
		}
		ptr2.next = null;
	}

	void detectLoop(){
	
		Node slow = head;
		Node fast = head.next;

		while(slow != null && fast != null){
		
			fast = fast.next;
			if(fast != null){
			
				fast = fast.next;
			}
			slow = slow.next;

			if(slow == fast){
			
				removeLoop(slow);
				System.out.println("Loop is present");
			}
		}

		System.out.println("Loop is absent");
	}
}

class RemoveLoop{

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
		ll.
	}
}
