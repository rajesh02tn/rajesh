package org.datatypes;

public class StringClass {

	public static void main(String[] args) {
		


	
				String s = "Hello world";
				String s1 ="hello world";
				         // 012345678910
				
				//length of the String
				
				int length = s.length();
				//ctrl +2 release and press L
				System.out.println(length);
				
				//to upper case
				String upperCase = s.toUpperCase();
				System.out.println(upperCase);
				
				//to lower case
				String lowerCase = s.toLowerCase();
				System.out.println(lowerCase);
				
				//equals
				boolean equals = s.equals(s1);
				System.out.println(equals);
				
				//equal ignore
				boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
				System.out.println(equalsIgnoreCase);
				
				//index of
				int indexOf = s.indexOf('l');
				System.out.println(indexOf);
				
				//last index of
				int lastIndexOf = s.lastIndexOf('l');
				System.out.println(lastIndexOf);
				
				//charAt
				char charAt = s.charAt(0);
				System.out.println(charAt);
				
				//contains
				boolean contains = s.contains("Hel");
				System.out.println(contains);
				
				//replace
				String replace = s.replace("Hello", "Hai");
				System.out.println(replace);
				
				//replaceall
				String replaceAll = s.replaceAll("l" , ".");
				System.out.println(replaceAll);
				
				//starts with
				boolean startsWith = s.startsWith("He");
				System.out.println(startsWith);
				//endswith
				boolean endsWith = s.endsWith("ld");
				System.out.println(endsWith);
				
				//isempty
				boolean empty = s.isEmpty();
				System.out.println(empty);
				
				//trim
				String trim = s.trim();
				System.out.println(trim);
				
				//substring
				String substring = s.substring(4);
				System.out.println(substring);
				
				//subsquence
				CharSequence subSequence = s.subSequence(3, 8);
				System.out.println(subSequence);
				
				//substring2
				String substring2 = s.substring(3, 8);
				System.out.println(substring2);
				
				//compareto
				//it will compare the ascii value of the 2 strings and gives you the ascii differents  between the 2 string
				int compareTo = s.compareTo(s1);
				System.out.println(compareTo);
				
				
			}
			
			




	}


