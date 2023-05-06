/*
class TryDemo{
	public static void main(String []p){
		TryDemo o=new TryDemo();
		o.fun();// error: method fun in class TryDemo cannot be applied to given types;
	}
	void fun(int x){
                System.out.println("in fun");
                System.out.println(x);
        }


}
*/
class TryDemo{
        public static void main(String []p){
                TryDemo o=new TryDemo();
                o.fun(10);// error: method fun in class TryDemo cannot be applied to given types;
        }
        void fun(){
                System.out.println("in fun");
                System.out.println(x);
        }


}

