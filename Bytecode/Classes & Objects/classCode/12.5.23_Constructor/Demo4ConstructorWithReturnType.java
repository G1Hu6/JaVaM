class Demo4Con{
	
	void Demo4Con(){
		System.out.println("In Core2Web");
	}

	int x=10;//Variables that are declered above or below constructor goes into constructor
	public static void main(String[] args){
		Demo4Con obj=new Demo4Con();//Constructor called here
		obj.Demo4Con();
		System.out.println("In Main");
	}
}
