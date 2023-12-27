import java.util.Scanner;

class DequeImplementation_ByArray{

	int dequeArr[];
	int maxSize;
	int front;
	int rear;

	DequeImplementation_ByArray(int size){
	
		this.dequeArr = new int[size];
		this.front = -1;
		this.rear = -1;
		this.maxSize = size;
	}

	void pushBack(int data){
	
		if(rear == maxSize-1 && front == 0){
		
			System.out.println("Deque is full");
			return;
		}
		if(front == -1){
		
			front = rear = 0;
		}else{
		
			rear++;
		}
		dequeArr[rear] = data;
	}

	void pushFront(int data){
	
		if(front == 0 && rear == maxSize-1){
		
			System.out.println("Deque is full");
                        return;
		}
		if(front == -1){
		
			front = rear = 0;
		}else if(front == 0){

			int temp = ++rear;
			while(temp != 0){
			
				dequeArr[temp] = dequeArr[temp-1];
				temp--;
			}
		}else{
		
			front--;
		}

		dequeArr[front] = data;
	}

	int popFront(){
	
		if(front == -1){
		
			System.out.println("Deque is empty!!!");
			return -1;
		}else{
		
			int ret = dequeArr[front];
			front++;
			if(front > rear){
			
				front = rear = -1;
			}
			return ret;
		}
	}

	int popBack(){
	
		if(rear == -1){
				
			System.out.println("Deque is empty!!!");
                        return -1;
		}else{
			
			int ret = dequeArr[rear];
			rear--;

			if(rear < front){
			
				rear = front = -1;
			}
			return ret;
		}
	}

	void printDeque(){
	
		if(front == -1){
		
			System.out.println("Deque is empty!!!");
			return;
		}else{
		
			for(int i = front; i <= rear; i++){
			
				System.out.print(dequeArr[i] + " ");
			}
			System.out.println();
		}
	}
}

class Client{

	public static void main(String[] args)throws java.io.IOException{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Queue :");
		int size = sc.nextInt();
		DequeImplementation_ByArray q = new DequeImplementation_ByArray(size);

		int ch = 0;
		do{

			System.out.println("********* Deque Implementation Using Array **********");
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
