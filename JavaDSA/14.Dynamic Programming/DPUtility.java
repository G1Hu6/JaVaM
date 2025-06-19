public class DPUtility{

    public static void initDPArray(int[] arr){

        java.util.Arrays.fill(arr, -1);
    }

    public static void initDPArray(int[][] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                java.util.Arrays.fill(arr[i], -1);
            }
        }
    }
}
