class Demo2{
        int x=10;

        Demo2(){         //Demo2(Demo2 this)
                System.out.println(this.x);//10
		System.out.println(x);//10
		System.out.println("In No-Args Constructor");
        }

        Demo2(int x){    //Demo2(Demo2 this , int x)
	        System.out.println(this.x);//10
                System.out.println(x);//50    Local variable has more priority
                System.out.println("In Para Constructor");
        }

        public static void main(String[] args){
                Demo2 obj1=new Demo2();     //Demo2(obj1)

                Demo2 obj2=new Demo2(50);   //Demo2(obj2,50)
     	}
}

