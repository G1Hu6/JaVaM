/*
class Outer{
	Object fun(){
		System.out.println("In Outer Fun");
		class Inner{
			static void fun(){
				System.out.println("In Inner Fun");
			}
		}
		return this;
	}
	void gun(){
		System.out.println("In Outer gun");
	}
}
class Client{
	public static void main(String[] args){
		Outer obj=new Outer();
		obj.fun().fun();
		//System.out.println(new Outer.Inner.fun());
	}
}
*/

class Outer{

    class Inner1{
        void m2(){

        }
    }

    Inner1 m1(){
        System.out.println("In Outer Fun1");
        class Inner extends Inner1{
            void m2(){
                System.out.println("In Inner Fun 2");
            }
        }
        return new Inner();
    }
    void m3(){
        System.out.println("In Outer Fun 3");
    }
}


class Client{
    public static void main(String[] args) {
        Outer obj=new Outer();
        obj.m1().m2();
        obj.m3();
        System.out.println();
    }
}
