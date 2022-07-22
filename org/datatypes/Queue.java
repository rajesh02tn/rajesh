package org.datatypes;

public class Queue {

	public static void main(String[] args) {
	
		String i = "madam";
		String r = " ";
		
		for (int j = i.length()-1; j >=0; j--) {
			
			 r = r + i.charAt(j);
			
		}
		
		System.out.println(r);

	
	
	
	int num = 141;
	
	
	
	int c =0 ; int b = 0; int a = num;
	
	
	
	while(a>0) {
		
		c = a%10;
		b = (b*10)+c;
		a = a/10;
		
		
	}
	
       System.out.println(b);
	
	
	}
}
