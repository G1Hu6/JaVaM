class Declear{
	public static void main(String[] o){
		int []arr1=new int[4];
		arr1[0]=10;
		arr1[1]=10;
		arr1[2]=10;
		arr1[3]=10;

		int []arr2={20,20,20,20};

		int []arr3=new int[]{30,30,30,30};

		//int []arr3=new int[4]{40,40,40,40};//error: array creation with both dimension expression and initialization is illegal

		for(int i=0;i<4;i++){
			System.out.println(arr3[i]);
		}
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		//System.out.println(arr1[4]);	//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4

	}
}
