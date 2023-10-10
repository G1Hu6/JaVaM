import java.util.*;
class Array{
	static int equilibriumIndex(int arr[]){

		/*
		int itr = 0;
		for(int i = 0; i < arr.length; i++){
			int rightSum = 0, leftSum = 0;
			for(int j = 0; j < arr.length; j++){
				itr++;
				if(i > j){
					leftSum = leftSum + arr[j];
				}else if(i < j){
					rightSum = rightSum + arr[j];
				}
			}
			if(rightSum == leftSum){
				System.out.println(itr);
				return i;
			}
		}
		System.out.println(itr);
		return -1;
		*/

		int itr = 0;
                for(int i = 0; i < arr.length; i++){
                        int rightSum = 0, leftSum = 0;
			for(int j = 0; j < i; j++){
				itr++;
          	                leftSum = leftSum + arr[j];
			}
                        for(int j = i+1; j < arr.length; j++){
				itr++;
                                rightSum = rightSum + arr[j];
                        }
                        if(rightSum == leftSum){
                                System.out.println(itr);
                                return i;
                        }
                }
                System.out.println(itr);
                return -1;

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

		System.out.println("Equilibrium Point = " + equilibriumIndex(arr));
	}
}
