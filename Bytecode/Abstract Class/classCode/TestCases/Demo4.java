abstract class Demo1{
        abstract int fun();
}
class Child extends Demo1{
        static int fun(){
                return 10;
        }
}
/*
 error: fun() in Child cannot override fun() in Demo1
        static int fun(){
                   ^
  overriding method is static
*/
