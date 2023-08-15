import java.util.*;

class Employee{
	String empName = null;
	float empSalary = 0.0f;

	Employee(String empName ,float empSalary){
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public String toString(){
		return "{" + empName + " : " + empSalary +"}";
	}
}

class DrawbackCollectionsDemo3{
	public static void main(String[] args){
		ArrayList al = new ArrayList();

		al.add(new Employee("Rahul",900000.00f));
		al.add(new Employee("Kanha",100000.00f));
		al.add(new Employee("Badhe",600000.00f));
		al.add(new Employee("Shashi",1000000.00f));

		System.out.println(al);

		Collections.sort(al);

		System.out.println(al);
	}
}

/*
Drawback :

[{Rahul : 900000.0}, {Kanha : 100000.0}, {Badhe : 600000.0}, {Shashi : 1000000.0}]

Exception in thread "main" java.lang.ClassCastException: class Employee cannot be cast to class java.lang.Comparable (Employee is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
	at java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
	at java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
	at java.base/java.util.Arrays.sort(Arrays.java:1315)
	at java.base/java.util.Arrays.sort(Arrays.java:1509)
	at java.base/java.util.ArrayList.sort(ArrayList.java:1750)
	at java.base/java.util.Collections.sort(Collections.java:145)
	at DrawbackCollectionsDemo3.main(DrawbacksOf_Comparable_ClassDemo3.java:28)
*/
