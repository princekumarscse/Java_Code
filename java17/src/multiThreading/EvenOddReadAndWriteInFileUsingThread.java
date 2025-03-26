package multiThreading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/*
 * Step1:Take path of the file in which you want to write
 * Step2:if file not exists create file
 * 
 * */
public class EvenOddReadAndWriteInFileUsingThread {
public static void main(String[] args) throws IOException {
	Runnable evenThread=()->{
		String join ="";
		for(int i=1;i<=10;i++) {
		
		if(i%2==0) {
		String	even = String.valueOf(i);
			 join =join+even+" ";
		}
		
	}
		Path path=Paths.get("EvenThread.txt");
		try {
			join.trim();
			Files.write(path,join.getBytes(),StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}};
	Runnable oddThread=()->{for(int i=1;i<=10;i++) {
		if(i%2!=0) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}};
	//Thread t1=new Thread(oddThread, "OddThreadV1");
	Thread t2=new Thread(evenThread, "EvenThreadV1");
	//t1.start();
	t2.start();
	
}
}
