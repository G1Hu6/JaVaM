import java.util.ArrayList;

public class Heap{

    int size;
    int capacity;
    int[] heapArr;

    Heap(int capacity){

        this.capacity = capacity;
        this.size = 0;
        this.heapArr = new int[capacity];
    }
}
