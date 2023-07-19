/*
import java.util.*;
class DataOverflowException extends RuntimeException{
	DataOverflowException(String msg){
		super(msg);	//Constructor Chaining
	}
}

class DataUnderflowException extends RuntimeException{
        DataUnderflowException(String msg){
		super(msg);	//Constructor Chaining
        }
}

class DifferentValueException{
	DifferentValueException(String msg){
	
	}
}

class UserDemo2{
        public static void main(String[] args){
             	int arr[]=new int[5];
            
	    	Scanner sc=new Scanner(System.in);
                System.out.println("Enter Integer value :");
                System.out.println("Note : 0 < element < 100 ");
		
                for(int i=0;i<arr.length;i++){
                        int data=0;
			try{
				data=sc.nextInt();
			}catch(DifferentValueException obj){						//error: incompatible types: DifferentValueException cannot be converted to Throwable
				System.out.println("Exception..");
				throw new DifferentValueException("Integer value tak ki bhava...");	//incompatible types: DifferentValueException cannot be converted to Throwable
				data=sc.nextInt();
			}
			if(data<0){
                                throw new DataUnderflowException("Bhava data 0 peksha lahan aahe !!");
                        }
                        if(data>100){
                                throw new DataOverflowException("Bhava data 100 peksha mota aahe !!");
                        }
			
                        arr[i]=data;
                }
                for(int i=0;i<arr.length;i++){
                        System.out.println(arr[i]+" ");
                }
        }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------
*/

import java.util.*;
class DataOverflowException extends RuntimeException{
        DataOverflowException(String msg){
                super(msg);     //Constructor Chaining
        }
}

class DataUnderflowException extends RuntimeException{
        DataUnderflowException(String msg){
                super(msg);     //Constructor Chaining
        }
}

class DifferentValueException extends Throwable{
        DifferentValueException(String msg){
        	
        }
}

class UserDemo2{
        public static void main(String[] args){
                int arr[]=new int[5];
            
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Integer value :");
                System.out.println("Note : 0 < element < 100 ");
                
                for(int i=0;i<arr.length;i++){
                        int data=0;
                        try{
                                data=sc.nextInt();
                        }catch(DifferentValueException obj){                                        
                                System.out.println("Exception..");
                                throw new DifferentValueException("Integer value tak ki bhava...");     
                                data=sc.nextInt();
                        }
                        if(data<0){
                                throw new DataUnderflowException("Bhava data 0 peksha lahan aahe !!");
                        }
                        if(data>100){
                                throw new DataOverflowException("Bhava data 100 peksha mota aahe !!");
                        }
                        
                        arr[i]=data;
                }
                for(int i=0;i<arr.length;i++){
                        System.out.println(arr[i]+" ");
                }
        }
}

