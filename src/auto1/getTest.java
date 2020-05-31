package auto1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;

public class getTest {

	public static void MyGETRequest() throws IOException {
	   URL urlForGetRequest = new URL("https://api-2.wifispark.net/subscribers/1340");
	    
	   // URL urlForGetRequest = new URL("https://jsonplaceholder.typicode.com/posts/1");
	    String readLine = null;
	    HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
	    conection.setRequestMethod("GET");
	 conection.setRequestProperty("Authorization", "Bearer c4ebfb942e6a9bfccdb315d8e2dca00bb35b4816"); // set userId its a sample here
	    int responseCode = conection.getResponseCode();
	    
	 
	    
	    //
	    
	    
	    if (responseCode == HttpURLConnection.HTTP_OK) {
	        BufferedReader in = new BufferedReader(
	            new InputStreamReader(conection.getInputStream()));
	        StringBuffer response = new StringBuffer();
	        while ((readLine = in .readLine()) != null) {
	            response.append(readLine);
	        } in .close();
	        // print result
	        System.out.println("JSON String Result " + response.toString());
	        //GetAndPost.POSTRequest(response.toString());
	    } else {
	        System.out.println("GET NOT WORKED");
	    }
	}



public static void main(String[] args) throws IOException {
	
	getTest.MyGETRequest();
}
}
