/*

   19] Find common elements in three sorted arrays

Given three Sorted arrays in non-decreasing order, print all common elements in
these arrays.


Examples:
Input:
ar1[] = {1, 5, 10, 20, 40, 80}
ar2[] = {6, 7, 20, 80, 100}
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20, 80
Input:
ar1[] = {1, 5, 5}
ar2[] = {3, 4, 5, 5, 10}
ar3[] = {5, 5, 10, 20}
Output: 5, 5
 */

import java.util.*;
class ArrayB19{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array 1 :");
                int size1 = sc.nextInt();

                int arr1[] = new int[size1];
                System.out.println("Enter elements in array 1 :");
                for(int i = 0; i<arr1.length; i++){
                        arr1[i] = sc.nextInt();
                }

		System.out.println("Enter size of Array 2 :");
                int size2 = sc.nextInt();

                int arr2[] = new int[size2];
                System.out.println("Enter elements in array 2 :");
                for(int i = 0; i<arr2.length; i++){
                        arr2[i] = sc.nextInt();
                }

		System.out.println("Enter size of Array 3 :");
                int size3 = sc.nextInt();

                int arr3[] = new int[size3];
                System.out.println("Enter elements in array 3 :");
                for(int i = 0; i<arr3.length; i++){
                        arr3[i] = sc.nextInt();
                }

		ArrayB19 obj = new ArrayB19();
		int ans1[] = obj.commonElements(arr1, arr2, size1, size2);
		int ans[] = obj.commonElements(ans1, arr3, ans1.length, size3); 
		for(int i = 0; i<ans.length; i++){
                        System.out.print(ans[i] + " ,");
                }
	}

	int[] commonElements(int arr1[], int arr2[], int s1, int s2){
		int n1 = 0,n2 = 0;
		Vector v= new Vector();

		while(n1<s1 && n2<s2){
			if(arr1[n1] > arr2[n2]){
				n2++;
			}else if(arr1[n1] < arr2[n2]){
				n1++;
			}else if(arr1[n1] == arr2[n2]){
				v.add(arr1[n1]);
				n1++;
				n2++;
			}
		}
		int arr[] = new int[v.size()];
		for(int i = 0; i<arr.length; i++){
                        arr[i] =(int)v.elementAt(i);
                }
		return arr;
	}

	/*
	void commonElements(int arr1[], int arr2[], int arr3[], int s1, int s2, int s3){
		int n1=0,n2 =0,n3 =0;
		while(n1<s1 && n2<s2 && n3<s3){
			if(arr1[n1]>arr2[n2] && arr1[n1]>arr3[n3]){
				n2++;
				n3++;
			}
			else if(arr2[n2]>arr3[n3] && arr2[n2]>arr1[n1]){
				n1++;
				n3++;
			}
			else if(arr3[n3]>arr1[n1] && arr3[n3]>arr2[n2]){
				n1++;
				n2++;
			}else if(arr1[n1]==arr2[n2] && arr2[n2]==arr3[n3]){
				System.out.print(arr1[n1] + " ");
				n1++;
				n2++;
				n3++;
			}
		}
	}
	*/
}
