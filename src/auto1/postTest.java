package auto1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class postTest {

	public static void main(String[] args) throws IOException {
		
		postTest.POSTRequest();
	}
	
	
	
	
	
	
	public static void POSTRequest() throws IOException {
	    final String POST_PARAMS = ("{\r\n\r\n        \"login\": \"tester123@gmail.com\",\r\n        \"device_macs\":[\"000000000000\"],\r\n        \"user_def01\": \"000000000000\"\r\n\r\n       \r\n\r\n}");
	    System.out.println(POST_PARAMS);
	    URL obj = new URL("https://api-2.wifispark.net/subscribers/1321");
	    HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
	    postConnection.setRequestMethod("POST");
	    postConnection.setRequestProperty("Authorization", "Bearer c4ebfb942e6a9bfccdb315d8e2dca00bb35b4816");
	    postConnection.setRequestProperty("Content-Type", "application/json");
	    postConnection.setDoOutput(true);
	    OutputStream os = postConnection.getOutputStream();
	    os.write(POST_PARAMS.getBytes());
	    os.flush();
	    os.close();
	    int responseCode = postConnection.getResponseCode();
	    System.out.println("POST Response Code :  " + responseCode);
	    System.out.println("POST Response Message : " + postConnection.getResponseMessage());
	    if (responseCode == HttpURLConnection.HTTP_CREATED) { //success
	        BufferedReader in = new BufferedReader(new InputStreamReader(
	            postConnection.getInputStream()));
	        String inputLine;
	        StringBuffer response = new StringBuffer();
	        while ((inputLine = in .readLine()) != null) {
	            response.append(inputLine);
	        } in .close();
	        // print result
	        System.out.println(response.toString());
	    } else {
	        System.out.println("POST NOT WORKED");
	    }
	}

}
