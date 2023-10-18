import java.util.*;

class PrintAllDigonal{
	public static void main(String[] args){
		int arr[][] = new int[][]{{1,2,3,4,5,6},
					  {7,8,9,10,11,12},
					  {13,14,15,16,17,18},
					  {19,20,21,22,23,24}};

		for(int i = arr[0].length-1; i >= 0; i--){
			int val = i;
			for(int j = 0; j < arr.length; j++){
				System.out.print(arr[j][val] + "  ");
				val--;
				if(val < 0){
					break;
				}
			}
			System.out.println();
		}
	}
}
