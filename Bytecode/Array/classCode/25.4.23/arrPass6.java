class ArrDemo1{
	public static void main(String []pp){
		int arr[]={50,70,55};
		System.out.println(arr);
		fun(arr);
		System.out.println(arr);
	}
	static void fun(int arr[]){
		arr[0]=90;
		System.out.println(arr);
	}
}
