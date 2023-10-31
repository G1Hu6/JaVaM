import java.util.*;

class FactorialDemo{
	int findFactByNormalMethod(int num){
		int fact = 1;
		for(int i = 0; i <= num; i++){
			fact = fact * i;
		}
		return fact;
	}

	/*
	int fact = 1;
	int findFactByRecursion(int num){
		if(num == 0){
			return fact;
		}
		fact = fact * num;
		num--;
		findFactByRecursion(num);
		return fact;
	}
	*/

	int findFactByRecursion(int num){
		if(num == 0){
			return 1;
		}
		return num * findFactByRecursion(--num);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();

		FactorialDemo obj = new FactorialDemo();
		System.out.println(obj.findFactByRecursion(num));
	}
}
