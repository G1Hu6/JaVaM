//Here we can define our Userdefined Exception classes in different packages also.

import java.util.*;
class DataOverflowException extends RuntimeException{
	DataOverflowException(String msg){
	
	}
}

class DataUnderflowException extends RuntimeException{
        DataUnderflowException(String msg){
		
        }
}

class UserDemo1{
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
			arr[i]=data;
		}

		//Here we cannot print Discription messages.
		//we has to pass the messages to the Throwable class with the help of Constructor chaining.
		// super(msg);  /*In Exception classes*/
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
	}
}

