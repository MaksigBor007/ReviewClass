package com.syntax.class05;

public class ArrayDemo {

	public static void main(String[] args) {
		//should create an array
		String name="Maksym";
		String name2 ="Kirill";
		String name3="Mumtaz";
		
		
		//should not create an array
		
		String city ="New york";
		String country="USA";
		String continent="America";
		
		String[] names= {"Maksym","Kirill","Mumtaz"};// we use this approach 5% of the time
		
		String[] names2=new String[3];// we use this approach 95% of the time
		names[0]="Maksym";
		names[1]="Kirill";		
		names[2]="Mumtaz";
		
		
		
		
		
		
		

	}

}
