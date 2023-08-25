
import java.util.*;
class Employee{
	String empName = null;
	int empId = 0;

	Employee(String empName,int empId){
		this.empName = empName;
		this.empId = empId;
	}
	
	public String toString(){
		return empName + " : " +empId;
	}
}

/*
class SortByName implements Comparator{
	public int compare(Object obj1,Object obj2){
		return ((Employee)obj1).empName.compareTo(((Employee)obj2).empName);
	}
}

class SortById implements Comparator{
        public int compare(Object obj1,Object obj2){
                return ((((Employee)obj1).empId) - (((Employee)obj2).empId));
        }
}
*/


class UsingLambdaInComparator2{
	public static void main(String[] args){
		ArrayList al = new ArrayList();

		al.add(new Employee("Shashi",11));
		al.add(new Employee("Ashish",22));
		al.add(new Employee("Kanha",43));

		System.out.println(al);

		Collections.sort(al,(obj1,obj2) -> {

				return ((Employee)obj1).empName.compareTo(((Employee)obj2).empName);	

			}
		);
		System.out.println(al);

		Collections.sort(al,(obj1,obj2) -> {
			
				return ((((Employee)obj1).empId) - (((Employee)obj2).empId));

			}	
		);
		System.out.println(al);
	}
}

