package CollectionPractics;

import java.util.List;
  
import StreamAPI.DataBase;
import StreamAPI.Employee; 
  
public class ListAPIPractice {
public static void main(String[] args) {
	List<Employee> list = DataBase.getEmployeeData();
	List<Employee>list1 =DataBase.getEmployeeData();


//	
//	  public abstract int size();
	//System.out.println(list.size());
//	  public abstract boolean isEmpty();//Done
//	System.out.println(list.isEmpty());
//	  public abstract boolean contains(java.lang.Object);
	//System.out.println(list.contains(new Employee(19,"Nitesh","Wipro",30000)));
//	  public abstract java.util.Iterator<E> iterator();
	//Iterator<Employee>iteratir();
//	for(Employee e:list) {
//		System.out.println(e.getId()+" "+e.getName()+" "+e.getCompany()+" "+e.getSalary());
//		
//	}
//	  public abstract java.lang.Object[] toArray();
		Object[] arr=list.toArray();
		

//	  public abstract <T> T[] toArray(T[]);
//	  public abstract boolean add(E);//done
		list.add(new Employee(24,"Somil","Oracle",80000));
//		for(Employee e:list) {
//			System.out.println(e.getId()+" "+e.getName()+" "+e.getCompany()+" "+e.getSalary());
//	
//		}
		//System.out.println("------------------");
	 //list.add( new Employee(19,"Nitesh","Wipro",30000));
	// System.out.println(list);
//	  public abstract boolean remove(java.lang.Object);//Done
		//list.remove(new Employee(24,"Somil","Oracle",80000));
		//list.remove(list.size()-1);
//		for(Employee e:list) {
//			System.out.println(e.getId()+" "+e.getName()+" "+e.getCompany()+" "+e.getSalary());
//	
//		}
//	  public abstract boolean containsAll(java.util.Collection<?>);
		//System.out.println(list.contains(list1));
//	  public abstract boolean addAll(java.util.Collection<? extends E>);//Done
		//System.out.println(list.addAll(list1));
		
//	  public abstract boolean retainAll(java.util.Collection<?>);//Done
		//list.retainAll(list1);
//	  public abstract boolean removeAll(java.util.Collection<?>);//Done
		//list.removeAll(list1);
//	  public abstract void clear();Done
		//list.clear();
//	  public abstract boolean equals(java.lang.Object);// done
		//System.out.println(list.equals(list1));
//	  public abstract int hashCode();
	System.out.println(list.hashCode());
		for(Employee e:list) {
			System.out.println(e.getId()+" "+e.getName()+" "+e.getCompany()+" "+e.getSalary());
	
		}	
}
}
