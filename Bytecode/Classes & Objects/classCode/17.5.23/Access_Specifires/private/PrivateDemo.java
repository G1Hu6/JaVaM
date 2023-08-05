class PriDemo{
	int x=10;
	private String y="King";
	void disp(){
		System.out.println(x);
		System.out.println(y);
	}
}
class Demo{
	public static void main(String[] args){
		PriDemo obj=new PriDemo();
		System.out.println(obj.x);
                //System.out.println(obj.y);    error: y has private access in PriDem
		//System s=new System();//Wc can't access System class Object
				      //because its constructor is decleared as Private
				      //error: System() has private access in System
		String d=new String();
	}
}
