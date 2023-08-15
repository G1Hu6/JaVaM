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

class SortByName implements Comparator<Employee>{
	public int compare(Employee emp1,Employee emp2){
		return (emp1.empName).compareTo(emp2.empName);
	}
}
class ComparatorDemo4{
        public static void main(String[] args){
                ArrayList<Employee> al = new ArrayList<Employee>();

                al.add(new Employee("Rahul",900000.00f));
                al.add(new Employee("Kanha",100000.00f));
                al.add(new Employee("Badhe",600000.00f));
                al.add(new Employee("Shashi",1000000.00f));

                System.out.println(al);

                Collections.sort(al, new SortByName());

                System.out.println(al);
        }
}

