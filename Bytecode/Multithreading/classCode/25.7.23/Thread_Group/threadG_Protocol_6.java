//at the time of thread creation its name should be changed according to protocol.


/*
class MyThread extends Thread{

        MyThread(String msg){
                super(msg);
        }

        public void run(){
                System.out.println(getName());
                System.out.println(Thread.currentThread().getThreadGroup());
        }
}

class TGDemo3{
        public static void main(String[] args){
                MyThread obj=new MyThread("PQR");
                obj.start();

		MyThread obj1=new MyThread("XYZ");			//Two Threads having same name are allowed
                obj1.start();

		MyThread obj2=new MyThread();             		//error: constructor MyThread in class MyThread cannot be applied to given types; 
                obj2.start();

                System.out.println(Thread.currentThread().getThreadGroup());
        }
}
*/

class MyThread extends Thread{
        MyThread(){
		
	}
        MyThread(String msg){
                super(msg);
        }

        public void run(){
                System.out.println(getName());
                System.out.println(Thread.currentThread().getThreadGroup());
        }
}

class TGDemo3{
        public static void main(String[] args){
                MyThread obj=new MyThread("PQR");
                obj.start();

                MyThread obj1=new MyThread("PQR");                      //Two Threads having same name are allowed
                obj1.start();

                MyThread obj2=new MyThread();                           //Thread-0
                obj2.start();

                System.out.println(Thread.currentThread().getThreadGroup());
        }
}

