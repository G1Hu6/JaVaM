import java.util.*;
class Employee{
	String empName = null;
	int empId = 0;

	Employee(String empName,int empId){
		this.empName = empName;
		this.empId = empId;
	}

	/*
	Comparable cmp =(obj) ->{
		return empName.compareTo(((Employee)obj).empName);
	};
	*/


	public String toString(){
		return empName + " : " +empId;
	}
}

class UsingLambdaInComparable1{
	public static void main(String[] args){

		Comparator cmp =(obj) ->{
                	return (new Employee().empName).compareTo(((Employee)obj).empName);
        	};

		TreeSet al = new TreeSet();

		al.add(new Employee("Shashi",11));
		al.add(new Employee("Ashish",22));
		al.add(new Employee("Kanha",43));

		System.out.println(al);
	}
}

