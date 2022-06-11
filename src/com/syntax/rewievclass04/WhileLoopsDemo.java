package com.syntax.rewievclass04;

import java.util.Scanner;

public class WhileLoopsDemo {

public static void main(String[] args) {
		
Scanner scan=new Scanner (System.in);
int x=0;
while (x!=10) {
	System.out.println("Enter a number");
	x =scan.nextInt();
	System.out.println(x+2);
	}

scan.close();
	

		
}	
}

