class ThreadDemo1{
	static void fun(){
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}
	public static void main(String[] args){
		for(int i=10;i<20;i++){
			System.out.println(i);
		}
		fun();
	}
}
/*
10
11
12
13
14
15
16
17
18
19
0
1
2
3
4
5
6
7
8
9

 */
