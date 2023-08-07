import java.util.*;
class CricPlayer{
	String pName=null;
	int jerNo=0;

	CricPlayer(String pName,int jerNo){
		this.pName = pName;
		this.jerNo = jerNo;
	}

	public String toString(){
		return pName +":"+jerNo;
	}
}

class UserDefinedData_toStringDemo{
	public static void main(String[] args){
		ArrayList al = new ArrayList();

		al.add(new CricPlayer("ViratSuperV",18).toString());
		al.add(new CricPlayer("RohitHitMan",45));
		al.add(new CricPlayer("DhoniThala",7));

		System.out.println(al);

		al.add(1,"God");
		System.out.println(al);
	}
}
