import java.util.*;

class StackImplementation_UsingLinkedList{

	class Node{
	
		int data;
		Node next = null;
		Node prev = null;

		Node(int data){
		
			this.data = data;
		}
	}

	Node head = null;
	Node top;
	int maxSize;

	StackImplementation_UsingLinkedList(int size){
	
		this.top = null;
		this.maxSize = size;
	}

	int countNode(){
	
		int count = 0;
		Node temp = head;

		while(temp != null){
		
			count++;
			temp = temp.next;
		}

		return count;
	}

	void push(int data){
	
		if(countNode() == maxSize){
		
			System.out.println("Stack is full");
			return;
		}else{
			Node newNode = new Node(data);
		
			if(head == null){
			
				head = newNode;
				top = newNode;
			}else{
			
				newNode.prev = top;
				top.next = newNode;
				top = top.next;
			}
		}
	}

	int pop(){
	
		if(head == null){
		
			System.out.println("Stack is empty!!!");
			return -1;
		}else{
		
			int ret = top.data;

			if(top.prev == null){
			
				top = head = null;
			}else{
				top = top.prev;
				top.next = null;
			}
			return ret;
		}
	}

	boolean empty(){
	
		if(head == null){
		
			return true;
		}else{
		
			return false;
		}
	}

	int peek(){
	
		if(empty()){
		
			System.out.println("Stack is empty!!!");
			return -1;
		}else{
		
			return top.data;
		}
	}

	int size(){
             
	   	return countNode();
	}

	void printStack(){
	
		if(head == null){
		
			System.out.println("Stack is empty!!!");
			return;
		}else{
		
			Node temp = head;
			while(temp != null){
			
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
}

class Client{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size :");
		int size = sc.nextInt();
		StackImplementation_UsingLinkedList s = new StackImplementation_UsingLinkedList(size);


		char ch;

		do{
			System.out.println("******** Stack Using Array *******");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. empty");
			System.out.println("4. peek");
			System.out.println("5. size");
			System.out.println("6. printStack");

			System.out.println("Enter Input :");
			int choise = sc.nextInt();

			switch(choise){
				case 1:{

					System.out.println("Enter Data :");
					int data = sc.nextInt();
					s.push(data);
				}
					break;

				case 2:{

                                        int flag = s.pop();
					if(flag != -1){

						System.out.println(flag + "popped");
					}
				}
					break;

				case 3:{

					System.out.println(s.empty());
				}
					break;

				case 4:{

				  	System.out.println(s.peek());
				}
					break;

				case 5:{
					int size1 = s.size();

					System.out.println("Size = " + size1);
				}
					break;

				case 6:{

					s.printStack();
				}
					break;

				default :{
					System.out.println("Invalid Input");
					choise = sc.nextInt();
				}
					break;

			}
			System.out.println("Continue ?");
			ch = sc.next().charAt(0);
		}while(ch == 'Y' || ch == 'y');
	}
}



