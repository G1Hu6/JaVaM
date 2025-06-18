import java.util.Arrays;

class PermutationsOfString{

    private void swap(char[] arr, int i, int j){

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void allPermutations(char[] arr, int i){

        if(i == arr.length - 1){
            System.out.println(Arrays.toString(arr));
            return;
        }

        for(int j = i; j < arr.length; j++){

            swap(arr, i, j);
            allPermutations(arr, i + 1);
            swap(arr, i, j); // backtracking step :- reverse the state of array
        } 
    }

    public static void main(String[] args){
        PermutationsOfString pro3 = new PermutationsOfString();
        char[] arr = new char[]{'A', 'B', 'C'};
        pro3.allPermutations(arr, 0);
    }
}
