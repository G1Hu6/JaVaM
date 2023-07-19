import java.io.*;
import java.util.*;
class DataOverflowException extends IOException{
	DataOverflowException(String msg){
		super(msg);
	}
}

class DataUnderflowException extends IOException{
        DataUnderflowException(String msg){
		super(msg);
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
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
	}
}
/*
Demo4.java:25: error: unreported exception DataUnderflowException; must be caught or declared to be thrown
				throw new DataUnderflowException("Bhava data 0 peksha lahan aahe !!");
				^
Demo4.java:28: error: unreported exception DataOverflowException; must be caught or declared to be thrown
				throw new DataOverflowException("Bhava data 100 peksha mota aahe !!");
				^
2 errors
*/
