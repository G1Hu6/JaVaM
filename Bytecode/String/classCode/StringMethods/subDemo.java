class SubDemo{
	public static void main(String[]args){
		String str="Core2Web tech";
		System.out.println(str.substring(5));
		System.out.println(str.substring(0));
		System.out.println(str.substring(0,5));
		//System.out.println(str.substring(-11,4));//StringIndexOutOfBoundsException: Range [-11, 4) out of bounds for length 13 
		System.out.println(str.substring(0,0));

		mySub(str,5);
		mySub(str,0,5);
	}
	static void mySub(String str,int a,int b){
		char arr[]=str.toCharArray();
		char arr1[]=new char[b-a];
		int j=0;
		for(int i=a;i<b;i++){
			arr1[j]=arr[i];
			j++;
		}
		System.out.println(arr1);
	}
	static void mySub(String str,int a){ 
		char arr[]=str.toCharArray();
                char arr1[]=new char[arr.length-a];
                int j=0;
                for(int i=a;i<arr.length;i++){
                        arr1[j]=arr[i];
                        j++;
                }
                System.out.println(arr1);

	}
}
