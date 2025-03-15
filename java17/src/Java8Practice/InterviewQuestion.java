package Java8Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewQuestion {

	String[] names= {"kartik","kartik","twinkle","twinkle","prince"};
	List<String> names2=Arrays.asList(names);
	Stream<String> stream = Arrays.stream(names);
//	public static <T, K> Collector<T, ?, Map<K, List<T>>>
//    groupingBy(Function<? super T, ? extends K> classifier)
	// R apply(T t);
	Function<String,String> classifier=(name)-> name;
	
	 Map<String, Long> collect = Arrays.stream(names)
			.collect(Collectors.groupingBy(name->name,Collectors.counting()));
	 collect.forEach((a,b)->System.out.println(a +" "+b));
//	  public static <T, K, A, D>
//	    Collector<T, ?, Map<K, D>> groupingBy(Function<? super T, ? extends K> classifier,
//	                                          Collector<? super T, A, D> downstream)
	 Map<String, Integer> map=new HashMap<>();
	 for(String name:names) {
		if(map.containsKey(name)) {
			int count = map.get(name);
			count=count+1;
			map.put(name, count);
		}
		else {
			map.put(name, 1);
		} 
	}
	 System.out.println(map);
}
	
}
