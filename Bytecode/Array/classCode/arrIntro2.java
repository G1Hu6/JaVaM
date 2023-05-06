class ArrDemo{
	public static void main(String[] i){
		int arr1[];//it gives error in c not in java
			  //error:Array size is missing in 'arr'

		//int arr[4];//unexpectable error
			   //error: ']' expected
			
	     	int arr2[]=new int[4];
		//int arr3[]=new int[];// error: array dimension missing
		//		int arr3[]=new int[];	
		//		                    ^
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);

		arr2[0]=30;
		arr2[1]=98;
		arr2[3]=12;
		arr2[2]=0;

		System.out.println(arr2[0]);
                System.out.println(arr2[1]);
                System.out.println(arr2[2]);
                System.out.println(arr2[3]);

		//***both arrays a1 and a2 goes on heap section.
		char a1[]={'N','N','L'};
		char a2[]=new char[]{'N','N','L'};
		System.out.println(a2[0]);
                System.out.println(a2[1]);
                System.out.println(a2[2]);
                //System.out.println(a2[3]);
 		char ch[]=new char[3];
		System.out.println(ch[0]);
                System.out.println(ch[1]);	
		System.out.println(ch[2]);
	}
}
