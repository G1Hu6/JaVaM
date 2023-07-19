class MyThread extends Thread{
        public void run(){
                for(int i=0;i<10;i++){
                        System.out.println("In run");
			try{	
				Thread.sleep(1000);
			}catch(InterruptedException obj){
				//handling code
			}
		}
	}
}

class MultiThread1{
	public static void main(String[] args)throws InterruptedException{ 

                 MyThread obj=new MyThread();	// New/Born state
                 obj.start();

                 for(int i=0;i<10;i++){
                        System.out.println("In main");
                        Thread.sleep(1000);     
                 }
        }
}

//Priority of threads is decided by Thread Schedular.
//Mainly Thread Life cycle have 4 stages(sleep is substage).
