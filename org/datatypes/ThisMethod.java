package org.datatypes;

public class ThisMethod {
	String empname = "raj";
	int empid = 12345;
	
	
	ThisMethod(String empname , int empid ){
		this.empname = empname ;
		this.empid  = empid ;
	}
   
	public void display() {
		System.out.println(empname + "," + empid);
	}
	
	public static void main(String[] args) {
		ThisMethod method = new ThisMethod("rajesh",54321);
		
		method.display();
}
}