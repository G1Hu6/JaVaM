abstract class Demo1{
        protected abstract int fun();
}
class Child extends Demo1{
        protected  int fun(){
                return 10;
        }
}
/*
 abstract class Demo1{
        protected abstract int fun();
}
class Child extends Demo1{
        int fun(){
                return 10;
        }
}
------------------------------------------------------------------
abstract class Demo1{
        protected abstract int fun();
}
class Child extends Demo1{
        private int fun(){
                return 10;
        }
}
-------------------------------------------------------------------
error: fun() in Child cannot override fun() in Demo1
	int fun(){
	    ^
  attempting to assign weaker access privileges; was protected

*/
