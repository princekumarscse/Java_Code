package StreamAPI;



 

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

  
public class EmployeeTeset2 {
private static final String Stream = null;

public static void main(String[] args) {
	List<Employee2> list=DataBase.getEmployee2Data();
	Stream <Employee2> stream =list.stream();
	Predicate<Employee2> test =(t)->{
		return "TCS".equalsIgnoreCase(t.getCompany());
	};
	Predicate<Employee2> test1= t->"TCS".equalsIgnoreCase(t.getCompany());
	
	Stream<Employee2> filter = stream.filter(test1);
    //<R, A> R collect(Collector<? super T, A, R> collector);
	// Collector<T, ?, List<T>> toList() {
	List<Employee2> collect = filter.collect(Collectors.toList());
	//Q Fetch all those  employee working for TCS 	
		//Function<Employee2,String> fun3 =);
		list.stream().filter(f->"TCS".equalsIgnoreCase(f.getCompany())).collect(Collectors.toList()).forEach(f->System.out.println(f.getId()+" "+f.getName()+" "+f.getCompany()+" "+f.getSalary()));

	//1.sort employee by their salary if salary matches then sort by  names
	//using Comparator technique and streamAPI
	//Function<Employee, String> fun=f ->f.getCompany();
	//list.stream().map(f ->f.getCompany()).distinct().collect(Collectors.toList()).forEach(System.out::println);
	
	
	//Q Fetch all employee names
	Function<Employee2, String> fun =  f->f.getName();
	//list.stream().map(fun).collect(Collectors.toList()).forEach(System.out::println);	

	//Q Fetch distinct company names
	Function<Employee2,String> fun2=f->f.getCompany();
	//list.stream().map(fun2).distinct().collect(Collectors.toList()).forEach(System.out::println);
	
	//Q Fetch the employee who has highest salary
	System.out.println(" Fetch the employee who has highest salary  ");
	Comparator<Employee2> sortBySalary = (e1, e2)->e2.getSalary()-e1.getSalary();
	
	//Employee2 employee2 = list.stream().sorted(sortBySalary).findFirst().get();
	//System.out.println(employee2.getId() +" "+employee2.getName()+" "+employee2.getCompany()+" "+employee2.getSalary());
    //Optional<T> max(Comparator<? super T> comparator);

	Optional<Employee2> max = list.stream().max((e1, e2)->e1.getSalary()-e2.getSalary());
//	 Employee2 employee2 = max.get();
//	System.out.println(employee2.getId() +" "+employee2.getName()+" "+employee2.getCompany()+" "+employee2.getSalary());
	Comparator<Integer> sort =(s1,s2)->s2-s1;
	
			Integer maxSalary = list.stream().map(Employee2::getSalary).max((s1,s2)->s1-s2).get();
			System.out.println(maxSalary);
	System.out.println("fetch the employee who has second highest salary ");
	 Employee2 employee2 = list.stream().sorted(sortBySalary).collect(Collectors.toList()).get(1);
		System.out.println(employee2.getId() +" "+employee2.getName()+" "+employee2.getCompany()+" "+employee2.getSalary());

}
}
