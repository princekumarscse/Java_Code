package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class FileExample {
public static void main(String[] args) {
	Path path=Paths.get("C:\\Users\\TWINKLE THAKUR\\test-folder2");
	Path path2=Paths.get("C:\\Users\\TWINKLE THAKUR\\test-folder2\\\\myTest.txt");
	Path source=Paths.get("C:\\Users\\TWINKLE THAKUR\\git\\repository\\java_8\\myTest.txt");
	if(Files.notExists(path)) {
		try {
			Files.createDirectory(path);
			System.out.println("folder has been created successfully");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	try {
		Files.copy(source, path.resolve(source.getFileName()),StandardCopyOption.REPLACE_EXISTING);
		System.out.println("file has been copied");
	Files.deleteIfExists(path2);
	System.out.println("file has been deleted");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
