
import java.util.*;

class ReverseStringUsingStack{

	static String reverseString(String str){
	
		char stackArr[] = new char[str.length()];
		Stack<Character> s = new Stack<Character>();

		for(int i = 0; i < str.length(); i++){
		
			s.push(str.charAt(i));
		}

		int i = 0;
		while(!s.empty()){
		
			stackArr[i++] = s.pop();
		}
		return new String(stackArr);
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :");
		String str = sc.next();	
		System.out.println("Reversed String : " + reverseString(str));
	}
}
