// here Accessing default from 2 differednt folder gives error but public variable is accessed.
class Std2{
	public static void main(String[] args){
		C2W2 obj=new C2W2();
		obj.disp();
		System.out.println(obj.noOfCources);
                System.out.println(obj.favCourse);
	}
}
/*Default2_2.java:3: error: cannot find symbol
		C2W2 obj=new C2W2();
		^
  symbol:   class C2W2
  location: class Std2
Default2_2.java:3: error: cannot find symbol
		C2W2 obj=new C2W2();
		             ^
  symbol:   class C2W2
  location: class Std2
2 errors

 */
