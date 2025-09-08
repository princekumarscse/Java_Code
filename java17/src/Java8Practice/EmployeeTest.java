package Java8Practice;
import java.text.Collator;
/** 
*Q1 Fetch all employee names
*Q2 Fetch distinct company names
*Q3 Fetch the employee who has highest salary 
*Q4 Fetch all those  employee working for TCS 
 */ 
import java.time.LocalDate;
import java.time.Month; 
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Map; 
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java17.Calculator;

public class EmployeeTest {
public static void main(String[] args) {
	List<Employee> list=DataBase.getEmployees();
	Stream<Employee> stream =list.stream();
	
//	for(Employee  e:list) {
//		System.out.println(e.getEid()+" "+e.getName()+"   "+e.getBornDate()+"   "+e.getSex()+"   "+e.getMaritalStatus()+"   "+e.getHireDate()+"    "+e.getDepartment()+"   "+e.getJobTitle()+"   "+e.getCtc()+"   "+e.getWorkLocation());
//	}
	// Fetch all employee names
	//list.stream().map(f->f.getName()).collect(Collectors.toList()).forEach(System.out::println);
	
	// Fetch all employee Department
	//list.stream().map(f->f.getDepartment()).collect(Collectors.toList()).forEach(System.out::println);
	
	// Fetch all employee distinct Department
	//list.stream().map(f->f.getDepartment()).distinct().collect(Collectors.toList()).forEach(System.out::println);
	
	// Fetch distinct jobTitle
	//list.stream().map(f->f.getJobTitle()).distinct().collect(Collectors.toList()).forEach(System.out::println);
	
	// Fetch all employee  sorted name with Department
	//list.stream().map(f->f.getName()+" ->"+f.getDepartment()).sorted().collect(Collectors.toList()).forEach(System.out::println);
	
	// Fetch all employee  female with single
	//list.stream().filter(f->"Female".equalsIgnoreCase(f.getSex()) &&  "Single".equalsIgnoreCase(f.getMaritalStatus())).forEach(f->System.out.println(f.getName()+"   "+f.getMaritalStatus()));
	
	//calculate experience of all employee
	//int experience = Period.between(joiningDate, LocalDate.now()).getYears();
	//list.stream().map(f->f.getName()+" has "+(Period.between(f.getHireDate(), LocalDate.now()).getYears()) +" yeaers of experience. ").forEach(System.out::println);
	//System.out.println("------------");
	//list.stream().map(f->f.getName()+" has "+ LocalDate.now().minusYears(f.getHireDate().getYear()).getYear() +" yeaers of experience. ").forEach(System.out::println);
	//list.stream().map(f->f.getName()+" has "+ LocalDate.now().minusYears(f.getHireDate().getYear()).getYear() +" yeaers of experience. ").forEach(System.out::println);

	
	//calculate age
/**	LocalDate.now()  Get current date.
    *LocalDateTime.now()  Get current date & time.
	 *ZonedDateTime.now(ZoneId.of("Asia/Kolkata"))  Get time in a specific time zone.
	*Period.between(date1, date2)  Calculate difference between two dates.
	 *plusDays(), minusMonths(), plusYears()  Add or subtract from a date.
	 *DateTimeFormatter.ofPattern("dd-MM-yyyy")  Format dates.
	 *LocalDate.parse(string, formatter)  Convert string to date.
**/
	//LocalDate currentDate =LocalDate.now();
	//System.out.println(currentDate);
//	LocalDate dob = LocalDate.of(2000, 03, 22);
//	LocalDate now = LocalDate.now();
//	LocalDate age = now.minusYears(dob.getYear());
//	System.out.println(age.getYear());
	//list.stream().map(f->f.getName()+" has "+Period.between(f.getBornDate(), LocalDate.now()).getYears()+" yeaers . ").forEach(System.out::println);

	
	//if Experience has more than 5 years then promoted as senior and increment ctc 45%
	//If experience is more than 5 years then promotion will be given to senior post and salary hike will be 45%
	
//	list.stream().map(f->f.getName()+" " + Period.between(f.getHireDate(), LocalDate.now()).getYears()  ).forEach(System.out::println);
//	list.stream().filter(f->Period.between(f.getHireDate(), LocalDate.now()).getYears() >5 ).forEach(System.out::println);
	
//	list.stream().map(f->f.getName()+" "+Period.between(f.getHireDate(), LocalDate.now()).getYears() )
//	.filter(f->Period.between(f.getHireDate(), LocalDate.now()).getYears() >=5 ).forEach(System.out::println);

//	list.stream()
//    .map(f -> Period.between(f.getHireDate(), LocalDate.now()).getYears()) // Extract experience in years
//    .filter(f -> f > 5) // Filter experiences greater than 5
//    .forEach(System.out::println); // Print only the experience years

	list.stream()
    .filter(f -> Period.between(f.getHireDate(), LocalDate.now()).getYears() > 5) // Filter employees with >5 years experience
    .forEach(f -> { 
        f.setJobTitle("Senior " + f.getJobTitle()); // Update job title with "Senior"
        f.setCtc((int) (f.getCtc() * 1.45)); // Increase salary by 45%
    });

list.forEach(e->System.out.println(e.getEid()+"-- "+e.getName()+" ->  "+e.getBornDate()+" ->  "+e.getSex()+" ->  "+e.getMaritalStatus()+"  -> "+e.getHireDate()+"  ->  "+e.getDepartment()+"  -> "+e.getJobTitle()+"   ->"+e.getCtc()+"->   "+e.getWorkLocation() )); // Print updated employee details


	/**
	 * Which employees are working in the IT department as Java Developers, and in which cities are they located?
	 * Who is the highest-paid employee, and what is their designation?
	 * How many employees are single and working in the Marketing department?
	 * Which city has the highest number of employees, and how many are there?
	 * Who is the most experienced employee in the company based on their date of joining?
	 */

	/** Kartik
	 * Retrieve Employee name andÂ birth.
	 * Filter the employee name and birth only it department
	 * Check the duplicate name
	 * Count the employees by martialÂ status
	 * Find the employees who has join beforeÂ 2010 
	 */
	//Retrieve Employee name andÂ birth.
	//list.stream().map(f->f.getName()+" ->"+f.getBornDate()).collect(Collectors.toList()).forEach(System.out::println);

	 // Filter the employee name and birth only it department
//	list.stream().filter(f -> "IT".equalsIgnoreCase(f.getDepartment())) // Filter IT employees
//    .map(emp -> emp.getName() + "  " + emp.getBornDate().getYear()) // Format output
//    .forEach(System.out::println);
	
	//Check the duplicate name
//		Set<String> name1= new HashSet<>();
//	    Set<String> name2 = new HashSet<>();
//	
//	    // Find duplicate names
//	    for (Employee emp : list) {
//	        if (!name1.add(emp.getName())) { // If name already exists, it's a duplicate
//	            name2.add(emp.getName());
//	        }
//	    }
//	
//	    // Print duplicate names
//	    if (name2.isEmpty()) {
//	        System.out.println("No duplicate names found.");
//	    } else {
//	        System.out.println("Duplicate Names: " + name2);
//	    }
	// Count the employees by martialÂ status
//	Map<String, Long> countByMaritalStatus =list.stream()
//            .collect(Collectors.groupingBy(Employee::getMaritalStatus, Collectors.counting()));
//
//        // Print results
//        countByMaritalStatus.forEach((status, count) -> 
//            System.out.println(status + ": " + count + " employees"));
//<<<<<<< HEAD
//	
//	//Find the employees who has join beforeÂ 2010
//========
////	
//	//Find the employees who has join before 2010
//>>>>>>> 2528ffb (15/03/2025)
	//list.stream().filter(f->f.getHireDate().getYear() < 2010).map(Employee::getName ).forEach(System.out::println);

	
	/** Twinkle
	 * 1.Print name and birthday of emp whose birth date is 15 July 1998
	 * 2.Give name and I'd of emp who are married 
	 * 3.List out name of female employees born before 2000
	 * 4.Associate name of male employee with their job title 

	 * 5.Give count ofÂ totalÂ noÂ ofÂ emp
	 */
	//Give count ofÂ totalÂ noÂ ofÂ emp
//	long total =list.stream().count();
//	System.out.println("Total Number of Employee is:"+total);
	
	//Associate name of male employee with their job title 
	//list.stream().filter(f->"male".equalsIgnoreCase(f.getSex())).map(e->e.getName()+"--> "+e.getJobTitle()).collect(Collectors.toList()).forEach(System.out::println);
	
	//List out name of female employees born before 2000
//	list.stream().filter(f -> "Female".equalsIgnoreCase(f.getSex()) && f.getBornDate().getYear() > 2000) // Filter female employees born after 2000
//    .map(Employee::getName) // Extract only the names
//    .forEach(System.out::println); // Print each name
	
	//Give name and I'd of emp who are married

	//list.stream().filter(f->"married".equalsIgnoreCase(f.getMaritalStatus()) ).forEach(f->System.out.println(f.getName()+"   "+f.getEid() ));

	//Print name and birthday of emp whose birth date is 15 July 1998
//	list.stream()
//    .filter(f -> f.getBornDate().equals(LocalDate.of(1998, Month.JULY, 15))) // Filter employees born on 15 July 1998
//    .forEach(f->System.out.println(f.getName()+"   "+f.getBornDate() )); // Print matching employees

}
}
