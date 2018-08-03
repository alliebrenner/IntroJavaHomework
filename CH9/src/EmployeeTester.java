
public class EmployeeTester {
	public static void main(String[]args){
		
		Supervisor test = new Supervisor("New Supervisor",5000);
		test.raiseSalary(800);
		
		Employee [] staff = new Employee[3];
		staff[0]=test;
		staff[1]=new Employee("Harry",7000);
		staff[2]=new Employee("Mary",1000);
		
		for (Employee emp :staff)
			System.out.println("name= " + emp.getName() +",salary= " + emp.getSalary());
		
		
	}
}



