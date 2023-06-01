/*
   #SuperV: constructor type is same as class type.
 
class Intro{
	//default constructor
}
Bytecode:
Compiled from "Intro.java"
class Intro {
  Intro();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return
}
*/

/*
public class Intro{
	//public constructor
}
Compiled from "Intro.java"
public class Intro {
  public Intro();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return
}
*/


/*
private class Intro{
	// modifier private not allowed here
}
protected class Intro{
 	// modifier protected not allowed here
}
static class Intro{
	// modifier static not allowed here
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------


class Intro{
	static Intro(){
		//error : modifier static not allowed here
	}
}
except static all other modifiers are allowed here.
*/
