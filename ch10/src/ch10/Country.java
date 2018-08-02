package ch10;

import ch10.Chapter10Example.Calculate;

public class Country implements Calculate
{
   private String name;
   private double area;

   public Country(String aName, double anArea) 
   { 
      name = aName;
      area = anArea; 
   }

   public String getName() 
   {
      return name;
   }

   public double getData() 
   {
      return area;
   }
}