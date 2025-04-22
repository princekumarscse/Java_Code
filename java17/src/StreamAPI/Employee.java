package StreamAPI;
//1.sort employee by their salary if salary matches then sort by  names
//using Comparator technique and streamAPI
//Q Fetch all employee names
//Q Fetch distinct company names
//Q Fetch the employee who has highest salary 
//Q Fetch all those  employee working for TCS 



public class Employee {
private int id;
private String name;
private String company;
private int salary;
public Employee() { 
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, String company, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.company = company;
	this.salary = salary;
}
public int getId() {
	return id;
}
public String getName() { 
	return name;
}
public String getCompany() {
	return company;
}
public int getSalary() {
	return salary;
}





}
