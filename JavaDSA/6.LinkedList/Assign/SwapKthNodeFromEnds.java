
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

	int countNode(){
		Node temp = head;
		int count = 0;

		while(temp != null){

			count++;
			temp = temp.next;
		}
		return count;
	}

	void swapKthNodes(int k){
		
		if(head == null){
			System.out.println("Invalid swaping");
		}else{
		
			Node temp1 = head;
			Node temp1_prev = null;

			Node temp2 = head;
			Node temp2_prev = null;

			int c1 = 0;
			int c2 = 0;
			while(c1 != k-1){

				temp1_prev = temp1;
				temp1 = temp1.next;
				c1++;
			}

			while(c2 < countNode()-k+1){
			
				temp2_prev = temp2;
				temp2 = temp2.next;
				c2++;
			}
			

		}
	}
}

class Client{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);	
		MyLinkedList ll = new MyLinkedList();

		System.out.println("Enter size :");
		int size = sc.nextInt();
		
		System.out.println("Enter value of k :");
		int k = sc.nextInt();

		System.out.println("Enter elements :");
		for(int i = 0; i < size; i++){
		
			int data = sc.nextInt();
			ll.addLast1(data);
		}
		
	}
}
