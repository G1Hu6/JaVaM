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

	int countNodeUpto(Node end){
		
		int count = 0;
		Node temp = head;		


		while(temp != end.next){
			count++;
			temp = temp.next;
		}

		return count;
	}

	Node middleNode(Node start, Node end){

                        if(head == null){

                                return head;
                        }else{

                                Node fast = start.next;
                                Node slow = start;

                                while(fast != end){

                                        fast = fast.next;
                                        if(fast != end){

                                                fast = fast.next;
                                        }
                                        slow = slow.next;
                                }
                                return slow;
  	                 }
       }

}

class SortingAlgo{

	static void merge(LinkedList ll, Node start, Node mid, Node end){
		
		//int n1 = (ll.countLength(start, mid) - ll.countLength(start, start) + 1);
		//int n2 = (ll.countLength(start, end) - ll.countLength(start, mid));
		int n1 = (ll.countNodeUpto(mid) - ll.countNodeUpto(start) + 1);
		int n2 = (ll.countNodeUpto(end) - ll.countNodeUpto(mid));

		int arr1[] = new int[n1];
		int arr2[] = new int[n2];

		Node temp1 = start;
		for(int i = 0; i < n1; i++){
			
			arr1[i] = temp1.data;
			temp1 = temp1.next;
		}

		Node temp2 = mid.next;
		for(int i = 0; i < n2; i++){

                        arr2[i] = temp2.data;
			temp2 = temp2.next;
                }

		int i = 0, j = 0, k = ll.countNodeUpto(start);
		Node temp = start;

		while(i < arr1.length && j < arr2.length){
		
			if(arr1[i] < arr2[j]){
			
				//ll.removeAtPosition(k);
				//ll.addAtPosition(arr1[i], k);
				temp.data = arr1[i];
				i++;
			}else{
			
				//ll.removeAtPosition(k);
				//ll.addAtPosition(arr2[j], k);
				temp.data = arr2[j];
				j++;
			}
			temp = temp.next;
		}

		while(i < arr1.length){
	
			//ll.removeAtPosition(k);	
			//ll.addAtPosition(arr1[i], k);
			temp.data = arr1[i];
			i++;
			temp = temp.next;
		}

		while(j < arr2.length){
		
			//ll.removeAtPosition(k);
			//ll.addAtPosition(arr2[j], k);
			temp.data = arr2[j];
			j++;
			k++;
		}

	}

	static void mergeSortLL(LinkedList ll, Node start, Node end){

		if(start != end){
		
			Node mid = ll.middleNode(start, end);

			mergeSortLL(ll, start, mid);
			mergeSortLL(ll, mid.next, end);
			merge(ll, start, mid, end);
			ll.printDLL();
		}
	}

	public static void main(String[] args){
		
		LinkedList dll = new LinkedList();
	
		dll.addLast(9);
		dll.addLast(1);
		dll.addLast(8);
		dll.addLast(2);
		dll.addLast(7);
		dll.addLast(3);
		dll.addLast(6);
		dll.addLast(4);
		dll.printDLL();

		Node end = dll.head;
		while(end.next != null){
		
			end = end.next;
		}

		mergeSortLL(dll, dll.head, end);
		dll.printDLL();
	
	}
}

