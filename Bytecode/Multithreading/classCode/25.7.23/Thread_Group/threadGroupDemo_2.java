class MyThread extends Thread{
        public void run(){
                System.out.println(getName());           //thread-0

                System.out.println(Thread.currentThread().getThreadGroup());           //java.lang.ThreadGroup[name=main,maxpri=10]
        }
}
class TGDemo1{
        public static void main(String[] args){
                MyThread obj=new MyThread();
                obj.start();
		
		obj.getName("PPP");
		System.out.println(Thread.currentThread().getThreadGroup());    //main(Thread Group)
        }
}

