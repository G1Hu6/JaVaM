// Here default is accessed from same folder same file.
class C2W{
	int noOfCources=8;              
	String favCourse="Cpp";         

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
