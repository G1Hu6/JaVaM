class Outer{
        void fun(){ //Level 0 
		class InnerOne{		        //Outer$1InnerOne.class
			class Inner1{		//Outer$1InnerOne$Inner1.class
			
			}
                }
        }
        void fun2(){ //Level 0
                class InnerTwo{ //Level 1       //Outer$1InnerTwo.class

                }
        }

}

