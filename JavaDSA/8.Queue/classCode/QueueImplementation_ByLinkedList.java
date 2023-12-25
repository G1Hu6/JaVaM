import java.util.*;

class QueueImplementation_ByLinkedList{

	class Node{
	
		int data;
		Node next = null;

		Node(int data){
			
			this.data = data;
		}
	}

	Node front;
	Node rear;
	Node temp = null;
	int maxSize;
	
	QueueImplementation_ByLinkedList(int size){
	
		this.front = null;
		this.rear = null;
		this.maxSize = size;
	}

	int countNode(){
	
		int count = 0;
		Node temp = front;
		while(temp != null){
		
			count++;
			temp = temp.next;
		}
		System.out.println(count);
		return count;
	}

	void enqueue(int data){
		
		if(maxSize == countNode()){
		
			System.out.println("Queue is full");
			return;
		}else{

			Node newNode = new Node(data);
			if(front == null){
			
				front = newNode;
				rear = newNode;
			}else{
			
				rear.next = newNode;
				rear = rear.next;
			}
		}
		temp = front;
	}

	int dequeue(){
	
		if(front == null){
		
			System.out.println("Queue is empty!!!");
			return -1;
		}else{
		
			if(temp == rear){
			
				int ret = temp.data;	
				front = rear = temp = null;
				return ret;
			}else{
			
				int ret = temp.data;
				temp = temp.next;
				return ret;
			}
		}
	}

	boolean empty(){
		
		if(front == null){
			
			return true;
		}else{
			
			return false;
		}

	}

	int front(){
	
		if(front == null){
		
			System.out.println("Queue is empty");
			return -1;
		}else{
		
			int ret = temp.data;
			return ret;
		}
	}

	int rear(){
			
		if(rear == null){
		
			System.out.println("Queue is empty");
			return -1;
		}else{
		
			int ret = rear.data;
			return ret;
		}
	}

	void printQueue(){
	
		if(temp == null){
		
			System.out.println("Queue is empty");
		}else{
			Node temp1 = temp;
			System.out.print("[");
			while(temp1 != null){
			
				System.out.print(temp1.data + " ");
				temp1 = temp1.next;
			}
			System.out.print("]" + "\n");
		}
	}
}

class Client{

	public static void main(String[] args) throws java.io.IOException{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Queue :");
		int size = sc.nextInt();
		QueueImplementation_ByLinkedList q = new QueueImplementation_ByLinkedList(size);

		int ch = 0;
		do{

			System.out.println("********* Queue Implementation Using LinkedList **********");
			System.out.println("1. enqueue");
			System.out.println("2. dequeue");
			System.out.println("3. empty");
			System.out.println("4. front");
			System.out.println("5. rear");
			System.out.println("6. print queue");

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

					boolean ret = q.empty();
					if(ret){

						System.out.println("Queue is Empty!!!");
					}else{

						System.out.println("Queue is not empty");
					}
					break;
				}

				case 4:{

					int ret = q.front();
					if(ret != -1){

						System.out.println(ret);
					}
					break;
				}

				case 5:{

					int ret = q.rear();
					if(ret != -1){

						System.out.println(ret);
					}
					break;
				}

				case 6:{

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
