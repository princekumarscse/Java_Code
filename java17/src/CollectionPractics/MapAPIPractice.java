package CollectionPractics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

import java.util.Set;


public class MapAPIPractice {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Twinkle", 40000);
		map.put("Prince", 35000);
		map.put("Kartik", 40000);
		map.put("Kundan", 40000);
		//System.out.println("Iterate entries from the map ");
		 // public abstract java.util.Set<java.util.Map$Entry<K, V>> entrySet();//To Iterate the entries
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Entry<String, Integer> next = iterator.next();
			//System.out.println(next.getKey()+ " "+next.getValue());
		}
		//System.out.println("Second Approach");
		for(Entry<String, Integer>entry: map.entrySet()) {
			//System.out.println(entry.getKey()+" "+entry.getValue());
		}
	//System.out.println("Approach 3");	
	 //default void forEach(BiConsumer<? super K, ? super V> action) {
	 // void accept(T t, U u);
	//BiConsumer<String, Integer> con =(k,v)->System.out.println(k+" "+v);	
	//map.forEach(con);
		
	//System.out.println("Advance version of Approach 3");
	//map.forEach(System.out::println);
		
//	map.entrySet().forEach(System.out::println);
//	map.entrySet().forEach(e->System.out.println(e.getKey()+ " "+e.getValue()));
		
	//map.forEach((k,v)->System.out.println(k+" "+v));
	//map.keySet().forEach(System.out::println);
	//map.values().forEach(System.out::println);
	
	
	//<------------------------------------------------------------------------------------>
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("Vineet", 25000);
		map2.put("Satyam",10000);
//	public abstract int size();
		System.out.println(map.size());
	
//	  public abstract boolean isEmpty();
		//System.out.println(map.isEmpty());
	
//	  public abstract boolean containsKey(java.lang.Object);
		//System.out.println(map.containsKey(iterator) );
		
//	  public abstract boolean containsValue(java.lang.Object);
		//System.out.println(map.containsValue(iterator) );
//	  public abstract V get(java.lang.Object);
		//System.out.println(map.get(null) );
//	  public abstract V put(K, V);
		map.put("Rohit", 45000);
		//map.entrySet().forEach(e->System.out.println(e.getKey()+ " "+e.getValue()));
//	  public abstract V remove(java.lang.Object);
		map.remove("Rohit", 45000);
		System.out.println("--------------");
		map.entrySet().forEach(e->System.out.println(e.getKey()+ " "+e.getValue()));
//	  public abstract void putAll(java.util.Map<? extends K, ? extends V>);
		//map.putAll(map2);
		
//	  public abstract void clear();
		//map.clear();
		
//	  public abstract java.util.Set<K> keySet();//To Iterate the keys 
		//map.keySet().forEach(System.out::println);
		
//	  public abstract java.util.Collection<V> values();//To Iterate the values
		//map.values().forEach(System.out::println);
		
//	  public abstract java.util.Set<java.util.Map$Entry<K, V>> entrySet();//To Iterate the entries
		//map.entrySet().forEach(System.out::println);
		
//	  public abstract boolean equals(java.lang.Object);
		if (map.equals(map2)) {
            System.out.println("Both maps are equal.");
        } else {
            System.out.println("Maps are not equal.");
        }
		
//	  public abstract int hashCode();
		//System.out.println(map.hashCode());
		
//	  public default V getOrDefault(java.lang.Object, V);
		System.out.println(map.getOrDefault("Prince", 1000));//35000
		
//	  public default void forEach(java.util.function.BiConsumer<? super K, ? super V>);//To Iterate the entries
		
		BiConsumer<String, Integer> con =(k,v)->System.out.println(k+" "+v);	
		map.forEach(con);
		
//	  public default void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V>);
		map2.replaceAll((key, value) -> value + (value + 400));
		
//	  public default V putIfAbsent(K, V);
		
//	  public default boolean remove(java.lang.Object, java.lang.Object);
		map2.remove("Vineet",25000);
//	  public default boolean replace(K, V, V);
		map2.replace("Satyam", 10000, 15000);
//	  public default V replace(K, V);
		map2.replace("Vineet", 35000);
		//map2.forEach((k,v)->System.out.println(k+" "+v));
		
//	  public default V computeIfAbsent(K, java.util.function.Function<? super K, ? extends V>);
		map2.computeIfAbsent("Vineet", k->45000);
		map2.computeIfAbsent("Saurav",k-> 20000);
		//map2.forEach((k,v)->System.out.println(k+" "+v));
//	  public default V computeIfPresent(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);
		map2.computeIfPresent("Vineet", (k,v)->v+1000);
		map2.computeIfPresent("Saurav", (k,v)-> v+1000);
		//map2.forEach((k,v)->System.out.println(k+" "+v));
//	  public default V compute(K, java.util.function.BiFunction<? super K, ? super V, ? extends V>);
		map2.compute("Vineet",(k,v)-> v*2);
//	map2.forEach((k,v)->System.out.println(k+" "+v));

//	  public default V merge(K, V, java.util.function.BiFunction<? super V, ? super V, ? extends V>);
        map2.merge("Rohit", 5000, (oldVal, newVal) -> oldVal + newVal);
   //	map2.forEach((k,v)->System.out.println(k+" "+v));


	}

}
