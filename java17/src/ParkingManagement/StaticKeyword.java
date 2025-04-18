package ParkingManagement;

public class StaticKeyword {
static int count=0;
public StaticKeyword() {
	count++;
}
public static void main(String[] args) {
	StaticKeyword obj1=new StaticKeyword();
	StaticKeyword obj2=new StaticKeyword();
	StaticKeyword obj3=new StaticKeyword();
	StaticKeyword obj4=new StaticKeyword();
	System.out.println(count);
}
}
