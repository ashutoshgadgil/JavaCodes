package MyProgrammes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandling6 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(new File("E:\\f4.txt"));
		
		int c=fis.read();
		
		System.out.println("File contents are : "+(char)c);
		fis.close();
	}

}
