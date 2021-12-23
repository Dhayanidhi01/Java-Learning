package FileWirterOpertions;


import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		String location = "usingFileOutputStream.txt";
		String content = "This is File output Stream";
		
		
		FileOutputStream fileOutputStream=new FileOutputStream(location);
	byte[] writeThis =content.getBytes();
		
	fileOutputStream.write(writeThis);
	fileOutputStream.close();
		
	}

}
