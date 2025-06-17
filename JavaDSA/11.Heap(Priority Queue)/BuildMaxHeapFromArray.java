class BuildMaxHeapFromArray{

    MaximumHeapImplementation mp;

    BuildMaxHeapFromArray(){
        this.mp = new MaximumHeapImplementation(12);
    }

    // Approach 1 :- Time complexity = O(N * logN)
    void buildHeap(int[] arr){

        for(int i = 0; i < arr.length; i++){ // O(N)

            mp.add(arr[i]); // O(logN)
        }
        mp.printHeapArray();
    }
    
    // Approach 2 :- Time complexity = O(N)
    void buildHeapOptimal(int[] arr){

        // convert given array to heap
        for(int i = 0; i < arr.length; i++){

            mp.root.heapArr[i + 1] = arr[i];
        }
        mp.root.size = arr.length;
        System.out.println();
        mp.printHeapArray();

        // heapify all non leaf elements from idex (n/2)
        int n = mp.root.size;
        for(int i = n/2; i >= 1; i--){

            // heapify(i);
            int j = i;
            while(j <= n){

                int max = j;
                int left = 2*j;
                int right = 2*j + 1;
                
                if(left <= n && mp.root.heapArr[left] > mp.root.heapArr[j]){
                    max = left;
                }

                if(right <= n && mp.root.heapArr[right] > mp.root.heapArr[max]){
                    max = right;
                }

                if(max == j){
                    break;
                }
                mp.swap(j, max);
                j = max;
            }
        }
        System.out.println();
        mp.printHeapArray();
    }

    // HeapSort :- O(N * logN) array to heap + sort 
    void heapSort(int[] arr){

        // convert given array to heap
        buildHeapOptimal(arr); // O(N)

        // sort
        while(mp.root.size > 1){ // O(N)

            mp.swap(1, mp.root.size);
            mp.root.size--;
            heapify(1);      // O(log N)
        }
        System.out.println();
        mp.printHeapArray();
    }

    void heapify(int i){

            int n = mp.root.size;
            int j = i;
            while(j <= n){

                int max = j;
                int left = 2*j;
                int right = 2*j + 1;
                
                if(left <= n && mp.root.heapArr[left] > mp.root.heapArr[j]){
                    max = left;
                }

                if(right <= n && mp.root.heapArr[right] > mp.root.heapArr[max]){
                    max = right;
                }

                if(max == j){
                    break;
                }
                mp.swap(j, max);
                j = max;
            }
    }
    public static void main(String[] args){

        //int arr[] = new int[]{ 3, 5, 1, 7, 2, 6, 8 };
        int arr[] = new int[]{ 1, 2, 4, 3, 0, 5};
        BuildMaxHeapFromArray hp = new BuildMaxHeapFromArray();
        //hp.buildHeap(arr);

        //hp.buildHeapOptimal(arr);
        
        hp.heapSort(arr);

    }
}
