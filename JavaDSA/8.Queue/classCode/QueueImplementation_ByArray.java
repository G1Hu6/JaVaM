import java.util.*;

class QueueImplementation_ByArray{

	int queueArr[];
	int maxSize;
	int front;
	int rear;

	QueueImplementation_ByArray(int size){
	
		queueArr = new int[size];
		maxSize = size;
		front = -1;
		rear = -1;
	}

	void enqueue(int data){
	
		if(rear == maxSize-1){
		
			System.out.println("Queue is full");
			return;
		}

		if(front == -1){
			
			front = rear = 0;
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
			front++;

			if(front > rear){
			
				front = rear = -1;
			}
			return ret;
		}
	}

	boolean empty(){
	
		if(front == -1){
		
			return true;
		}else{
		
			return false;
		}
	}

	int front(){
	
		if(front == -1){
			
			System.out.println("Queue is Empty!!!");
			return -1;
		}else{
		
			return queueArr[front];
		}
	}

	int rear(){
	
		if(front == -1){
		
			System.out.println("Queue is Empty!!!");
                        return -1;
		}else{
		
			return queueArr[rear];
		}
	}

	void printQueue(){
		
		if(front == -1){
				
			System.out.println("Queue is empty");
			return;
		}else{
			System.out.print("[");
			for(int i = front; i <= rear; i++){
			
				System.out.print(queueArr[i] + " ");
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
		QueueImplementation_ByArray q = new QueueImplementation_ByArray(size);

		int ch = 0;
		do{
		
			System.out.println("********* Queue Implementation Using Array **********");
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
