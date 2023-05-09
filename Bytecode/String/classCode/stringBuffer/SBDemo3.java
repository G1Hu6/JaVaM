class SBDemo3{
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer(100);//Initial capacity
		sb.append("Core2Web");
		sb.append("binecamp");
		System.out.println(sb.capacity());
		System.out.println(sb);

		sb.append("Incubator");
		System.out.println(sb.capacity());
		System.out.println(sb);
	}
}
