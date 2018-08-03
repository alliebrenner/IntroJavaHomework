package ch11;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;;

public class Ch11Question {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter amount of cash at the beginning of the day");
		double doubleStart = input.nextDouble();
		
		input = new Scanner(System.in);
		System.out.println("Please enter the expected amount of cash at the end of the day.");
		double doubleEnd = input.nextDouble();
		input= new Scanner(System.in);
		System.out.println("Please enter the name of the transaction file");
		String fileName = input.next();
		try{
			Scanner file = new Scanner(new File(fileName));
			while (file.hasNextLine()){
				file.next();
				double doubleAmount = file.nextDouble();
				String strType= file.next();
				if(strType.trim().equals("P"))
					doubleStart=doubleStart-doubleAmount;
				if(strType.trim().equals("R"))
					doubleStart=doubleStart+doubleAmount;
			}
		}
		catch(FileNotFoundException ex){
			System.out.println("File not found");
		}
		if( doubleStart==doubleEnd)
			System.out.println("The closing amount is equal to the expected amount");
		else
			System.out.println("The closing amount is not equal to the expected amount of cash");
	}

}
