class ThreadDemo4{
        static void fun()/*throws InterruptedException*/{
                for(int i=0;i<10;i++){
                        System.out.println(i);
			try{	
				Thread.sleep(2000);	//Error removed.
			}catch(InterruptedException obj){
				//Handling code
			}
                }
        }
        public static void main(String[] args)throws InterruptedException{
                for(int i=10;i<20;i++){
                        System.out.println(i);
                        Thread.sleep(2000);     //Error removed.
                }
                fun();
        }
}

