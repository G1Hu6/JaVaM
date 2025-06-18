import java.util.Arrays;
import java.util.ArrayList;

class PrintAllBooleanStrings{

    // (1).Generate all boolean strings using 0 and 1 of length N.
    // Time complexity = O(2^N)
    void printBooleanStrings(int i, int n, int[] output){

        // base case
        if(i == n){
            System.out.println(Arrays.toString(output));
            return;
        }

        // recursive case
        output[i] = 0;
        printBooleanStrings(i + 1, n, output);
        
        output[i] = 1;
        printBooleanStrings(i + 1, n, output);
    }

    void storeBooleanString(int i, int n, Integer[] output, ArrayList<Integer[]> list){

        if(i == n){
            Integer[] newOutput = output.clone(); // backtracking step :- while backtracking primetive variables regain ther previous values but in the case of array it is not possible.beacuse same array address are shared with all call stack so ones change reflected everywhere.so we have to undo this changes while backtracking.
            list.add(newOutput);
            return;
        }
      
        output[i] = 0;
        storeBooleanString(i + 1, n, output, list);
        
        output[i] = 1;
        storeBooleanString(i + 1, n, output, list);
    }

    public static void main(String[] args){

        PrintAllBooleanStrings pro1 = new PrintAllBooleanStrings();
        int n = 3;
        //int[] output = new int[n];
        //pro1.printBooleanStrings(0, n, output);

        Integer[] output = new Integer[n];
        ArrayList<Integer[]> list = new ArrayList<>();
        pro1.storeBooleanString(0, n, output, list);

        for(int i = 0; i < list.size(); i++){
            System.out.println(Arrays.toString(list.get(i)));
        }
    }
}
