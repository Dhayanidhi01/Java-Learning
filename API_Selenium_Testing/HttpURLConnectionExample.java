package API_Selenium_Testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Stream;

public class HttpURLConnectionExample {

	
	
	public void getMethodExample() throws IOException {
		
		
		URL url = new URL("https://dummay.restapiexample.com/api/v1/employees");
		
		HttpURLConnection connections =(HttpURLConnection)url.openConnection();
		connections.setRequestMethod("GET");
		connections.connect();
		
		
	int sourcecode =	connections.getResponseCode();
	System.out.println(sourcecode);
	
String ResponseMessage =	connections.getResponseMessage();
System.out.println(ResponseMessage);
	
InputStream inputstream =	connections.getInputStream();

InputStreamReader inputstreamreader=new InputStreamReader(inputstream);

BufferedReader bufferread=new BufferedReader(inputstreamreader);

Stream<String> line;
StringBuffer buffer=new StringBuffer();

while ((line = bufferread.lines())!=null) {
	buffer.append(line);
}
System.out.println(buffer);
	
	
	}
	
	
}
