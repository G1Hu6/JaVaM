import Exp.Unchecked.BatteryLowException;
import java.util.Scanner;

class MyThread implements Runnable{
	public void run(){
		
	}
}

class UserMobile{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int batteryPercentage=sc.nextInt();

		ThreadGroup obj=new ThreadGroup("King");

		try{
			if(batteryPercentage<=20){
				throw new BatteryLowException("Bhava Phone Charge Kar...");
			}
			else{
                        System.out.println("Battery Helth is OK!!!");
                	}
		}catch(BatteryLowException ble){
			System.out.println("Exception in thread  \""+Thread.currentThread().getName() + "\"");
			//System.out.print(ble.toString());
			ble.printStackTrace();
		}
	}
}
