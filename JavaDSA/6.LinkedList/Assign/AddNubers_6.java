
import java.util.*;

class Client{

	static int convertToInt(LinkedList<Integer> ll){

        	int num = 0;
		int size = ll.size();
   	     	for(int i = 0; i < size; i++){

                	num = num*10 + ll.pop();
        	}
		System.out.println(num);
        	return num;
	}

	static LinkedList<Integer> convertToLL(int num){

        	LinkedList<Integer> ll = new LinkedList<Integer>();
     		while(num != 0){

                	ll.addFirst(num % 10);
               		num = num / 10;
        	}
        	return ll;
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		LinkedList s1 = new LinkedList();
		LinkedList s2 = new LinkedList();

		System.out.println("Size 1 :");
		int size1 = sc.nextInt();

		System.out.println("Enter elements");
		for(int i = 0; i < size1; i++){
		
			int data = sc.nextInt();
			s1.addLast(data);
		}

		System.out.println("Size 2 :");
                int size2 = sc.nextInt();

                System.out.println("Enter elements");
                for(int i = 0; i < size2; i++){

                        int data = sc.nextInt();
                        s2.addLast(data);
                }

		System.out.println(s1);
		System.out.println(s2);
		int num1 = convertToInt(s1);
		int num2 = convertToInt(s2);

		System.out.println(convertToLL(num1 + num2));
		System.out.println(num1 + num2);

	}
}
