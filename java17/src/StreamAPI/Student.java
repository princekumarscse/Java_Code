package StreamAPI;

public class Student {
private int id;
private String name;
private String branch;
private String college;
private double CGPA;
public Student(int id, String name, String branch, String college, double cGPA) {
	super();
	this.id = id;
	this.name = name;
	this.branch = branch;
	this.college = college;
	CGPA = cGPA;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getBranch() {
	return branch;
}
public String getCollege() {
	return college;
}
public double getCGPA() {
	return CGPA;
}
public Object getCompany() {
	// TODO Auto-generated method stub
	return null;
}


}
