package FileReaderOperations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReaderExample {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		JSONParser jsonparser = new JSONParser();

		FileReader filereader= new FileReader("dhayanidhi.json");

		Object parserObject= jsonparser.parse(filereader);

		JSONObject jsonobject=(JSONObject) parserObject;

		String Name1 = (String) jsonobject.get("Name");
		Long Age1 = (Long) jsonobject.get("age");
		
		
	
		JSONArray array=	(JSONArray) jsonobject.get("Special Qualities");

		Iterator iterator=array.iterator();
		System.out.println(Name1);
		System.out.println(Age1);
		while (iterator.hasNext()) {

			System.out.println("Special Qualities: " +  iterator.next());

		}



	}

}
