
public class Employee {

private String employee_name;
private double employee_salary;
//private double percentIncrease;

public Employee(String employeeName, double currentSalary){
	employee_name=employeeName;
	employee_salary=currentSalary;
}
public String getName(){
	return employee_name;
}
public double getSalary(){
	return employee_salary;
}
public void raiseSalary(double byPercent)
{
	double raise = employee_salary * byPercent / 100;
 employee_salary += raise;}

 }


