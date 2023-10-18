import java.util.*;

class PrintAllDigonal{
	public static void main(String[] args){
		int arr[][] = new int[][]{{1,2,3,4,5,6},
					  {7,8,9,10,11,12},
					  {13,14,15,16,17,18},
					  {19,20,21,22,23,24}};
		/*
		int i = 0;
		for(int j = arr[0].length-1; j >= 0; j--){
			i = 0;
			int x = j;
			while(i < arr.length && x >= 0){
				System.out.print(arr[i][x] + " ");

				i++;
				x--;
			}
			System.out.println();
		}
		*/

		int i = 0;
                for(int j = arr[0].length-1; j >= 0; j--){
                        i = 0;
                        int x = j;
                        for(;i < arr.length && x >= 0; i++, x--){

                                System.out.print(arr[i][x] + " ");
                        }
                        System.out.println();
                }

	}
}
