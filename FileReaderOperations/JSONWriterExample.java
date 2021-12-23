package FileReaderOperations;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONWriterExample {

	//JSON simple - Jar files
	//Jackson 2, Gson - Jar files
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Name", "Dhayanidhi");
		jsonObject.put("age", 1);
		
		//["Magical smile", "Magnetic eyes"]
		
		JSONArray jsonarray=new JSONArray();
		jsonarray.add("Magical smile");
		jsonarray.add("Magnetic eyes");
		
		jsonObject.put("Special Qualities", jsonarray);
		
		FileWriter fileWriter=new FileWriter("dhayanidhi.json");
		fileWriter.write(jsonObject.toJSONString());
		fileWriter.close();
		
		
		
	}

}
