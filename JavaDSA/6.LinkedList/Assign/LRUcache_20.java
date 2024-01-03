import java.util.*;

class Node{

	int key;
	int value;
	Node next = null;

	Node(int key, int value){
		
		this.value = value;
		this.key = key;
	}
}


/*
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
}
*/

class LRUcache{

	int cap;

	Node head = null;
	Node tempL = head;
        Node tempL_prev = null;

	LRUcache(int cap){
	
		this.cap = cap;
	}

	private int countNode(){
		
		Node temp = head;
                int count = 0;

                while(temp != null){

                        count++;
                        temp = temp.next;
                }
                return count;
	}

	private void removeFirst(){
	
		if(head == null){
		
			return;
		}else if(countNode() == 1){
		
			head = null;
		}else{
		
			head = head.next;
		}
	}

	private void addLast(int key, int value){
	
		Node newNode = new Node(key, value);
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

	private boolean isExists(int key){
	
		if(head == null){

			return false;	
		}else{
			tempL = head;
			tempL_prev = null;

			while(tempL != null){
			
				if(tempL.key == key){
					
					return true;
				}
				tempL_prev = tempL;
				tempL = tempL.next;
			}
			return false;
		}
	}

	void set(int key, int value){
	
		if(isExists(key)){
		
			tempL.value = value;

			if(tempL.next == null){
			
				return;
			}else{
			
				if(tempL_prev == null){
				
					head = head.next;
				}else{

					tempL_prev.next = tempL.next;
				}
				addLast(key, value);
			}
		}else{
	
			if(countNode() == cap){
		
				removeFirst();
			}
			addLast(key, value);
		}
	}

	int get(int key){
	
		if(isExists(key)){
		
			if(tempL.next == null){

                                return tempL.value;
                        }else{

                                if(tempL_prev == null){

                                        head = head.next;
                                }else{

                                        tempL_prev.next = tempL.next;
                                }
                                addLast(key, tempL.value);
                        }

			return tempL.value;
		}else{
		
			return -1;
		}
	}

	void printLRU(){
	
		if(head == null){
                        System.out.println("LRUcache is Empty!!!");
                }else{
                        Node temp = head;

                        while(temp != null){
                                if(temp.next == null){
                                        System.out.print(temp.key + "->" + temp.value);
                                }else{
                                        System.out.print(temp.key + "->" + temp.value + " ");
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

		System.out.println("Enter capacity for cache :");
                int cap = sc.nextInt();
		LRUcache lru = new LRUcache(cap);
		char ch;

		do{
		
			System.out.println("**********LRU Cache*********\n");
			System.out.println("1.SetXY");
			System.out.println("2.GetX");
			System.out.println("3.Print");
	
			System.out.println("Enter choice");
			int choice = sc.nextInt();

			switch(choice){
			
				case 1:{
					
					System.out.println("Enter Key :");
                			int key = sc.nextInt();

					System.out.println("Enter Value :");
                                        int value = sc.nextInt();

					lru.set(key, value);

					break;
				}

				case 2:{
				
					System.out.println("Enter Key :");
                                        int key = sc.nextInt();

					System.out.println(lru.get(key));

					break;
				}

				case 3:{
				
					lru.printLRU();
					break;
				}

				default :{
				
					System.out.println("Invalid input");
					break;
				}

			}

			System.out.println("Continue ?");
			ch = sc.next().charAt(0);
		}while(ch == 'Y' || ch == 'y');
	}
}
