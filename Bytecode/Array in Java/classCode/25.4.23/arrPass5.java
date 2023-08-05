class ArrDemo{
	public static void main(String[]p){
		int arr[]={10,20,30};
		fun(arr);
		for(int x:arr){
                        System.out.println(x);
                }	
	}
	static void fun(int arr[]){
		for(int x:arr){
			System.out.println(x);
		}
		for(int i=0;i<arr.length;i++){
			arr[i]=arr[i]+50;
		}
	}
}
