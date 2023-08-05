class ArrayDemo{
	public static void main(String[] args){
		System.out.println("start main");

		int arr[]=new int[]{1,2,3,4,5};
		for(int i=0;i<=arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("End main");
	}
}
/*
 superv@superv-VMware-Virtual-Platform:~/JavaClass/Bytecode/Exception Handling/13.7.23$ java ArrayDemo 
start main
1
2
3
4
5
 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at ArrayDemo.main(AIOOBExp.java:7)

 */
