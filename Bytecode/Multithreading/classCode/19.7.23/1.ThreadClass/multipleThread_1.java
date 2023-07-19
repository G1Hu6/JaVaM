// Multithreading is introduced due to implement Performance.


class MyThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("In run");
		}
	}
}

class MultiThread1{
	public static void main(String[] args){	 //main Thread
		 
		 MyThread obj=new MyThread();
		 obj.start();	//at these line newly created Thread0 start processing

	       	 for(int i=0;i<10;i++){
                        System.out.println("In main");
                 }
	}
}

/*
In main
In main
In main
In main
In main
In main
In main
In main
In main
In main
In run
In run
In run
In run
In run
In run
In run
In run
In run
In run

 */
