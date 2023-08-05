class Demo{
        void m1(){
                System.out.println("In m1");
        }
        void m2(){
                System.out.println("In m2");
        }
        public static void main(String[] args){
                Demo obj=new Demo();
                obj.m1();
        
		obj=null;
	
		try{
                	obj.m2();
		}catch(NullPointerException obj1){
			  System.out.println("Here...");
		}finally{
			  System.out.println("Connection Close...");
		}
		
		System.out.println("end main");
        }
}

/*
 * uperv@superv-VMware-Virtual-Platform:~/JavaClass/Bytecode/Exception Handling/15.7.23/Finally Block$ java Demo

In m1
Here...
Connection Close...
end main

 */
