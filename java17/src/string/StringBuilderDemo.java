package string;
// String and stringBuilder 
public class StringBuilderDemo {
	public static void main(String[] args) {
		
		String s1= "Prince";
		String s2 =new String("Prince");
		System.out.println(s1==s2);// it will compare address
		System.out.println(s1.equals(s2)); // it will compare content
		System.out.println(s1.hashCode()+" " + s2.hashCode());
		System.out.println("StringBuilder  Demo " );
		
		StringBuilder sb=new StringBuilder("Prince");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}

}
