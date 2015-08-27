package ua.learn.java;

public class java_arrey_simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Index\tValue");
		int bucky[] = {35,15,64,81,24,99,01,84};
		int sum = 0;
		
		for (int i=0; i<bucky.length;i++) {
			System.out.println(i+"\t"+bucky[i]);
			sum+=bucky[i];
			
			if(i+1==bucky.length){
				System.out.println("Summ of all Values is: "+sum);
			}
		}
			
	}

}
