package taxes;
import java.util.Scanner;

public class computeTaxes {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter your income:");
	double income = in.nextDouble();
	System.out.println("Enter your marital status ");
	System.out.println("1 for 'single' and 2 for 'married':");
	int status = in.nextInt();
	double income_tax = 0;
	if (status == 1){
		if (income <=8000){
			income_tax = (10*income)/100;
		}
		else if(income>8000 &&income <=3200){
			income_tax = 800+(15*(income-8000))/100;
		}
		else{
			income_tax = 4400+(25*(income - 32000))/100;
		}
	}
	else if(status ==2){
		if (income<=16000){
			income_tax =(10*income)/100;
		}
		else if (income >16000 && income <=64000){
			income_tax = 1600+(15*(income -16000))/100;
		}
	}
	else
		System.out.println("invalid choice");
		System.out.println("Your income tax amount: " +income_tax);
	}

}
