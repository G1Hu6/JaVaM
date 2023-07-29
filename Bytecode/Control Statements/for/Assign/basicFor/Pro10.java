//10. Write a program to print the product of the first 10 numbers

class Pro10{
	public static void main(String[] args){
		int mul=1;
		for(int i=1;i<=10;i++){
			mul=mul*i;
		}
		System.out.println("product of the first 10 numbers ="+ mul);
	}
}
