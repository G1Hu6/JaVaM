import java.util.*;
class ArrayM08{
	static int findElement(int arr1[], int n1, int arr2[], int n2, int k){
		int s1 = 0, s2 = 0, i = 0;
		int arr[] = new int[n1 + n2];

		while(s1 < n1 && s2 < n2){
			if(arr1[s1] > arr2[s2]){
				arr[i] = arr2[s2];
				s2++;
				i++;
			}else if(arr1[s1] < arr2[s2]){
				arr[i] = arr1[s1];
				s1++;
				i++;
			}else{
				arr[i] = arr1[s1];
				s1++;
				s2++;
				i++;
			}
		}
		return arr[k-1];
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
		System.out.println("Enter Element :");
                int k = sc.nextInt();
		System.out.println("Kth Element = ");
		System.out.println(findElement(arr1, size1, arr2, size2, k));
	}
}
