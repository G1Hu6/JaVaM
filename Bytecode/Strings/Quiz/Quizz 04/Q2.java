class Q2{
        public static void main(String[] args){
                StringBuilder str1=new StringBuilder("String");
                StringBuffer str2=new StringBuffer(str1);
		String str3=new String(str2);
                System.out.println(str3.replace('t','p'));
		System.out.println(str3);
        }
}

