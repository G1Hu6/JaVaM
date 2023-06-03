class C2W{
	int noOfCources=8;                 //default access specifier
	//default String favCourse="Cpp";   error: modifier default not allowed here
	         
	String favCourse="Cpp";            //default access specifier

	void disp(){
		System.out.println(noOfCources);
		System.out.println(favCourse);
	}
}
class Std{
	public static void main(String[] args){
		C2W obj =new C2W();
		obj.disp();
		System.out.println(obj.noOfCources);
                System.out.println(obj.favCourse);
	}
}
