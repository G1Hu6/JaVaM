import java.util.*;

class ImmediateSmallerElement{

	static void nextSmallerArr(int arr[]){
	
		for(int i = 0; i < arr.length-1; i++){
		
			if(arr[i] > arr[i+1]){
			
				arr[i] = arr[i+1];
			}else{
			
				arr[i] = -1;
			}
		}
		arr[arr.length-1] = -1;
	}

	static Stack<Integer> nextSmallerByStack(int arr[]){
	
		Stack<Integer> ss = new Stack();
		for(int i = 0; i < arr.length-1; i++){
		
			if(arr[i] > arr[i+1]){
			
				ss.push(arr[i+1]);
			}else{
		
				ss.push(-1);
			}
		}
		ss.push(-1);

		return ss;
	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array :");
		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter elements :");
		for(int i = 0; i < size; i++){
		
			arr[i] = sc.nextInt();	
		}

		//nextSmallerArr(arr);

		for(int i = 0; i < size; i++){
			
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("Using stack : " + nextSmallerByStack(arr));
	}
}
