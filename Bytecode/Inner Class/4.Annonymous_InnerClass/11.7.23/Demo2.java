class Demo2{						//Parent class
	void marry(){
		System.out.println("kriti senon");
	}
}
class Client{
	public static void main(String[] args){
		Demo2 obj1=new Demo2(){			//Client$1.class(Child class)
			void marry(){
				System.out.println("Disha patani");
			}
		};

		//Demo2 obj1=new Client$1();	//Internal(Parent-Child Realition)
		obj1.marry();//Overriding
			     
		Demo2 obj2=new Demo2(){                 //Client$2.class(Child class)	New class
                        void marry(){
                                System.out.println(".............Loding");
				fun();
                        }
			void fun(){
				System.out.println("In Fun");
			}
                };
		obj2.marry();
	}
}

/*
 	1.Annonymus Inner class and Outer class are in Parent-child relation.

	2.Annonymus Inner class can be used as One time Only.
 */
