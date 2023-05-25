class Demo{
	int x=10;
	Demo(){      //Demo(Demo this)  .....Internally
		System.out.println("In Constructor---");
		System.out.println(x);
		System.out.println(this.x);
	}

	void fun(){    //void fun(Demo this)
		System.out.println(x);
                System.out.println(this.x);
	}

	public static void main(String[] args){
		Demo obj=new Demo();
		// Demo(obj);........SubInstruction
		
		obj.fun();
		// fun(obj);

	}
}
