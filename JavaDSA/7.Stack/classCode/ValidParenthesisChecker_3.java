import java.util.*;

class ValidParenthesis{

	static boolean isValidParenthesis(String brackets){
	
		Stack<Character> s = new Stack<Character>();
		for(int i = 0; i < brackets.length(); i++){

			char ch = brackets.charAt(i);
			if(ch == '(' || ch == '{' || ch == '['){
			
				s.push(ch);
			}else{
			
				if(!s.empty()){
				
					char x = s.peek();
					if((x == '(' && ch == ')') || (x == '{' && ch == '}') || (x == '[' || x == ']')){
					
						s.pop();
					}else{
					
						return false;
					}
				}else{
				
					return false;
				}
			}
		}

		if(s.empty()){
		
			return true;
		}else{
		
			return false;
		}
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Parenthesis for checking valid format :");
		String str = sc.next();

		if(isValidParenthesis(str)){
		
			System.out.println("Valid Parenthesis");
		}else{
		
			System.out.println("Not Valid Parenthesis");
		}
	}
}
