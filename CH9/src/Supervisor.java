
 class Supervisor extends Employee{
	
	public double bonus_amount;
	public double new_total;
	public Supervisor(double bonusAmount,String employeeName, double currentSalary) {
		
		super(employeeName,currentSalary);
		this.bonus_amount=bonus_amount;
		}
		public double raiseSalary(){
			 new_total= getSalary() + (getSalary() *bonus_amount/100);
			return new_total;
		}
	
	}


