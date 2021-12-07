import model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;


public class Main {

	public static void main(String[] args) {
		
		City london = new City();

		String url = "https://api.openweathermap.org/data/2.5/forecast?q=London&appid=0350270b1abadb862209083d1e1fa0bf"; 
		try {

			URLConnection openConnection = new URL(url).openConnection();
			InputStream in = openConnection.getInputStream();

			String data = "";
			String line = "";
			try {
				InputStreamReader inR = new InputStreamReader( in );
				BufferedReader buf = new BufferedReader( inR );

				while ( ( line = buf.readLine() ) != null ) {
					data+= line;
				}
			} finally {
				in.close();
			}
			System.out.println( data );
			//JSONArray obj = (JSONArray) JSONValue.parseWithException(data);	//parse JSON Array
			JSONObject obj = (JSONObject) JSONValue.parseWithException(data);	 //parse JSON Object
			System.out.println( obj );
			System.out.println( "OK" );
			
			JSONArray city = (JSONArray)obj.get("list");
			
			//london.setCountry((String)city.get("country"));
			
			System.out.println( city );


		} catch (IOException | ParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
