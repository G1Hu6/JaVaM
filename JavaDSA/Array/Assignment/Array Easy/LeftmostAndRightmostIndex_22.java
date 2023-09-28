import java.util.*;
class ArrayE22{
	int firstOccurrence(int arr[], int n, int key){
		int s = 0;
		int e = n-1;
		int m = 0;
		int ans = -1;

		while(s <= e){
			m = s +(e - s)/2;
			if(arr[m] < key){
				s = m+1;
			}else if(arr[m] > key){
				e = m-1;
			}else if(arr[m] == key){
				ans = m;
				e = m-1;
			}
		}
		return ans;
	}

	int lastOccurrence(int arr[], int n, int key){
                int s = 0;
                int e = n-1;
                int m = 0;
                int ans = -1;

                while(s <= e){
                        m = s +(e - s)/2;
                        if(arr[m] < key){
                                s = m+1;
                        }else if(arr[m] > key){
                                e = m-1;
                        }else if(arr[m] == key){
                                ans = m;
                                s = m+1;
                        }
                }
		return ans;
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

		System.out.println("Enter Element :");
                int ele = sc.nextInt();

		ArrayE22 obj = new ArrayE22();
		System.out.println("First and Last occurrence =");
		System.out.print(obj.firstOccurrence(arr, size, ele) + " " + obj.lastOccurrence(arr, size, ele) + "\n");
	}
}
