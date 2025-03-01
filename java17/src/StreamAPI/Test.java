package StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.print.attribute.Size2DSyntax;

public class Test {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	list.add(40);
	list.add(5);
	list.add(50);
	list.add(30);
	list.add(20);
	//Collections.sort(list);
	System.out.println(list);
	Comparator<Integer> sortByAnonymous= new Comparator<>() {
		
		@Override
		public int compare(Integer o1, Integer o2) {
			
			return o2-o1;

		}
	};
	//Collections.sort(list, sortByAnonymous);
	//System.out.println(list);
	// int compare(T o1, T o2);
	//Comparator<Integer> sortByLambdaExpression= (s1,s2)-> s2-s1;
		// Collections.sort(list, sortByLambdaExpression);
		 Collections.sort(list, (s1,s2)-> s2-s1);// not recommended for beginner
		// System.out.println(list);
 System.out.println("using streamAPI");
 //1.convert list into stream
 Stream<Integer> stream = list.stream();
 Stream<Integer> sorted = stream.sorted();
 //sorted.forEach(System.out::println);
 //list.stream().sorted().forEach(System.out::println);
 list.stream().sorted().forEach(l->System.out.print(l+" "));
 System.out.println("\n----------------------");

// list.stream().sorted().collect(Collectors.toList());
 //System.out.println(list);
// ------------------------------Practice------------------------------------------------------
 //list.add(45);
// System.out.println(list);
 //list.remove(list.size()-1);
 //list.addAll(list);
 //list.retainAll(list);
// list.removeAll(list);
 //list.clear();
 //list.equals(list.getFirst());
 System.out.println(list);
 
 
}
}

