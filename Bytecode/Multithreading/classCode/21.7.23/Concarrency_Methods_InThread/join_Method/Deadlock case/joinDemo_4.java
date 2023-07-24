//We cannot print main thread with methods in child Thread.
//There is way to print using Design pattern.

class MyThread extends Thread{
	static Thread nmMain=null;
        public void run(){
		try{
			nmMain.join();
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

                Thread.sleep(2000);
                obj.join();             //thread main(Parent thread) stops until the thread-0(child thread) execute its task.
                                        //nice value
                for(int i=0;i<10;i++){
                        System.out.println("In main");
                }
        }
}
//to avoid Deadlock case we must use join method with parameters.
