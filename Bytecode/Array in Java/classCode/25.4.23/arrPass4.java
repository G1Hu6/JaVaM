class ArrDemo{
	public static void main(String[]p){
		int arr[]={10,20,30};
		fun(arr);
		for(int x:arr){
                        System.out.println(x);
                }	
	}
	static void fun(int xarr[]){
		for(int x:xarr){
			System.out.println(x);
		}
		xarr[0]=50;//New object is not created here
	}
} 
