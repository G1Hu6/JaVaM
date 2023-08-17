import java.util.*;

class StringDemo{
	public static void main(String[] args){
		String str1 = "RAM";
		String str2 = "SAM";
		String str3 = "KAM";

		HashSet hs = new HashSet();
		hs.add(str1);
		hs.add(str2);
		hs.add(str3);

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
	}
}
