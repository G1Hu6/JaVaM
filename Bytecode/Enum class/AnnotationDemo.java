class Demo extends Exception{
	Demo(String str){
		super(str);
	}
}

class Parent{
	Parent(){
		System.out.println("In Parent-Constructor");
	}
	void m1()throws Demo{
		System.out.println("In Parent-m1");
		throw new Demo("Exception Handled");
	}
}

class Child extends Parent{
        Child(){
                System.out.println("In Child-Constructor");
        }
        void m1(){
                System.out.println("In Child-m1");
        }
}

class Client{
	public static void main(String[] args){
		Parent p = new Parent();
		//Parent p = new Child();

		try{
		p.m1();
		}catch(Demo d){
			System.out.println(d);
		}
	}
}
