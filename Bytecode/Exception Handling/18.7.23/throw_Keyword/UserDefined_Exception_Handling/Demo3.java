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
                        int data=sc.nextInt();
                        if(data<0){
                                throw new DataUnderflowException("Bhava data 0 peksha lahan aahe !!");
                        }
                        if(data>100){
                                throw new DataOverflowException("Bhava data 100 peksha mota aahe !!");
                        }

			try{
                        	arr[i]=data;
			}catch(DifferentValueException obj){
				System.out.println("Inter Integer value");
				data=sc.nextInt();
			}
                }

            
                for(int i=0;i<arr.length;i++){
                        System.out.println(arr[i]+" ");
                }
        }
}

