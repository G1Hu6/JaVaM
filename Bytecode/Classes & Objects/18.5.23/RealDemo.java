class Network{
	static boolean router=true;
	String phoneSim="Jio 5G";
	int speed=100;

	void speedTest(){
		System.out.println("Router condition(On or Off) =" + router);
		System.out.println("Phone Sim Card name =" +phoneSim);
		System.out.println("Download Speed = "+speed +" Mbps.");
	}
}
class UserDemo{
	public static void main(String[] args){
		Network samsang=new Network();
		Network iphone=new Network();

		samsang.speedTest();
		iphone.speedTest();

		System.out.println("**********************************");

		samsang.router=false;
		samsang.phoneSim="Airtal 5G";
		samsang.speed=500;

		samsang.speedTest();
                iphone.speedTest();
	}
}
