package StreamAPI;
//1.sort employee by their salary if salary matches then sort by  names
//using Comparator technique and streamAPI
//Q Fetch all employee names
//Q Fetch distinct company names
//Q Fetch the employee who has highest salary 
//Q Fetch all those  employee working for TCS 
 
import java.util.Comparator;
import java.util.List; 
import java.util.function.Function;
import java.util.function.Predicate; 
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeTest {
	public static void main(String[] args) {
		List<Employee> list=DataBase.getEmployeeData();
		//to convert list to stream
		Stream<Employee> stream= list.stream();
		Predicate<Employee> test= (t)->{

			return "TCS".equalsIgnoreCase(t.getCompany());
			
			};
			Predicate<Employee> test1= t->"TCS".equalsIgnoreCase(t.getCompany());


			Stream<Employee> filter = stream.filter(test1);
		    //<R, A> R collect(Collector<? super T, A, R> collector);
			// Collector<T, ?, List<T>> toList() {
			List<Employee> collect = filter.collect(Collectors.toList());
			
		//Q Fetch all those  employee working for TCS 
		//list.stream().filter(t->"TCS".equalsIgnoreCase(t.getCompany())).collect(Collectors.toList()).forEach(s->System.out.println(s.getId()+" "+s.getName()+" "+s.getCompany()+" "+s.getSalary()));
		
		//Q Fetch the employee who has highest salary 
			Comparator<Employee> maxSalary=(s1,s2)->{
				return Integer.max(s1.getSalary(),s2.getSalary());
			};
			list.stream().sorted(maxSalary).distinct().collect(Collectors.toList()).forEach(f->System.out.println(f.getId()+" "+f.getName()+" "+f.getCompany()+" "+f.getSalary()));

			
		//Q Fetch distinct company names
		Function<Employee, String> fun=f ->f.getCompany();
		//list.stream().map(f ->f.getCompany()).distinct().collect(Collectors.toList()).forEach(System.out::println);
		
		//Q Fetch all employee names
		//list.stream().map(f ->f.getName()).collect(Collectors.toList()).forEach(System.out::println);

		//1.sort employee by their salary if salary matches then sort by  names using Comparator technique and streamAPI
		Comparator<Employee> sortBySalary=(s1,s2)->{
			return Integer.compare(s1.getSalary(),s2.getSalary());
		};
		//list.stream().sorted(sortBySalary).collect(Collectors.toList()).forEach(f->System.out.println(f.getId()+" "+f.getName()+" "+f.getCompany()+" "+f.getSalary()));
	
		
	}

}
