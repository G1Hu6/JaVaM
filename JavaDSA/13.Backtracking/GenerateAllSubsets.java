import java.util.*;

class GenerateAllSubsets{

    // (2).Given an array of size N, generate all subsets of it.
    // Time complexity = O(2^N)
    void findSubsets(int i, int[] input, int[] currentOutput){

        // base case
        if(i == input.length){
            System.out.println(Arrays.toString(currentOutput));
            return;
        }

        // recursive case
        // 1.include ith element + do remaining work
        currentOutput[i] = input[i];
        findSubsets(i + 1, input, currentOutput);
        
        // 2.exclude ith element + do remaining work
        currentOutput[i] = 0; // backtracking step
        findSubsets(i + 1, input, currentOutput);
    }

    void findSubsets(int i, Integer[] input,ArrayList<Integer> currentOutput, ArrayList<Integer[]> list){

        // base case
        if(i == input.length){
            System.out.println(currentOutput);
            return;
        }

        // recursive case
        // 1.include ith element + do remaining work
        currentOutput.add(input[i]);
        findSubsets(i + 1, input, currentOutput, list);
        
        // 2.exclude ith element + do remaining work
        currentOutput.remove(input[i]); // backtracking step
        findSubsets(i + 1, input, currentOutput, list);
    }

    public static void main(String[] args){
        GenerateAllSubsets pro2 = new GenerateAllSubsets();
        //int[] arr = new int[]{1, 2, 3};
        //int[] output = new int[arr.length];
        //pro2.findSubsets(0, arr, output);
        Integer[] arr = new Integer[]{1, 2, 3};
        ArrayList<Integer> output = new ArrayList<>();
        ArrayList<Integer[]> answer = new ArrayList<>();
        pro2.findSubsets(0, arr, output, answer);
    }
}
