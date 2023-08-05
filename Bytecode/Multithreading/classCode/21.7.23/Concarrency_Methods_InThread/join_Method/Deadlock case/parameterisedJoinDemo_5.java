class MyThread extends Thread{
	static Thread nmMain=null;
        public void run(){
		try{
			nmMain.join();
			//nmMain.join(1000,40);
		}catch(InterruptedException obj){
		
		}
                for(int i=0;i<10;i++){
                        System.out.println("In run");
                }
        }
}

class ThreadDemo1{
        public static void main(String[] args)throws InterruptedException{
                MyThread obj=new MyThread();
                obj.start();
		
		MyThread.nmMain=Thread.currentThread();

                //Thread.sleep(2000);
               
	       	//obj.join(-3);
		/*
		Exception in thread "main" java.lang.IllegalArgumentException: timeout value is negative
			at java.base/java.lang.Thread.join(Thread.java:1307)
			at ThreadDemo1.main(parameterisedJoinDemo_5.java:24)*/
		
		//obj.join(1000,99999999);
		/*Exception in thread "main" java.lang.IllegalArgumentException: nanosecond timeout value out of range
			at java.base/java.lang.Thread.join(Thread.java:1345)
			at ThreadDemo1.main(parameterisedJoinDemo_5.java:29)
		*/

		obj.join(1000,40);
                for(int i=0;i<10;i++){
                        System.out.println("In main");
                }
        }
}
