package com.syntax.class05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
	
		String[]names=new String[5];//create an empty array of size 5 to store String type value
		Scanner zameer=new Scanner(System.in);
		names[0]=zameer.next();
		names[1]=zameer.next();
		names[2]=zameer.next();
		names[3]=zameer.next();
		names[4]=zameer.next();
		System.out.println(Arrays.toString(names));
		
		
		
		
		

	}

}
