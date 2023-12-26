import java.util.*;

class CircularQueueImplementation_ByArray{

	int queueArr[];
	int front;
	int rear;
	int maxSize;

	CircularQueueImplementation_ByArray(int size){
	
		this.queueArr = new int[size];
		this.front = -1;
		this.rear = -1;
		this.maxSize = size;
	}

	void enqueue(int data){
	
		if((front == 0 && rear == maxSize-1) || ((rear + 1)%maxSize == front)){	
		// (front == 0 && rear = maxSize-1) || (front-1)%maxSize == maxSize-1)
		
			System.out.println("Queue is full");
			return;
		}else if(front == -1){
		
			front = rear = 0;
		}else if(front != 0 && rear == maxSize-1){
		
			rear = 0;
		}else{
		
			rear++;
		}
		queueArr[rear] = data;
	}

	int dequeue(){
		
		if(front == -1){
		
			System.out.println("Queue is empty!!!");
			return -1;
		}else{
		
			int ret = queueArr[front];

			if(front == rear){
			
				front = rear = -1;
			}else if(front == maxSize-1){
			
				front = 0;
			}else{
			
				front++;
			}
			return ret;
		}
	}

	void printQueue(){
		
		if(front <= rear){
		
			for(int i = front; i <= rear; i++){
			
				System.out.print(queueArr[i] + " ");
			}
		}else{
		
                        for(int i = front; i <= maxSize-1; i++){

                                System.out.print(queueArr[i] + " ");
                        }
			for(int i = 0; i <= rear; i++){
			
				System.out.print(queueArr[i] + " ");
			}
		}
		System.out.println();
	}

	boolean empty(){
		
		return true;
	}
	
	int front(){
	
		return 10;
	}

	int rear(){
	
		return 10;
	}
}

class Client{

	public static void main(String[] args) throws java.io.IOException{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Queue :");
		int size = sc.nextInt();
		CircularQueueImplementation_ByArray q = new CircularQueueImplementation_ByArray(size);

		int ch = 0;
		do{

			System.out.println("********* Circular-Queue Implementation Using Array **********");
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
