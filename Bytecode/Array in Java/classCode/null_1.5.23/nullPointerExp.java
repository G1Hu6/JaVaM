class NullDemo{
	public static void main(String[] args){
		int arr1[][]={{},{},{}};//Complete Array
		int arr2[][]=new int[3][];//Incomplete Array
		
		System.out.println(arr1.length);//3
		System.out.println(arr1[0].length);//0

		System.out.println(arr2.length);//3
		//System.out.println(arr2[0].length);//Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "<local2>[0]" is null
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);

		arr1[0]=new int[]{};
		arr2[0]=new int[]{};	
		System.out.println(arr1[0].length);
                System.out.println(arr2[0].length);	
	}
}
