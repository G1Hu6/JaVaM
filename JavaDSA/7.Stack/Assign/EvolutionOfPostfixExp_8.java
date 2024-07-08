/*
8. Evaluation of Postfix Expression

	Given string S representing a postfix expression, the task is to evaluate the expression and find the final value. Operators will onlyinclude the basic arithmetic operators like *,/, + and -.

Example 1:
Input: S = "231*+9-"
Output: -4
Explanation:
After solving the given expression,
we have -4 as a result.

Example 2:
Input: S = "123+*8-"
Output: -3
Explanation:
After solving the given postfix
expression, we have -3 as a result.

Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(|S|)

Constraints:
1 ≤ |S| ≤ 105
0 ≤ |Si|≤ 9 (And given operators) 

*/

import java.util.*;

class EvaluationOfPostfixExp{

	static int solveExp(String exp){
	
		Stack<Integer> s = new Stack<Integer>();
		for(int i = 0; i < exp.length(); i++){
		
			char ch = exp.charAt(i);
			//System.out.println(ch);	
			if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
			
				int tempA = (int)s.pop();
				int tempB = (int)s.pop();
			
				System.out.println(tempA);
				System.out.println(tempB);	
				int result = 0;
				switch(ch){
				
					case '+':{
					
						result = tempB + tempA;
						break;
					}

					case '-':{
					
						result = tempB - tempA;
						break;
					}

					case '*':{
					
						result = tempB * tempA;
						break;
					}

					case '/':{
					
						result = tempB / tempA;
						break;
					}
				}
				System.out.println(result);
				s.push(result);
			}else{
			
				s.push(Character.getNumericValue(ch));
				System.out.println(s.peek());
			}

		}
		return s.pop();
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter expression for evolution :");
		String exp = sc.next();	

		System.out.println("Output = " + solveExp(exp));	
	}
}
