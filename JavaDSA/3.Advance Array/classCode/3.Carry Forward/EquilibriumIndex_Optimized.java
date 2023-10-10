import java.util.*;
class Array{
	static int equilibriumIndex(int arr[]){
		int rightSum[] = new int[arr.length];
		int LeftSum[] = new int[arr.length];
		rightSum[0] = arr[0];
		LeftSum[arr.length-1] = arr[arr.length-1];
		for(int i = 1; i < arr.length; i++){
			rightSum[i] = rightSum[i-1] + arr[i];
			LeftSum[arr.length-i-1] = LeftSum[arr.length-i] + arr[arr.length-i-1];
		}	

		for(int i = 1; i < arr.length-1; i++){
			if(0 == LeftSum[1])
				return 0;
			if(rightSum[i-1] == LeftSum[i+1])
				return i;
		}
		if(0 == rightSum[arr.length-2])
			return arr.length-1;
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
