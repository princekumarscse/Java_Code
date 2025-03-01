package string;

public class StringEx {

	public static void main(String[] args) {

		String str = "Prince";
		StringBuilder sb= new StringBuilder(str);
		System.out.println(sb.reverse());
		int n = str.length();
		String word="";

		for (int i = n - 1; i >=0; i--) {
			word=word+str.charAt(i);
			//System.out.print(str.charAt(i));

		}
		System.out.println(word);
		

	}

}
