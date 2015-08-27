package ua.learn.java;

public class java_arrey_loop {

	public static void main(String[] args) {

		int total = 0;
		int arr[] = {12,4,52,56,77,28,93,12,7,43};
		
		for (int x:arr) {
			total+=x;
		}
		
		System.out.println(total);
	}

}
