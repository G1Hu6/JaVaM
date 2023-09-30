import java.util.*;

class TwoDArrayM12{
	static int findRowOfMax1(int arr[][], int n, int m){
		int ans = -1;
		for(int i = 0; i < n; i++){
			int count = 0;
			int max = Integer.MIN_VALUE;
			for(int j = 0; j < m; j++){
				if(arr[i][j] ==1){
					count = m-j;
					if(count > max){
						count = max;
						ans = i;
					}
					break;
				}
			}
		}
		
		return ans;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows of 2DArray =");
		int row = sc.nextInt();
		System.out.println("Enter column of 2DArray =");
                int col = sc.nextInt();

		int arr[][] = new int[row][col];
		for(int i = 0; i < arr.length; i++){
			System.out.println("Enter row no " + (i+1) + " :");
			for(int j = 0; j < arr[i].length; j++){
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Row no having max 1 = ");
		System.out.println(findRowOfMax1(arr, row, col));
	}
}
