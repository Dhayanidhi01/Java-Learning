package FileWirterOpertions;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class filePathExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location = "usingPath.txt";
		String content = "This is Path" + "This is Addtional content path";
		
		
		Path path = Paths.get(location);
		Files.write(path, content.getBytes());
		
		
		
	}

}
