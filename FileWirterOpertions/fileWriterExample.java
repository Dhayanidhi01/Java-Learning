package FileWirterOpertions;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		String location="usingFileWriter.txt";
		String content="Learning Java is simple!";
		
		FileWriter fileWriter=new FileWriter(location);
		fileWriter.write(content);
		fileWriter.close();
		
	}

}
