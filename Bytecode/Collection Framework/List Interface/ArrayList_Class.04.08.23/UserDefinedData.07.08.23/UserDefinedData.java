import java.util.*;
class ITCompany{
	String cName=null;
	int empNo=0;

	ITCompany(String cName,int empNo){
		this.cName = cName;
		this.empNo = empNo;
	}

	String display(){
		return cName;
	}
}

class UserDefinedDataDemo{
	public static void main(String[] args){
		ArrayList al = new ArrayList();

		al.add(10);
		al.add("King");
		al.add(30.33);
		al.add(new ITCompany("Binecaps",2));		//ITCompany@7344699f (Address)
		al.add(new ITCompany("Binecaps",2).display());

		System.out.println(al);
	}
}
