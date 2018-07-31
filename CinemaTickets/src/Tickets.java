import java.util.Scanner;
public class Tickets {

	public static void main(String[] args) {
		int buyerCount =1;
		int numTickets = 0;
		int remainingTickets=100;
		
		Scanner input;
		
		System.out.println("Please enter the number of tickets you'd like to buy. (Max 4 tickets)");
		while (remainingTickets>0){
			System.out.println("Tickets left: "+ remainingTickets);
			System.out.println("Buyer "+buyerCount+":");
		
			while ((numTickets==0)||(numTickets>remainingTickets)||(numTickets>4)){
				input = new Scanner(System.in);
				numTickets = input.nextInt();
				if((numTickets==0)||(numTickets>remainingTickets)||(numTickets>4))
					System.out.println("Invalid input. Number of tickets must be greater than 0, and less than 4, and less than the number of remaining tickets");}
					remainingTickets =remainingTickets -numTickets;
					numTickets = 0;
					buyerCount++;
			}
		System.out.println("Total Number of Buyers: "+ (buyerCount-1));
		}
	}


