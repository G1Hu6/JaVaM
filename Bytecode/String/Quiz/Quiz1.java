class Quiz1{
	public static void main(String[] args){
		String str1="Pranav";
		String str2=new String("Pranav");
                 /*
		if(str1==str2){
			System.out.println("HashCode Equal");
		}
		else if(str1.equals(str2)){
                        System.out.println("Equal");
                }
		else if(str1.hashCode()==str2.hashCode()){
			System.out.println("Content Equal");
		}
		else{
			System.out.println("Not Equal");
		}

		int x=20;
		int y=10;
		if(x==y){
			System.out.println("Kim");
		}
		else{
			System.out.println("..........");
		}
		*/
		if(str1==str2){
                        System.out.println("HashCode Equal");
                }
		else{
			System.out.println("Not Equal");
		}
	}
}
