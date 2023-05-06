class ArrClass{
	public static void main(String []p){
		int arr[]=new int[]{10,20,30,40,50};//same
		//int arr[]=new int[]{10000,20000};//Different
		//char arr[]={'A','K','L','P','j'};
		//float arr[]={1.1f,2.2f,3.3f,4.4f,5.5f};

		int arr1[]={10,20,30,40,50};
		//int arr1[]=new int[]{10000,20000};
		//char arr1[]={'A','K','L','P','j'};
		//float arr1[]={1.1f,2.2f,3.3f,4.4f,5.5f};

		System.out.println(arr);
		System.out.println(arr1);

		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr1[0]));

		System.out.println();

		System.out.println(System.identityHashCode(arr));
                System.out.println(System.identityHashCode(arr1));

		//char a[]={'A','K','L','P','j'};
		//float a[]={1.1f,2.2f,3.3f,4.4f,5.5f};
		//String a[]={"ssss","dddddd"};
		//double a[]={1.1,2.2,3.3,4.4,5.5};
		//boolean a[]={false,true,false};
		byte a[]={10,20,30,40,50};
		System.out.println(a);

	}
}
