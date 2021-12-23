package FileReaderOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferedReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		String location="usingBufferedWrite.txt";
		
		
		FileReader fileReader=new FileReader(location);
		BufferedReader bufferReader=new BufferedReader(fileReader);
		
	String readline;
	
	while ((readline =	bufferReader.readLine())!=null) {
		System.out.println(readline);
	}
	
		
		
	}

}
