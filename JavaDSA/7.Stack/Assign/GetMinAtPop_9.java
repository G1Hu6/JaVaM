import java.util.*;
class GetMinAtPop{

	Stack<Integer> _push(int arr[]){
		
		Stack<Integer> s = new Stack<Integer>();
		for(int i = 0; i < arr.length; i++){
		
			s.push(arr[i]);
		}

		return s;
	}

	void _getMin(Stack<Integer> s){

		while(!s.isEmpty()){
			
			Iterator<Integer> it = s.iterator();
			int minVal = s.peek();
			while(it.hasNext()){
				
				int sArr = it.next();
				if(sArr < minVal){
				
					minVal = sArr;
				}
			}
			
			System.out.print(minVal + " ");
			s.pop();
			//System.out.println(s.pop() + "popped , min = " + minVal);
		}
	}
}

class Client{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new GetMinAtPop()._push(new int[]{1, 6, 43, 1, 2, 0, 5});
		new GetMinAtPop()._getMin(s);
	}
}
