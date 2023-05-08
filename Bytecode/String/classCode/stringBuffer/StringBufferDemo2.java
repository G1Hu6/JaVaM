class StringBufferDemo2{
	public static void main(String[] args){
		StringBuffer sb1=new StringBuffer();  
      		System.out.println(sb1.capacity());
      		System.out.println(System.identityHashCode(sb1));
      		System.out.println(sb1.hashCode());
      		System.out.println(sb1);
      
      		StringBuffer sb=new StringBuffer("Sahshi");
      		System.out.println(sb.capacity());
      		System.out.println(System.identityHashCode(sb));
      		System.out.println(sb);
      		System.out.println(sb.hashCode());
      
      		sb.append("Bagal");
      		System.out.println(sb.capacity());
      		System.out.println(System.identityHashCode(sb));
      		System.out.println(sb);
      		System.out.println(sb.hashCode());
      
      		sb.append("Core2Web");
      		System.out.println(sb.capacity());
      		System.out.println(System.identityHashCode(sb));
      		System.out.println(sb);
      		System.out.println(sb.hashCode());
       	
      		sb.append(" Rrrrrr");
      		System.out.println(sb.capacity());
      		System.out.println(System.identityHashCode(sb));
      		System.out.println(sb);
      		System.out.println(sb.hashCode());
	}
}
