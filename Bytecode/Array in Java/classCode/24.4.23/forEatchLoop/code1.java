public class code1{
    public static void main(String args[]) {
        int arr[]=new int[4];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+10;
        }
        for(int var :arr){
            System.out.println(var);
        }
        System.out.println();
        for(float var :arr){
            System.out.println(arr[0]);
            System.out.println(var);
	    //System.out.println(var[0]);		//error:array required but float found
        }
        
    }
}
