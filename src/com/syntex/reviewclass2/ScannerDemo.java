package com.syntex.reviewclass2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("please enter your name");
		String name=scanner.next();//user enters the number and hits the enter key
		
		
		scanner.nextLine();//consumes the enter that user press after the number
				
		
		System.out.println("please enter your age");
		int age=scanner.nextInt();
		
		System.out.println(name+age);

	}

}
