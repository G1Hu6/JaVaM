class My1{
    static Integer a=new Integer(10);
    public static void main(String args[]) {
      int x=10;
      int y=10;
      Integer z=10;

      System.out.println(System.identityHashCode(x));	//Same
      System.out.println(System.identityHashCode(y));	//Same
      System.out.println(System.identityHashCode(z));	//Same
      
      System.out.println(System.identityHashCode(a));	//Different
    }
}
