class PhoneBattery{
	public static void main(String[] args){
		int batteryPercentage=80;
		if(batteryPercentage<=20){
			System.out.println("Charge Your Phone !!!");
		}
		else if(batteryPercentage==100){
			System.out.println("Fully Charged");
		}
		else{
			System.out.println("Battery Helth is ok.");
		}
	}
}
