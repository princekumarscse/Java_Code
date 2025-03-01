package string;
/**
 * Q1. String is an immutable class, why ? 
 * Q2. What do you mean by immutable ?
 * Ans ): Once you initialize the state of an object , 
 * you can not modify or change it's state
 * 
 * Q3. What is a string constant pool "SCP" ?
 * Q4. Difference b/w String, StringBuilder and StringBuffer ?
 * Ans-> Performance :StringBuilder > String > StringBuffer
 * 		 Security: String and StringBuffer both are thread safe but stringBuilder is not thread safe.
 * 		 mutability : String is immutable but StringBuffer and StringBuilder are mutable
 * 
 * Q5. Reverse the word of given sentence EX.{ My name is Prince } 
 * output { Prince is name My}
 * Q6. Reverse the letter Ex.{Prince} output {ecnirP}
 * Q7. Swap the content of the given strings without using third variable.
 * Ex.{String s1="Prince";
 * 	   String s2= "Kumar";
 * Q8. Anagram
 * Q9
 * 
 */
public class StringDemo {
	public static void main(String[] args) {
		
		String str="My name is Prince";
		String s1="";
		
		String[] words = str.split(" ");
		for(int i=words.length-1 ; i>=0; i-- ) {
			//System.out.print(words[i] + " ");
			s1= s1+ words[i]+ " " ;
		}
		 s1 = s1.trim();
		System.out.println(s1);
		System.out.println(str.length()  + " " + s1.length());
		
		System.out.println("Approch 2");
		String s2="";
		int j=0;
		
		for(int i=0; i < str.length(); i++) {
			
			if( str.charAt(i) == ' ') {
				s2=s2 + str.substring(j, i);
				//System.out.println(str.substring(j, i));
				j=i;
			}
			
			
		}
		
		System.out.println(s2+str.substring(j));
		}

	
	
}
