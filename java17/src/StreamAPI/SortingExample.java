package StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(40);
		list.add(5);
		list.add(50);
		list.add(30);
		list.add(20);
		// list.sort(null);
		Set<Integer> set = new TreeSet<>(list);
		System.out.println(set);
		System.out.println(list);
		List<String> list2 = new ArrayList<>();
		list2.add("prince");
		list2.add("twinkle");
		list2.add("kartik");
		list2.add("ritika");
		list2.sort(null);
		System.out.println(list2);
		List<Student> data = DataBase.getData();
		// Comparator<? super E> c
		// Collections.sort(data, sortBy);
		//data.sort(SortingConcepts.sortByCgpa);// by using anonymous
		// int compare(T o1, T o2);
		
		data.sort(SortingConcepts.sortByUsinglambda);// by using lambda expression
		for (Student s : data) {
			System.out.println(
					s.getId() + " " + s.getName() + " " + s.getBranch() + " " + s.getCollege() + " " + s.getCGPA());
		}

	}
}
