class Employee1{
	int empId=10;
	String name="Raj";
	static int salery=5000;

	void empInfo(){
		System.out.println("ID ="+empId);
		System.out.println("Name ="+name);
		System.out.println("Salary ="+salery);
	}
}
class MainDemo1{
	public static void main(String[] args){
		Employee1 emp1=new Employee1();
		Employee1 emp2=new Employee1();

		//System.out.println(emp1.empId);
                //System.out.println(emp1.name);
		
		emp1.empInfo();
		emp2.empInfo();

		//change in one object data can not affect another

		emp2.empId=20;
		emp2.name="Suraj";
		emp2.salery=900000;

		emp1.empInfo();
                emp2.empInfo();
	}
}
