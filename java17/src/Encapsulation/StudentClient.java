package Encapsulation;

public class StudentClient {
	public static void main(String[] args) {
		Student  std= new Student();
		std.setRollNumber(14);
		System.out.println(std.getRollNumber());
		System.out.println(std.getAge());
		System.out.println(std.getName());

		   
	}

}
