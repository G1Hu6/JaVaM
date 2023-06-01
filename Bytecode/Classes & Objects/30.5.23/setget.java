class Player{
	private int jerNo=0;
	private String name=null;

	Player(){
		System.out.println("In Constructor");
	}

	void setter(int jerNo,String name){
		this.jerNo=jerNo;
		this.name=name;
	}

	void getter(){
		System.out.println(jerNo + " = " +name);
	}

}
class Client{
	public static void main(String[] args){
		Player obj1=new Player();
		obj1.setter(18,"SuperV");
		obj1.getter();

		obj1.setter(45,"Vada");
                obj1.getter();

	}
}
