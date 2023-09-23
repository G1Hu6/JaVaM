/*
 39] Leaders in an array
Write a program to print all the LEADERS in the array. An element is a leader if it
is greater than all the elements to its right side. And the rightmost element is
always a leader.
For example:
Input: arr[] = {16, 17, 4, 3, 5, 2},
Output : 17, 5, 2
Input: arr[] = {1, 2, 3, 4, 5, 2},
Output: 5, 2
 */

import java.util.*;
class ArrayB39{
	void findLeaders(int arr[], int n){
		for(int i = 0; i < n; i++){
			int flag = 0;
			for(int j = i; j < n; j++){
				if(arr[i] >= arr[j])
					flag = 1;
				else{
					flag = 0;
					break;
				}
			}
			if(flag == 1){
				System.out.println(arr[i] + " ");
			}
		}
		System.out.println();
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
		System.out.println("Leaders in array :");
		ArrayB39 obj = new ArrayB39();
		obj.findLeaders(arr, size);
	}
}
