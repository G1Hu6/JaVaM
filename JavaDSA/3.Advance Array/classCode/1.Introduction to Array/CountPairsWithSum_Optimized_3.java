// Optimized in case of iterations but Same Time Complexity O(N^2).

import java.util.*;
class ArrayDemo3{
        static int countWithSum(int arr[], int n, int k){
                int itr = 0;
                int count = 0;
                for(int i = 0; i < n; i++){	
                        for(int j = i + 1; j < n; j++){		// Only we can check Upper Trangular Matrix Of Pairs.
                                itr++;
                                if(arr[i]+arr[j] == k)
                                        count++;
                        }
                }
                System.out.println(itr);
                return count*2;
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

                System.out.println("Enter Sum =");
                int sum = sc.nextInt();

                System.out.println(countWithSum(arr, size, sum));
        }
}

