import java.util.*;
class ArrayE14{
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
		
		System.out.println("Union elements :");
		unionEle(arr1, arr2, size1, size2);
	}
	static void unionEle(int arr1[], int arr2[], int n1, int n2){
		int s1 = 0;
		int s2 = 0;
		int val = Integer.MAX_VALUE;
		int i = 0;
		Vector ans = new Vector();

		while(s1 < n1 && s2 < n2){
			if(arr1[s1] > arr2[s2]){
				if(val != arr2[s2]){
					ans.add(arr2[s2]);
				}
				val = arr2[s2];

				s2++;
			}else if(arr1[s1] < arr2[s2]){
				if(val != arr1[s1]){
                                        ans.add(arr1[s1]);
				}
				val = arr1[s1];

				s1++;
			}else if(arr1[s1] == arr2[s2]){
				if(val != arr2[s1]){
                                        ans.add(arr2[s1]);
                                }
				val = arr2[s1];

				s2++;
			}
		}

		for(var data : ans){
			System.out.print(data + " ");	
		}
	}
}
