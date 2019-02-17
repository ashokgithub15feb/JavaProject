package com.ds.iq;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
//import org.codehaus.jackson.map.ObjectMapper;
//import org.codehaus.jackson.map.util.JSONPObject;

public class SynchronousGet {

	public static void main(String[] uri) throws Exception {

//		ObjectMapper mapper = new ObjectMapper();

		URL url = new URL("http://localhost:8080/hello");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("accept", "application/json");

		
		System.out.println(Math.sqrt(16));
		con.connect();

		int responseCode = con.getResponseCode();

		if (responseCode != 200) {

			System.out.println("Error:" + responseCode);

		} else {
			InputStream inputStream = con.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader in = new BufferedReader(inputStreamReader);

			String inputLine;

			StringBuffer content = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine);

//				JSONPObject jobj = new JSONPObject(content.toString(), StringBuffer.class);
//				System.out.println(jobj.getValue());

			}

			// JsonParser parse = new JSONParser;
			//

			in.close();
			System.out.println(content);
		}

	}
}
