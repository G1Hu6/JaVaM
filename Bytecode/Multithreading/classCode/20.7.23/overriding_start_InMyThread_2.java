//If donot override start() mathod in our class then new thread is created but it does not start it's processing.
// DO NOT override start() method in our class.

class MyThread extends Thread{
        public void run(){
                System.out.println("In run");
        }

        public void start(){                                         
                System.out.println("In MyThread start");
		run();
        }
}

class ThreadDemo3{
        public static void main(String[] args){
                MyThread obj=new MyThread();
                obj.start();

                System.out.println(Thread.currentThread().getName());   //main
        }
}
/*
In MyThread start
In run
main
 */
