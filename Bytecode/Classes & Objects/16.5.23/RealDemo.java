class PUBG{
	int noOfPlayer=100;
	String startGame="Lets Go.....";

	void map(){
		String map1="Erangel";
		String map2="Miramar";
		System.out.println(startGame);
		System.out.println("Total Alive Alive Players =" + noOfPlayer);	
	}
}
class Gamer{
	public static void main(String[] args){
		PUBG obj=new PUBG();
		obj.map();
	}
}
