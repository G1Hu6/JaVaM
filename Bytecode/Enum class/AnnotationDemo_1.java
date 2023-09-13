class Parent{
        void m1(){
                System.out.println("In Parent-m1");
        }
}

class Child extends Parent{
        
	@Override
        void m1(int x){
                System.out.println("In Child-m1");
        }
}

class Client{
        public static void main(String[] args){
                Parent p = new Child();
		p.m1();
	}                
}
/*
 nnotationDemo_1.java:9: error: method does not override or implement a method from a supertype
	@Override
	^
1 error

 */

