package string;
/**
 * Q7. Swap the content of the given strings without using third variable.
 * Ex.{String s1="Prince";
 * 	   String s2= "Kumar";
 */
public class StringSwaping {
	public static void main(String[] args) {
		
		String s1= "Prince";
		String s2= "Kumar";
//		String temp =s1;
//		s1=s2;
//		s2=temp;
//		System.out.println(s1 + " " + s2);		
		s1=s1 +s2;
		
		s2=s1.substring(0,s1.length()- s2.length());
		s1= s1.substring(s2.length());
		
		System.out.println(s1 +" "+ s2 );
		
		
		
	}

}
