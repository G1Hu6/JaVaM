import java.io.*;
class IExp{
        public static void main(String[] args){
                for(int i=0;i<=10;i++){
                        System.out.println("In Loop");

			try{
                        	Thread.sleep(5000);
			}
			catch(IOException obj){		//Compiler can check CompiletimeException(Checked Exception) if it never thrown by program then give 
							
							//error: exception IOException can never thrown in body of corresponding try statement.
							// error: unreported exception InterruptedException; must be caught or declared to be thrown
							// 2 error
			}
		}
	}
}
