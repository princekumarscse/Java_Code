package Java8Practice;
/**
*Q1 Fetch all employee names
*Q2 Fetch distinct company names
*Q3 Fetch the employee who has highest salary 
*Q4 Fetch all those  employee working for TCS 
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java17.Calculator;

public class EmployeeTest {
public static void main(String[] args) {
	List<Employee> list=DataBase.getEmployees();
	Stream<Employee> stream =list.stream();
	
	for(Employee  e:list) {
		System.out.println(e.getEid()+" "+e.getName()+"   "+e.getBornDate()+"   "+e.getSex()+"   "+e.getMaritalStatus()+"   "+e.getHireDate()+"    "+e.getDepartment()+"   "+e.getJobTitle()+"   "+e.getCtc()+"   "+e.getWorkLocation());
	}
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
	//System.out.println();
	
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
	
	
	//if Experience has more than 5 years then promoted as senior and increment ctc 45%
	//If experience is more than 5 years then promotion will be given to senior post and salary hike will be 45%
	

}
}
