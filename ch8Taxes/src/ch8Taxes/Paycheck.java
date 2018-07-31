package ch8Taxes;

public class Paycheck {
	private String studentName;
	private double hourlyWage;
	private int numHours;
	private static final double RATE1 =0.10;
	private static final double RATE2 = 0.25;
	private static final double RATE1_SINGLE_LIMIT =32000;
	private static final double SS_TAX_RATE =0.062;
	
	public Paycheck(){
		studentName = "";
		hourlyWage =0;
		numHours=0;
	}
	public Paycheck(String name,double wage,int hours){
		studentName = name;
		hourlyWage = wage;
		numHours = hours;
	}
	public double getIncome(){
		return hourlyWage*numHours;
	}
	public String getName(){
		return studentName;
	}
	public double getWage(){
		return hourlyWage;
	}
	public int getHours(){
		return numHours;
	}
	public double getFederalIncomeTax(){
		double tax1=0;
		double tax2=0;
		if (getIncome()<RATE1_SINGLE_LIMIT){
			tax1=RATE1*getIncome();
		} 
		else{
			tax1= RATE1*RATE1_SINGLE_LIMIT;
			tax2=RATE2*(getIncome()-RATE1_SINGLE_LIMIT);
		}
		return tax1+tax2;
	}
	public double getSSTax(){
		double ssTax=0;
		ssTax=(getIncome()-getFederalIncomeTax())*SS_TAX_RATE;
		return ssTax;
		}
	public double payCheck(){
		double netIncome =0;
		netIncome = getIncome()-getFederalIncomeTax()-getSSTax();
		return netIncome;
	}
	public String toString(){
		return getName()+"\t"+getWage()+"\t"+getHours()+"\t"+payCheck();
	
	}
}
