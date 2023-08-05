interface Bird{
	void fly();

	void makeSound();
}

class Sparrow implements Bird{
	public void fly(){
		System.out.println("Flying...");
	}

	public void makeSound(){
		System.out.println("Chii..Chii..");	
	}
}

interface ToyDuck{
	void squak();

}
class PlassticToy implements ToyDuck{
	public void squak(){
		System.out.println("Squak");
	}
}

class AdapterBird implements ToyDuck{
	Bird bird;
	AdapterBird(Bird b){
		this.bird=b;
	}
	public void squak(){
		bird.makeSound();
	}
}

class Client{
	public static void main(String[] args){
		Sparrow sp=new Sparrow();
		ToyDuck td=new AdapterBird(sp);
		ToyDuck pt=new PlassticToy();
		
		System.out.println("ToyDuck...");
                pt.squak();

		System.out.println("AdapterBird...");
		td.squak();
	}
}
