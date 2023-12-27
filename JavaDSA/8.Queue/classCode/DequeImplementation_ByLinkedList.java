import java.util.*;

class DequeImplementation_ByLinkedList{

	class Node{
	
		int data;
		Node next = null;

		Node(int data){
		
			this.data = data;
		}
	}

	Node front;
	Node rear;
        int maxSize;
	
	DequeImplementation_ByLinkedList(int size){
	
		this.maxSize = size;
		this.front = null;
		this.rear = null;
	}	

	int countNode(){

		int count = 0;
		if(front == null){
			return count;
		}else{
			Node temp = front;

			while(temp.next != front){

				count++;
				temp = temp.next;
			}
			return ++count;
		}
	}

	void pushBack(int data){
	
		if(maxSize == countNode() && rear.next == front){
		
			System.out.println("Queue is full");
			return;
		}else{
		
			Node newNode = new Node(data);
			if(front == null){
			
				front = newNode;
				rear = newNode;
				rear.next = front;
			}else{
			
				rear.next = newNode;
				rear = rear.next;
				rear.next = front;
			}
		}
	}

	void pushFront(int data){
	
		if(maxSize == countNode() && rear.next == front){

                        System.out.println("Queue is full");
                        return;
                }else{

                        Node newNode = new Node(data);
                        if(front == null){

                                front = newNode;
                                rear = newNode;
                                rear.next = front;
                        }else{

                                newNode.next = front;
				front = newNode;
                                rear.next = front;
                        }
                }
	}

	int popFront(){
	
		if(front == null){
		
			System.out.println("Queue is empty!!!");
			return -1;
		}else{
		
			int ret = front.data;
			if(front == rear){
			
				front = rear = null;
			}else{

				front = front.next;
				rear.next = front;
			}
			return ret;

		}
	}

	int popBack(){

                if(front == null){

                        System.out.println("Queue is empty!!!");
                        return -1;
                }else{

			Node rear_Prev = front;
			while(rear_Prev.next.next != front){
			
				rear_Prev = rear_Prev.next;
			}
			
                        int ret = rear.data;
			if(front == rear){
			
				front = rear = null;
			}else{
                        
				rear.next = null;
				rear = rear_Prev;
				rear.next = front;
			}
                        return ret;

			/*

			int ret = rear.data;
			if(rear.next == front && maxSize == countNode()){
			
				
			}
			*/                 
                }
        }

	void printDeque(){
	
		if(front == null){

			System.out.println("Deque is empty");
			return;
		}else{
			Node temp = front;
			while(temp.next != front){
		
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.print(temp.data + "\n");
		}
	}

}

class Client{

	public static void main(String[] args)throws java.io.IOException{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Queue :");
		int size = sc.nextInt();
		DequeImplementation_ByLinkedList q = new DequeImplementation_ByLinkedList(size);

		int ch = 0;
		do{

			System.out.println("********* Deque Implementation Using LinkedList **********");
			System.out.println("1. pushBack");
			System.out.println("2. pushFront");
			System.out.println("3. popFront");
			System.out.println("4. popBack");
			System.out.println("5. print queue");

			System.out.println("Enter your choice :");
			int choice = sc.nextInt();

			switch(choice){

				case 1: {

					System.out.println("Enter data :");
					int data = sc.nextInt();

					q.pushBack(data);
					break;
				}

				case 2:{

                                        System.out.println("Enter data :");
                                        int data = sc.nextInt();

                                        q.pushFront(data);
                                        break;
				}

				case 3:{

					int ret = q.popFront();
                                        if(ret != -1){

                                                System.out.println(ret + " popped");
                                        }
                                        break;
				}

				case 4:{

					int ret = q.popBack();
                                        if(ret != -1){

                                                System.out.println(ret + " popped");
                                        }
                                        break;

				}

				case 5:{

					q.printDeque();
					break;
				}

				default: {

					System.out.println("Wront input");
					break;
				}
			}

			System.out.println("Do you want to Continue ?");
			ch = System.in.read();

		}while(ch == 'Y' || ch == 'y');
	}
}
