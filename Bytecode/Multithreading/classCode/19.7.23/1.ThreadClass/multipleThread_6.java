class MyThread extends Thread{
        public void run(){
		/*error: run() in MyThread cannot implement run() in Runnable
  	      		void run(){
             			^
 		 attempting to assign weaker access privileges; was public

		 */
		System.out.println("Child Thread =" +Thread.currentThread().getName());
		}
}

class MultiThread1{
	public static void main(String[] args){ 
		 System.out.println("Main Thread =" +Thread.currentThread().getName());

                 MyThread obj=new MyThread();	// New/Born state
                 obj.start();

                 MyThread obj1=new MyThread();   // New/Born state
                 obj1.start();

        }
}

