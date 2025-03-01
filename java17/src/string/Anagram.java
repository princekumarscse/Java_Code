package string;
import java.util.Arrays;


public class Anagram {
	public static boolean checker(String s1, String s2) {
		
		char[] ch1=s1.toCharArray();
		char[] ch2= s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
		
		
		
	}
	public static void main(String[] args) {
		
		String str1="listen";
		String str2="silent";
		
		if(checker(str1,str2))
		{
			System.out.println("true");
			
		}
		else {
			System.out.println("false");
		}
		
		
		
	}

}
