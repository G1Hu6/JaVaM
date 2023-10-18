/*
   Q.(3) Given a matrix of N x N.
         Rotate the matrix by 90 degree clockwise from top right corner.

	 Note: No new matrix.
 */

class RotateBy90DegreClockwise{
	public static void main(String[] args){
		int arr[][] = new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

		int ans[][] = new int[arr.length][arr.length];

		/*
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				ans[i][j] = arr[arr.length-1-j][i];
			}
		}
		*/

		// Transpose
		for(int i = 0; i < arr.length; i++){
                        for(int j = i+1; j < arr[i].length; j++){
                                int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
                        }
                }

		// Reverse
		for(int i = 0; i < arr.length; i++){
			int start = 0;
			int end = arr.length-1;
			while(start < end){
				int temp = arr[i][start];
				arr[i][start] = arr[i][end];
				arr[i][end] = temp;
				start++;
				end--;
			}
		}

		for(int i = 0; i < arr.length; i++){
                        for(int j = 0; j < arr[0].length; j++){
                                System.out.print(arr[i][j] + " ");
                        }
			System.out.println();
                }
	}
}
