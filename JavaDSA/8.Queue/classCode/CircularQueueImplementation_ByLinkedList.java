import java.util.*;

class CircularQueueImplementation_ByLinkedList{

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

	CircularQueueImplementation_ByLinkedList(int size){
	
		this.front = null;
		this.rear = null;
		this.maxSize = size;
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

	void enqueue(int data){
	
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
	
	int dequeue(){
	
		if(front == null){
		
			System.out.println("Queue is empty!!!");
			return -1;
		}else{
		
			int ret = front.data;
			rear.next = front.next;
			front = front.next;

			return ret;

		}
	}

	void printQueue(){
		
		if(front == null){
		
			System.out.println("Queue is empty!!!");
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

	public static void main(String[] args) throws java.io.IOException{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Queue :");
		int size = sc.nextInt();
		CircularQueueImplementation_ByLinkedList q = new CircularQueueImplementation_ByLinkedList(size);

		int ch = 0;
		do{

			System.out.println("********* Circular-Queue Implementation Using LinkedList **********");
			System.out.println("1. enqueue");
			System.out.println("2. dequeue");
			System.out.println("3. print queue");

			System.out.println("Enter your choice :");
			int choice = sc.nextInt();

			switch(choice){

				case 1: {

					System.out.println("Enter data :");
					int data = sc.nextInt();

					q.enqueue(data);
					break;
				}

				case 2:{

					int ret = q.dequeue();
					if(ret != -1){

						System.out.println(ret + " popped");
					}
					break;
				}

				case 3:{

					q.printQueue();
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
