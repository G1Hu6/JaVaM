/*
 
 */

import java.util.*;
class GoogleQue{
	static int countPair(char arr[], int n){
		char ansArr[] = new char[n];
		ansArr[0] = arr[0];
		int count = 0;
		int flag = 0;
		
		for(int i = 1; i < n; i++){
			if(ansArr[i-1] == 'a' && arr[i] == 'a'){
				flag ++;
				ansArr[i] = arr[i];
			}
			else if(ansArr[i-1] == 'a' && arr[i] == 'g'){
				if(flag != 0){
					count = count + 1 + flag;
				}else{
					count = count + 1;
				}
				ansArr[i] = ansArr[i-1];
			}
			else if(ansArr[i-1] == 'a' && arr[i] != 'g'){
				ansArr[i] = ansArr[i-1];
			}
			else{
				ansArr[i] = arr[i];
			}
		}
		return count;
	}
	/*

	static int countPair(char arr[], int n){
		int count = 0;
		for(int i = 0; i < n ; i++){
			if(arr[i] != 'a')
				break;
			count = 0;
			for(int j = i+1; j < n; j++){
				if(arr[j] == 'g')
					count++;
			}
		}
		return count;
	
	}*/


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                char arr[] = new char[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.next().charAt(0);
                }

		System.out.println("Count = " + countPair(arr, size));
	}	
}
