package com.syntax.class05;


import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo3 {

	public static void main(String[] args) {
		

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		
		int size=scanner.nextInt();// ask for the size of array
		String[]names=new String[size];// an array of String of that size is created
		for (int i=0; i<names.length;i++) {
			
			names[i]=scanner.next();//fill the array with the input from user
			
		}
		System.out.println(Arrays.toString(names));// print out contents of array
		
		
}

}
