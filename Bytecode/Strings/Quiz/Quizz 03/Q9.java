class Q9{
	public static void main(String[] args){
		StringBuffer str= new StringBuffer("core2web");
		long sbvar1=System.identityHashCode(str);
		str.append(" technology");
		long sbvar2=System.identityHashCode(str);
		if(sbvar1==sbvar2)
			System.out.println("true");
		else
			System.out.println("false");
	}
}
