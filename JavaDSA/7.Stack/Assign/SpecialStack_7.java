class SpecialStack{

	int maxSize;
	int stackArr[];
	int top = -1;

	SpecialStack(int size){
		this.stackArr = new int[size];
		this.maxSize = size;
	}

	void push(int data){
		
		if(top == maxSize-1){

			System.out.println("Stack Overflow");
			return;
		}else{
			
			top++;
			stackArr[top] = data;
		}
	}

	boolean empty(){
		
		if(top == -1){
		
			return true;
		}else{
			
			return false;
		}
	}

	int pop(){
		
		if(empty()){

			System.out.println("Stack is empty");
			return -1;
		}else{

			int val = stackArr[top];
			top--;
			return val;
		}
	}

	int peek(){
		
		if(empty()){
			
			System.out.println("Stack is empty");
			return -1;
		}else{
			
			return stackArr[top];
		}
	}

	int size(){
		
		return top;
	}

	void printStack(){
		if(empty()){
			
			System.out.println("[]");
			return;
		}
		System.out.print("[");
		for(int i = 0; i <= top; i++){
			if(i == top)
				System.out.print(stackArr[i]);
			else
				System.out.print(stackArr[i] + " ,");
		}
		System.out.print(" ] \n");
	}

	int minEle = Integer.MAX_VALUE;
	int getMin(SpecialStack ss, int size, int n){

		if(n == size){
			
			return minEle;
		}
		int val = ss.pop();
		if(val < minEle)
			minEle = val;
		
		getMin(ss, size, n-1);
		ss.add(val);
	}
}

lass Client{
	public static void main(String[] args){
		SpecialStack s = new SpecialStack(5);
		Scanner sc = new Scanner(System.in);
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
					int size = s.size();
				
					System.out.println("Size = " + size);
				}
					break;

				case 6:{
					
					s.printStack();
				}
					break;

				case 7:{
				
					int ret = getMin(s, s.size(), 0);
				}
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

