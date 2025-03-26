package StreamAPI;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThreadHelper {
public static void printBranch() {
	System.out.println(Thread.currentThread().getName());
	List<Student> list = DataBase.getData();
	list.stream().map(f ->f.getBranch()).distinct().collect(Collectors.toList()).forEach(System.out::println);
}
public static void sortStudent() {
	System.out.println(Thread.currentThread().getName());
	List<Student> data = DataBase.getData();
	Comparator<Student> c=new Student();
	Collections.sort(data,c );//  through  polymorphism concepts
	for (Student s : data) {
		System.out.println(
				s.getId() + " " + s.getName() + " " + s.getBranch() + " " + s.getCollege() + " " + s.getCGPA());
	}
}
} 
