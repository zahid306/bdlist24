package textFileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReaderSamaple {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new FileReader("C:\\Users\\zahid\\Desktop\\data.txt"));
		
		while ((br.readLine())!=null) {
			System.out.println(br.readLine());
		}
}
}
