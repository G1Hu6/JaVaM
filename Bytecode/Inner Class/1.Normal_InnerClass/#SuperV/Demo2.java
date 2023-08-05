class Outer{
	int x=10;
	static int y=29;
        class Inner{
                void fun(){
                        System.out.println("In fun-Outer");
                        System.out.println(x);
			System.out.println(y);
			gun();
                }
        }
        void gun(){
                        System.out.println("In gun-Inner");
                }
}
class Client{
        public static void main(String[] args){
                Outer obj=new Outer();
                obj.gun();              //gun(obj);     Internal call

                Outer.Inner obj1=new Outer().new Inner();       //Proper Protocall
                                                                //Outer$Inner(obj1, new Outer());
                obj1.fun();
	}
}
