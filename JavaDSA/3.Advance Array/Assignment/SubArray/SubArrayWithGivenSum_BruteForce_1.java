import java.util.*;

class SubArray1{
	/*
	static ArrayList findSubArrayWithSum(int arr[], int n, int s){
		ArrayList al = new ArrayList();
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				int sum = 0;
				for(int k = i; k <= j; k++){
					sum = sum + arr[k];
				}
				if(sum == s){
					al.add(i+1);
					al.add(j+1);
					return al;
				}
			}
		}
		al.add(-1);
		al.add(-1);
		return al;
		
	}
	*/


	static ArrayList findSubArrayWithSum(int arr[], int n, int s){
                ArrayList al = new ArrayList();
                for(int i = 0; i < n; i++){
			int sum = 0;
                        for(int j = i; j < n; j++){
                                sum = sum + arr[j];
                                if(sum == s){
                                        al.add(i+1);
                                        al.add(j+1);
                                        return al;
                                }
                        }
                }
                al.add(-1);
                al.add(-1);
                return al;

        }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array :");
		int size = sc.nextInt();

		System.out.println("Enter Sum :");
		int sum = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter Array Elements :");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}

		ArrayList al = findSubArrayWithSum(arr, size, sum);
		System.out.println(al);
	}
}
