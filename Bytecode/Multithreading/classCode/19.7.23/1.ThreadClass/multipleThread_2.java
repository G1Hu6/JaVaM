class MyThread extends Thread{
        public void run(){
                for(int i=0;i<10;i++){
                        System.out.println("In run");
                }
        }
}

class MultiThread1{
        public static void main(String[] args){  //main Thread

                 MyThread obj=new MyThread();
                 obj.start();   

                 for(int i=0;i<10;i++){
                        System.out.println("In main");
			Thread.sleep(1000);	//error: unreported exception InterruptedException; must be caught or decleared to be thrown.
                 }
        }
}

