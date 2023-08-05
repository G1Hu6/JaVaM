import java.io.*;
class Demo{
        void getData()throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int data=0;
                try{
                        data=Integer.parseInt(br.readLine());
                }
                catch(NumberFormatException obj){
                        obj.printStackTrace();
			/*
			java.lang.NumberFormatException: For input string: "w"
			at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
			at java.base/java.lang.Integer.parseInt(Integer.java:665)
			at java.base/java.lang.Integer.parseInt(Integer.java:781)
			at Demo.getData(MethodDemo2.java:7)
			at Demo.main(MethodDemo2.java:16)
			0
			*/
			
			System.out.println(obj.getStackTrace());//[Ljava.lang.StackTraceElement;@c387f44
	        }
                System.out.println(data);
        }
        public static void main(String[] args)throws IOException{
                Demo obj=new Demo();
                obj.getData();
        }
}

