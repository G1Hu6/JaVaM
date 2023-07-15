//Multiple catch can have sequence from child to parent

class MultiCatch{
	public static void main(String[] args){
		try{
			System.out.println(10/0);
		}catch(RuntimeException obj){
		
		}catch(ArithmeticException obj){	//error: exception ArithmeticException can already be caught
		
		}
	}
}
