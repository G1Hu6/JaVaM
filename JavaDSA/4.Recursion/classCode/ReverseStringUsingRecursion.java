class StringReverse{
	static String strRev(String str){
		if(str == null || str.length() <= 1)
			return str;
		//return strRev(str.substring(1)) + str.charAt(0);
		
	}

	public static void main(String[] args){
		String str = "core2web";
		System.out.println(strRev(str));
		/*
		String result = "";
		for(int i = str.length()-1; i >= 0; i--){
			result = result + str.charAt(i);
		}
		System.out.println(result);
		*/

		/*
		char resultArr[] = str.toCharArray();
		int start = 0;
		int end = str.length()-1;

		while(start < end){
			char temp = resultArr[start];
			resultArr[start] = resultArr[end];
			resultArr[end] = temp;

			start++;
			end--;
		}
		System.out.println(resultArr);
		*/
	}
}
