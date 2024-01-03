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

	int intersectionPoint(Node head1, Node head2){
	
		if(head1 == null || head2 == null){
		
			System.out.println("LinkedList is empty!!!");
			return -1;
		}else{
		
			Node temp1 = head1;
			while(temp1 != null){
			
				Node temp2 = head2.next;
				while(temp2 != null){
				
					if(temp1 == temp2){
					
						return temp1.data;
					}else{
					
						temp2 = temp2.next;
					}
				}
				temp1 = temp1.next;
			}

			return -1;
		}
	}
}

class YshapedLL{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);	
		MyLinkedList ll1 = new MyLinkedList();

		System.out.println("Enter size1 :");
		int size1 = sc.nextInt();

		System.out.println("Enter elements :");
		for(int i = 0; i < size1; i++){
		
			int data = sc.nextInt();
			ll1.addLast1(data);
		}

		MyLinkedList ll2 = new MyLinkedList();
		System.out.println("Enter size2 :");
                int size2 = sc.nextInt();

                System.out.println("Enter elements :");
                for(int i = 0; i < size2; i++){

                        int data = sc.nextInt();
                        ll2.addLast1(data);
                }

		ll2.head.next = ll1.head.next.next.next;
		int ret = new MyLinkedList().intersectionPoint(ll1.head, ll2.head);
		System.out.println(ret);
	}
}
