package ua.learn.java;

public class java_methods2 {
	private String girlName;
	
	public java_methods2 (String girlName) {
		this.girlName = girlName;
	}

	public String getGirlName() {
		return girlName;
	}
 
	public void setGirlName(String girlName) {
		this.girlName = girlName;
	}
	
	public void saing() {
		System.out.printf("Your first gf was: %s\n", getGirlName());
	}

}
