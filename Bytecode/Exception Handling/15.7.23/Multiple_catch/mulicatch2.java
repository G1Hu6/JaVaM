
class MultiCatch{
	public static void main(String[] args){
		try{
			System.out.println(10/0);
		}catch(ArithmeticException obj){
		
		}catch(RuntimeException obj){
		
		}catch(Exception obj){
		
		}catch(Throwable obj){
		
		}/*catch(Object obj){
			//error: incompatible types: Object cannot be converted to Throwable

		}*/
	}
}
