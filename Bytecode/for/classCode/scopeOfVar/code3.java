class C2w{
        public static void main(String args[]){
        int x=10;
        {
         int x=20;
         System.out.println(x);
        }

        {
	int x=100;
        System.out.println(x);
        }

        System.out.println(x);
        }
}
