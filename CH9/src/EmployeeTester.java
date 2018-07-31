
public class EmployeeTester {
	public static void main(String[]args){
		Employee harry= new Employee("Harry", 50000);
		System.out.println("Employee Name: "+harry.getName());
		System.out.println("Employee Salary: "+harry.getSalary());
		System.out.println("New Salary With Bonus: "+harry.raiseSalary());

		
	}
}
