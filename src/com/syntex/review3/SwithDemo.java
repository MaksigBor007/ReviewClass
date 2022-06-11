package com.syntex.review3;

public class SwithDemo {

	public static void main(String[] args) {
		String country="Turkey";
		String capital;
		switch(country){
		case "Turkey":
			capital="Ankara";
			break;
		case"USA":
			capital="DC";
			break;
		case "Serbia":
			capital="Belgrade";
			break;
		case "Albania":
			capital="Tirana";
			break;
		case "Pakistan":
			capital="Islamabad";
			break;
			default:
				capital="Not a valid country";
				break;
				} System.out.println(capital);

	}

}
