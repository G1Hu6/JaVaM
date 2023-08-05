class Player{
	private int jerNo=0;
	private String name=null;

	Player(int jerNo,String name){
		System.out.println(System.identityHashCode(this.jerNo));
                System.out.println(System.identityHashCode(this.name));
		this.jerNo=jerNo;
		this.name=name;
		System.out.println("In Constructor");
		System.out.println(System.identityHashCode(this.jerNo));
                System.out.println(System.identityHashCode(this.name));
		System.out.println();
	}
	void info(){
		System.out.println(jerNo +" = "+ name);
	}
}
class Client{
	public static void main(String[] args){
		Player obj1=new Player(18,"KingVirat");
		obj1.info();
		Player obj2=new Player(7,"Mahi");
		obj2.info();
		Player obj3=new Player(45,"VadaPav");
		obj3.info();
		
		// #Superv: Here all strings are goes on SCP because of null can show hashcode 0
		System.out.println();
	}
}
