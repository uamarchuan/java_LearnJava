package ua.learn.java;

import java.util.Scanner;

public class java_methods1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		java_methods2 mObject = new java_methods2("Oksana");
		
		System.out.println("Enter name of first gf here: ");
		String name = scan.nextLine();
		
		mObject.setGirlName(name);
		mObject.saing();
	}

}
