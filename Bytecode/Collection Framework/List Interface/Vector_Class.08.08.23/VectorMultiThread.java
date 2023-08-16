import java.util.*;
class MyThread extends Vector implements Runnable{
        static Vector nm = null;
	static Thread t = null;
        public void run(){
                System.out.println("Hii");
                System.out.println(Thread.currentThread().getName());
                nm.add(55.55);
		try{
			t.join();
		}catch(InterruptedException ie){
		
		}
                nm.add(55.55);
		nm.remove(0);
                nm.add(55.55);
                System.out.println(nm);
        }
}

class Client{
        public static void main(String[] args) throws InterruptedException{
                MyThread obj = new MyThread();
                Thread td = new Thread(obj);
		MyThread.t = td;
                td.start();

                Vector al = new Vector();
                MyThread.nm = al;

                al.add(100);
                Thread.sleep(10000);
                al.add("Shashi");
                al.add("King");
                al.add(20);

                System.out.println(al);
                System.out.println(Thread.currentThread().getName());
        }
}

