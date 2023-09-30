import java.util.*;
class ArrayM08{
	static void arr1MinusArr2(int arr1[], int n1, int arr2[], int n2){
		for(int i = 0; i < n1; i++){
			int flag = 0;
			for(int j = 0; j < n2; j++){
				if(arr1[i] == arr2[j]){
					flag = 1;
					break;
				}
			}
			if(flag == 0)
				System.out.print(arr1[i] + " ");
		}
		System.out.println();
	}

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array1 :");
                int size1 = sc.nextInt();

                int arr1[] = new int[size1];
                System.out.println("Enter elements in array1 :");
                for(int i = 0; i<arr1.length; i++){
                        arr1[i] = sc.nextInt();
                }

		System.out.println("Enter size of Array2 :");
                int size2 = sc.nextInt();

                int arr2[] = new int[size2];
                System.out.println("Enter elements in array2 :");
                for(int i = 0; i<arr2.length; i++){
                        arr2[i] = sc.nextInt();
                }
		
		System.out.println("Elements present in first array but not in second = :");
		arr1MinusArr2(arr1, size1, arr2, size2);
	}
}
