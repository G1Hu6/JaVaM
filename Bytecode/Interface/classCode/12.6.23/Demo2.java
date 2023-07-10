interface Demo1{
        void gun();

        void fun();
}
class Child implements Demo1{ 
	void gun(){
		
	}
	void gun(){
	
	}
}
/*
error: gun() in Child cannot implement gun() in Demo1
	void gun(){
	     ^
  attempting to assign weaker access privileges; was public
 */
