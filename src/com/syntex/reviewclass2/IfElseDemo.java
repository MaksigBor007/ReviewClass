package com.syntex.reviewclass2;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("Please enter your Account balance");
		double accountBalance=scanner.nextDouble();
		
		System.out.println("Please enter the amount that you want to lend to your friend");
		double amountToLend=scanner.nextDouble();
		
		
		if(accountBalance>=amountToLend) {
			
			System.out.println("Yes I can help you");
		} else {
			
			System.out.println("Sorry I dont have enough money ");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
