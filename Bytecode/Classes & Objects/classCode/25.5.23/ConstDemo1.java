class ConstDemo1{
	ConstDemo1(){
		System.out.println("No args");
	}

	ConstDemo1(int x){
                System.out.println("Para");
        }

	ConstDemo1(ConstDemo1 xyx){
                System.out.println("Para Demo");
        }
	
	public static void main(String[] args){
		ConstDemo1 obj1 =new ConstDemo1();
		ConstDemo1 obj2 =new ConstDemo1(10);
		ConstDemo1 obj3 =new ConstDemo1(obj2);

	}
}
