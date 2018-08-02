
public class Employee {

private String employee_name;
private double employee_salary;
private double percentIncrease;

public Employee(String employeeName, double currentSalary){
	employee_name=employeeName;
	employee_salary=currentSalary;k
}
public String getName(){
	return employee_name;
}
public double getSalary(){
	employee_salary = employee_salary + (employee_salary *percentIncrease/100);
	System.out.println("Percent Increase "+ percentIncrease+ "%");
	return employee_salary;
}
}



