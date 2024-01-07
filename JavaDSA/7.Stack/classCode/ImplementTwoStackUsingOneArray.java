import java.util.*;

class TwoStackUsingArray{

	int maxSize;
	int stackArr[];
	int top1;
	int top2;

	TwoStackUsingArray(int size){
	
		this.stackArr = new int[size];
		this.top1 = -1;
		this.top2 = size;
		this.maxSize = size;
	}

	void push1(int data){
	
		if(top1 >= top2 - 1){  		// top2 - top1 <=1
		
			System.out.println("Stack1 is overflow");
			return;
		}else{
		
			top1++;
			stackArr[top1] = data;
		}
	}

	int pop1(){
	
		if(top1 == -1){
		
			System.out.println("Stack1 is underflow");
			return -1;
		}else{
		
			int ret = stackArr[top1];
			top1--;
			return ret;
		}
	}

	void push2(int data){
	
		if(top2 <= top1 + 1){
		
			System.out.println("Stack2 is overflow");
			return;
		}else{
		
			top2--;
			stackArr[top2] = data;
		}
	}

	int pop2(){
	
		if(top2 == -1){
		
			System.out.println("Stack2 is underflow");
			return -1;
		}else{
		
			int ret = stackArr[top2];
			top2++;
			return ret;
		}
	}
}

class Client{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of Array :");
		int size = sc.nextInt();
		TwoStackUsingArray s = new TwoStackUsingArray(size);
		char ch;

		do{
		
			System.out.println("***Implementation of two Stacks using one Array***");
			System.out.println("1.push1");
			System.out.println("2.pop1");
			System.out.println("3.push2");
			System.out.println("4.pop2");

			System.out.println("Enter your choice :");
			int choice = sc.nextInt();

			switch(choice){
			
				case 1:{
				
					System.out.println("Enter data :");
					int data = sc.nextInt();
					s.push1(data);
					break;
				}

				case 2:{
				
					int ret = s.pop1();

					if(ret != -1){
						
						System.out.println(ret + " popped");
					}
					break;
				}
				case 3:{
				
					System.out.println("Enter data :");
					int data = sc.nextInt();
					s.push2(data);
					break;

				}

				case 4:{
						
					int ret = s.pop2();

					if(ret != -1){
						
						System.out.println(ret + " popped");
					}
					break;
				}

				default:{
					
					System.out.println("Invalid input");
					break;
				}
			}

			System.out.println("Continue ?");
			ch = sc.next().charAt(0);
			
		}while(ch == 'y' || ch == 'Y');

	}
}
