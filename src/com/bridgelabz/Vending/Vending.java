package com.bridgelabz.Vending;

import java.util.Scanner;

public class Vending {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final int Pennies_Per_Doller = 100;
		final int Pennies_Per_Quarter = 25;
		
		//User Promotion
		System.out.println("Enter bill value(1,2,5,10,50,100,500,1000) :" );
		int billvalue = in.nextInt();
		System.out.println("Enter item price (in pennies): ");
		int itemprice = in.nextInt();
		
		//Calculate Change
		int change = Pennies_Per_Doller * billvalue - itemprice;
		int dollers = change / Pennies_Per_Doller;
		change = change % Pennies_Per_Doller;
		
		int quarters = change / Pennies_Per_Quarter;
		
		//Print Change
		System.out.printf("Dollers: %d", dollers);
		System.out.println();
		System.out.printf("Quarters: %d", quarters);
	}
}
