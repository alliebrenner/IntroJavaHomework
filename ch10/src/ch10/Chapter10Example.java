package ch10;



public class Chapter10Example

{
	public interface Calculate
	{
	   double getData();
	   //double save();
	}
   public static void main(String[] args)
   {
      Calculate[] accounts = new Calculate[2];
      accounts[0] = new BankAccount(0);
      accounts[1] = new BankAccount(10);

      System.out.println("Sum Balance: " + sum(accounts));
      System.out.println("Total Accounts: " + num(accounts));
      System.out.println("Average Balance: " + average(accounts));

      System.out.println();
      Calculate[] countries = new Calculate[2];
      countries[0] = new Country("Uruguay", 10);
      countries[1] = new Country("Thailand", 20);

      System.out.println("Sum Area: " + sum(countries));
      System.out.println("Total Countries: " + num(countries));
      System.out.println("Average Area: " + average(countries));
      
      System.out.println();
      Calculate[] cars = new Calculate[2];
      cars[0] = new Car("BMW", 100);
      cars[1] = new Car("Mercedes", 200);

      System.out.println("Sum Cars: " + sum(cars));
      System.out.println("Total Cars: " + num(cars));
      System.out.println("Average Cars: " + average(cars));
      
   }
   

   public static double sum(Calculate[] objects)
   {
      double sum = 0;
      for (int i = 0; i < objects.length; i++)
      {
         sum = sum + objects[i].getData();
      }
      return sum;
   }

   public static double num(Calculate[] objects)
   {
      return objects.length;
   }
   
   public static double average(Calculate[] objects)
   {
    return sum(objects) / num(objects);   
    }
   
  
}


