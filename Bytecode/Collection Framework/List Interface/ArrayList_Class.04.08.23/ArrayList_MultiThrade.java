/*

import java.util.*;
import java.util.concurrent.*;

class MyThread extends ArrayList implements Runnable{
	static ArrayList nm = null;
	public void run(){
		System.out.println("Hii");
		System.out.println(Thread.currentThread().getName());
		for(int i=0 ;i<10 ;i++){
			nm.add(i);
		}
		System.out.println(nm);
	}
}

class Client{
	public static void main(String[] args) throws InterruptedException{
		MyThread obj = new MyThread();
		//Thread td = new Thread(obj);
		//td.start();
		
		ArrayList al = new ArrayList();
		MyThread.nm = al;
		
		/*
		al.add(100);
		Thread.sleep(10000);
		al.add("Shashi");
		al.add("King");
		al.add(20);
		
		ThreadPoolExecutor tpe = (ThreadPoolExecutor)Executors.newFixedThreadPool(10);
		tpe.execute(obj);
		tpe.execute(obj);

		System.out.println(al);
		System.out.println(Thread.currentThread().getName());
	}
}
*/

/*
Hii
[]
Hii
main
pool-1-thread-2
pool-1-thread-1
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
Exception in thread "pool-1-thread-2" java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:911)
	at java.util.ArrayList$Itr.next(ArrayList.java:861)
	at java.util.AbstractCollection.toString(AbstractCollection.java:461)
	at java.lang.String.valueOf(String.java:2994)
	at java.io.PrintStream.println(PrintStream.java:821)
	at MyThread.run(ArrayList_MultiThrade.java:12)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:750) 
 */

import java.util.*;
import java.util.concurrent.*;

class MyThread extends Vector implements Runnable{
        static Vector nm = null;
        public void run(){
                System.out.println("Hii");
                System.out.println(Thread.currentThread().getName());
                for(int i=0 ;i<10 ;i++){
                        nm.add(i);
                }
                System.out.println(nm);
        }
}

class Client{
        public static void main(String[] args) throws InterruptedException{
                MyThread obj = new MyThread();
                //Thread td = new Thread(obj);
                //td.start();

                Vector al = new Vector();
                MyThread.nm = al;

                /*
                al.add(100);
                Thread.sleep(10000);
                al.add("Shashi");
                al.add("King");
                al.add(20);
                */
                ThreadPoolExecutor tpe = (ThreadPoolExecutor)Executors.newFixedThreadPool(10);
                tpe.execute(obj);
                tpe.execute(obj);

                System.out.println(al);
                System.out.println(Thread.currentThread().getName());
        }
}

//No Exception
