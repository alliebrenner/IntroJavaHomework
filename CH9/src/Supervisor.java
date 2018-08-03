
 class Supervisor extends Employee{
	
	private double bonus_amount;
	public Supervisor(String employeeName, double currentSalary) {
		
		super(employeeName,currentSalary);
		bonus_amount=0;			
		}
	
		public double getSalary(){
			double starting_salary = super.getSalary();
			return starting_salary +bonus_amount;
		}
		public void raiseSalary(double bonus ){
			bonus_amount = bonus;
		
		}
	
	}