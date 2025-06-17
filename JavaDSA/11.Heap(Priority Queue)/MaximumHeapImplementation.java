public class MaximumHeapImplementation{

    Heap root;

    MaximumHeapImplementation(int capacity){
        this.root = new Heap(capacity);
    }

    // Swap elements in at given index in array
    void swap(int a, int b){
        
        int temp = root.heapArr[a];
        root.heapArr[a] = root.heapArr[b];
        root.heapArr[b] = temp;
    }

    // (1) Insert data into heap
    // Time Complexity = O(log N)
    // (Parent) i ---->(Child_1) 2i, (Child_2) 2i+1
    void add(int data){

        root.size++;
        int i = root.size;
        root.heapArr[i] = data;

        while(i > 1 && root.heapArr[i/2] < root.heapArr[i]){

            swap(i, i/2);
            //System.out.println();
            //printHeapArray();
            i = i/2;
        }
    }

    // (2) Get maximum element from heap  
    // Time complexity = O(1)
    int getMax(){

        return root.heapArr[1];
    }

    // (3) Remove max element from heap
    void removeMax(){

        // 1.swap first and last element in array.
        swap(1, root.size);
        // 2.reduce size by 1 (delete last element).
        root.heapArr[root.size] = 0;
        root.size--;

        // 3.bring root to the down (Heapify).
        int i = 1;
        while( i <= root.size ){

            int max = i;
            int left = 2*i;
            int right = 2*i + 1;

            if( left <= root.size && root.heapArr[left] > root.heapArr[i] ){
                max = left;
            }

            if( right <= root.size && root.heapArr[right] > root.heapArr[max] ){
                max = right;
            }

            if(max == i){
                // no need to further check.
                break;
            }
            swap(i, max);
            i = max;
        }
    }

    void printHeapArray(){

        for(int i = 0; i < root.heapArr.length; i++){

            System.out.print(root.heapArr[i] + " ");
        }
    }

    public static void main(String[] args){

        MaximumHeapImplementation hp = new MaximumHeapImplementation(12);
        hp.add(19);
        hp.add(10);
        hp.add(2);
        hp.add(8);
        hp.add(12);
        hp.add(20);
        hp.add(5);
        hp.add(3);
        hp.add(6);

        // print heap array
        hp.printHeapArray(); 
        System.out.println();

        hp.removeMax();
        hp.printHeapArray();
    }
}
