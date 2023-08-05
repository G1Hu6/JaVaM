class Lendemo{
	public static void main(String[]args){
		String str1="KingVirat ";
		//System.out.println(str1.length());
  		//System.out.println(str1[0]); error
  		
		System.out.println(myStrLen(str1));

	}
	/*
	static int myLen(String a){
		int i=0;
		while(a.charAt(i)!=' '){
			i++;
		}
		return i;
	}
	*/

	static int myStrLen(String str){
		char arr[]=str.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++){
			count++;
		}
		return count;
	}
}
