import java.util.Arrays;

class MergeTwoSortedArrayDemo_2{

	public static void main(String[] args){
	
		int arr1[] = {3, 7, 9, 11};
		int arr2[] = {2, 5, 8};
		int arr3[] = new int[arr1.length + arr2.length];

		int i = 0, j = 0, k = 0;
		while(i < arr1.length && j < arr2.length){
		
			if(arr1[i] < arr2[j]){
				arr3[k] = arr1[i];
				i++;
			}else{
				arr3[k] = arr2[j];
				j++;
			}
			k++;
		}

		while(i < arr1.length){
		
			arr3[k] = arr1[i];
                        i++;
			k++;
		}

		while(j < arr2.length){
		
			arr3[k] = arr2[j];
			j++;
			k++;
		}
		System.out.println(Arrays.toString(arr3));
	}

}
