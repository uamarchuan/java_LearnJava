package ua.learn.java;

import java.util.Random;

public class java_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int number;
		int min = 5;
		int max = 15;
		
		for (int counter = 1; counter <= 10; counter++){
			number = ran.nextInt(max-min)+min;
			System.out.print(number+" ");
		}
	}

}
