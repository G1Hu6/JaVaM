class MyThread extends Thread{
        public void run()throws InterruptedException{
                for(int i=0;i<10;i++){
                        System.out.println("In run");
			Thread.sleep(1000);
                }
        }
}

class MultiThread1{
        public static void main(String[] args)throws InterruptedException{  //main Thread

                 MyThread obj=new MyThread();
                 obj.start();

                 for(int i=0;i<10;i++){
                        System.out.println("In main");
                        Thread.sleep(1000);     
                 }
        }
}
/*
error: run() in MyThread cannot implement run() in Runnable

	overridden method does not throw InterruptedException
 */
