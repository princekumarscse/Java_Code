package Array;

public class Student {
	int rollNumber ;
	String name;
	String college;
	public Student(int rollNumber, String name, String college) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.college = college;
	}
	@Override
	public String toString() {
		return " [" + rollNumber + ", " + name + ", " + college + "]";
       // return getClass().getName() + "@" + 123;
	}
	
	
	
	

}
