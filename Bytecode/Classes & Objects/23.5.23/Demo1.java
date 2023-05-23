class Demo1{
	static{
		System.out.println("In Static Block 1");
	}
}

class Client1{
	static{
		System.out.println("In Static Block 2");
	}
	public static void main(String[] args){
		System.out.println("In Main...");
		Demo1 obj =new Demo1();
	}
}
