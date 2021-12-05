package testJSON;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;


public class testJSON {

	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		obj.put("name","federico");
		obj.put("surname", "Brunella");
		System.out.println(obj);
		
		JSONArray arr = new JSONArray();
		/*arr.add("1");
		arr.add("2");
		System.out.println(arr);
		
		obj.put("Array", arr);
		System.out.println(obj);*/
		
		arr.add(obj);
		arr.add(obj);
		System.out.println(arr);

		
		


		
		
		

	}

}
