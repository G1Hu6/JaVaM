class Demo2{                                            //Parent class
        void marry(){
                System.out.println("kriti senon");
        }
        public static void main(String[] args){
                Demo2 obj2=new Demo2(){
                        void marry(){
                                System.out.println("Disha Patani");

                        }
                        Demo2 fun(){
                                System.out.println("In Fun");
				return new Demo2();
                        }
                }.fun();
                obj2.marry();
        }
}

