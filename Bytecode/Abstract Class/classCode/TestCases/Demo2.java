abstract class Demo1{
        public abstract int fun();
}
class Child extends Demo1{
	public int fun(){
	 	return 10;
	}
}


/*
 abstract class Demo1{
        public abstract int fun();
}
class Child extends Demo1{
        int fun(){
                return 10;
        }
}
---------------------------------------------------------------------------------
abstract class Demo1{
        public abstract int fun();
}
class Child extends Demo1{
        private int fun(){
                return 10;
        }
}
--------------------------------------------------------------------------------
abstract class Demo1{
        public abstract int fun();
}
class Child extends Demo1{
        protected int fun(){
                return 10;
        }
}
---------------------------------------------------------------------------------
error: fun() in Child cannot override fun() in Demo1
	attempting to assign weaker access privileges; was public.
 */
