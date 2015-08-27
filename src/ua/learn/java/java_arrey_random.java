package ua.learn.java;

import java.util.Random;

public class java_arrey_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int freq[] = new int[7];
		
		for (int roll=1;roll<1000;roll++) {
			++freq[1+rand.nextInt(6)];
		}
		
		System.out.println("Face\tFrequency");
		for(int face=1;face<freq.length;face++){
			System.out.println(face+"\t"+freq[face]);
		}
					
	}

}
