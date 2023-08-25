
import java.util.*;
class UsingLambdaInForEach{
	public static void main(String[] args){
		ArrayList al = new ArrayList();

		al.add(11);
		al.add(22);
		al.add(43);

		System.out.println(al);

		al.forEach(
			(data) -> System.out.println(data)
		);
	}
}

