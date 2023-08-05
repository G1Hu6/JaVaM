class ICFloat{
    static Float a=new Float(10.0f);
    public static void main(String args[]) {
      float x=10.0f;
      float y=10.0f;
      Float z=10.0f;

      System.out.println(System.identityHashCode(x));
      System.out.println(System.identityHashCode(y));	
      System.out.println(System.identityHashCode(z));	
      
      System.out.println(System.identityHashCode(a));	//Different
    }
}

//Integer Cache is only present in the case of Integer and Char
//So Different IdentityHashCode.
