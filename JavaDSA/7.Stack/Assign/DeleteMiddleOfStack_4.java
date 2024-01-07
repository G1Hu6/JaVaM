import java.util.*;

class DeleteMiddleElement{

	Stack<Integer> deleteMiddle(Stack<Integer> s1){
	
		Stack<Integer> s2 = new Stack<Integer>();
		int size = s1.size();
		for(int i = 0; i < size; i++){
		
			if(i == size/2){
			
				s1.pop();
			}else{
			
				s2.push(s1.pop());
			}
		}

		for(int i = 0; i < size-1; i++){
		
			s1.push(s2.pop());
		}

		return s1;
	}


	void deleteMiddleRec(Stack<Integer> ss, int size, int num){
	
		if(num <= 0){
			
			return;
		}
		int val = ss.pop();

		deleteMiddleRec(ss, size, num-1);

		if(num != size/2){
		
			ss.push(val);
		}
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of Stack :");
		int size = sc.nextInt();

		Stack<Integer> ss = new Stack<Integer>();
		for(int i = 0; i < size; i++){
		
			ss.push(sc.nextInt());
		}
		
		System.out.println(ss);
		DeleteMiddleElement obj = new DeleteMiddleElement();
		//System.out.println(obj.deleteMiddle(ss));
		
		obj.deleteMiddleRec(ss, ss.size(), ss.size());
		System.out.println(ss);

	}
}
