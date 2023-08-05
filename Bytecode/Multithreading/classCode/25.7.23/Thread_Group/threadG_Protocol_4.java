class MyThread extends Thread{
	MyThread(String msg){
		//Here name of thread should not be changed because our name didnot passed to Thread class.	
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

                System.out.println(Thread.currentThread().getThreadGroup());
        }
}


/*
java.lang.ThreadGroup[name=main,maxpri=10]
Thread-0
java.lang.ThreadGroup[name=main,maxpri=10]
*/
