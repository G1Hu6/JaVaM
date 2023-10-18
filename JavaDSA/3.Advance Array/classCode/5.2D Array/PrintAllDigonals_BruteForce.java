/*
  Q.(1) Given a matrix of size N x M.
        Print all the digonal elements (Right -> Left)

	Note: Row start from 0th index.
*/

import java.util.*;

class PrintAllDigonal{
	public static void main(String[] args){
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column :");
		int n = sc.nextInt();
		int m = sc.nextInt();

		int arr[][] = new int[n][m];
		for(int i = 0; i < n; i++){
			System.out.println("Enter row " + i + " :");
			for(int j = 0; j < m; j++){
				arr[i][j] = sc.nextInt();
			}
		}

		
		for(int i = arr[0].length -1; i >= 0; i--){
			for(int j = 0; j < arr.length; j++){
				for(int k = 0; k < arr[j].length; k++){
					if(j + k == i){
						System.out.print(arr[j][k] + " ");
					}
				}
			}
			System.out.println();
		}*/

		int arr[][] = new int[][]{{1,2,3,4,5,6},
					  {7,8,9,10,11,12},
					  {13,14,15,16,17,18},
					  {19,20,21,22,23,24}};

		for(int i = 0; i < arr.length; i++){
			for(int j = arr[i].length-1; j >= 0; j--){
				if(i + j < arr[0].length){
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}

