package ua.learn.java;

public class java_loops {
	
	public static void main(String[] args){
		System.out.println("while loop");
		int counter = 0;
		while (counter < 10) {
			System.out.println(counter);
			counter++;
		}
		
		System.out.println("for loop");
		
		for(int count=1;count<10;count++){
			System.out.println(count);
		}
		
		System.out.println("do loop");
		int coun = 0;
		do{
			System.out.println(coun);
			coun++;
		}while (coun <= 10);
		
	}

}
