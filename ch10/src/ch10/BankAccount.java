package ch10;

import ch10.Chapter10Example.Calculate;

public class BankAccount implements  Calculate
{  
   private double balance;

   public BankAccount()
   {   
      balance = 0;
   }

   public BankAccount(double initialBalance)
   {   
      balance = initialBalance;
   }

   public void deposit(double amount)
   {  
      balance = balance + amount;
   }

   public void withdraw(double amount)
   {   
      balance = balance - amount;
   }

   public double getData()
   {
      return balance;
   }
}

