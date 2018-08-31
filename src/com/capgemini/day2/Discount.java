package com.capgemini.day2;

public class Discount {

	public static double calculateDiscount(double newItem, double discount) {
		//double newitem=100 ;
		//double discount ;
		double newItemPrice ;
		discount=discount*newItem ;
		newItemPrice=newItem-discount ;
		return newItemPrice ;
	}

}
