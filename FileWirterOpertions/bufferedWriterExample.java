package FileWirterOpertions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		String location="usingBufferedWrite.txt";
		String content="This is Sample Buffered writer";
		
		FileWriter fileWriter=new FileWriter(location);
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		bufferedWriter.write(content);
		bufferedWriter.close();
		
		
	}

}
