class Parent{
	Parent(){
		System.out.println("In Parent Constructor");
	}
	
	void property(){
		System.out.println("Flat,Money,Car");
	}
	
	void marry(){
		System.out.println("Dipika Padukone");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("In Child Constructor");
	}

	void marry(){
                System.out.println("Alia Bhatt");
        }
}
class Client{
	public static void main(String[] args){
		Parent obj=new Child();
		obj.property();		//Flat,Money,Car
		obj.marry();		//Alia Bhatt

		Parent obj=new Parent();
		obj.property();         //Flat,Money,Car
                obj.marry(); 		//Dipika Padukone
	}
}
