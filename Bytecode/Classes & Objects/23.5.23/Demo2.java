class Demo2{
	static{
		System.out.println("In Static Block 1");
	}
	public static void main(String[] args){
                System.out.println("In Main...");
        }
}

class Client2{
	static{
		System.out.println("In Static Block 2");
	}
	public static void main(String[] args){
		System.out.println("In Main...");
	}
}
