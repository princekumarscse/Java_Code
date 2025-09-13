package CollectionPractics;

import java.util.HashSet;
import java.util.Set;
import StreamAPI.Employee;
   
public class SetAPIPractice {
public static void main(String[] args) {
	Set<Integer> set= new HashSet<>();
	Set<Integer> set1=new HashSet<>();
	set.add(30011);
	set.add(60024);  
	set.add(60013);  
	set.add(60014); 
	set.add(40027);
	set.add(40017);
	
	//System.out.println(set);
	//<----------------------------------------------------------------------------------->
	set1.add(10);
	set1.add(20);
//	public abstract int size();//Done
	set.size();
	//System.out.println(set);
//	  public abstract boolean isEmpty();//P
	//set.isEmpty();
	
//	  public abstract boolean contains(java.lang.Object);//P
	set.contains(set.add(10001));
	//System.out.println(set);
//	  public abstract java.util.Iterator<E> iterator();//P
	for(Integer s:set) {
		//System.out.println(s);
	}
	
//	  public abstract java.lang.Object[] toArray();//P
	Object[] arr=set.toArray();
	
//	  public abstract <T> T[] toArray(T[]);//P
	Integer[] temp = set.toArray(new Integer[0]);
//	  public abstract boolean add(E);//P
	set.add(50009);
	//System.out.println(set);
//	  public abstract boolean remove(java.lang.Object);//P
	set.remove(50009);
	//System.out.println(set);
//	  public abstract boolean containsAll(java.util.Collection<?>);//P
	//set.containsAll(set1);
//	  public abstract boolean addAll(java.util.Collection<? extends E>);//P
	//set.addAll(set1);
	//System.out.println(set);
	
//	  public abstract boolean addAll(int, java.util.Collection<? extends E>);//P
//	  public abstract boolean removeAll(java.util.Collection<?>);//P
	//set.removeAll(set1);
	
//	  public abstract boolean retainAll(java.util.Collection<?>);//P
	set.retainAll(set);
	//System.out.println(set);
//	  public default void replaceAll(java.util.function.UnaryOperator<E>);//P Not Available
	
//	  public default void sort(java.util.Comparator<? super E>);//P
	
//	  public abstract void clear();//P
	//set.clear();
//	  public abstract boolean equals(java.lang.Object);//P
	//set.equals(set1);
	
//	  public abstract int hashCode();//P
	//set.hashCode();
//	  public abstract E get(int);//P
	
//	  public abstract E set(int, E);//P
//	  public abstract void add(int, E);//P
	//set.add(15);
//	  public abstract E remove(int);//P
	//set.remove(set1);
//	  public abstract int indexOf(java.lang.Object);//P
	//set.
//	  public abstract int lastIndexOf(java.lang.Object);//P
//	  public abstract java.util.ListIterator<E> listIterator();
//	  public abstract java.util.ListIterator<E> listIterator(int);
//	  public abstract java.util.List<E> subList(int, int);//P
//	  public default java.util.Spliterator<E> spliterator();
//	  public default void addFirst(E);//P
//	  public default void addLast(E);//P
	//set.addLast();
//	  public default E getFirst();//P
	//System.out.println();
	
//	  public default E getLast();//P
	//set.getLast();
//	  public default E removeFirst();//P
//	  public default E removeLast();//P
	//set.removeLast();
	
//	  public default java.util.List<E> reversed();//P
	
	
	
	//public static <E> java.util.List<E> copyOf(java.util.Collection<? extends E>);//P

	
}
}
