import java.util.*;
class ArrayE27{
	static void removeElement(int arr[], int index){
		for(int i = 0; i < arr.length; i++){
			if(i >= index){}
		}
	}
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }
	}
}
