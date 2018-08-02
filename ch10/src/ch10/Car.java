package ch10;

import ch10.Chapter10Example.Calculate;

public class Car implements Calculate{
	private String carType;
	private double price;
	
	public Car(String aCarType, double aPrice) {
		carType=aCarType;
		price = aPrice;
	}
	public String getCarType(){
		return carType;
	}
	
	public double getData() {
		return price;
	}

}
