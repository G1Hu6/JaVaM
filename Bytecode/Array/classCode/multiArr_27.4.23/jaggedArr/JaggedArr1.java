class JaggedArr1{
        public static void main(String[]args){
                //int arr[][]={{1,2},{3,4},{5,6}};
                int arr[][]={{1,2,7},{3,4},{5}};
                //int arr[][]={1,2,3,4,5,6}; error
                for(int i=0;i<arr.length;i++){
                        for(int j=0;j<arr[i].length;j++){
                                System.out.print(arr[i][j]+" ");
                        }
                        System.out.println();
                }
                //System.out.println(arr[1][2]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
        }
}

