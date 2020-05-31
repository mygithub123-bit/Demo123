package auto1;

import java.awt.Point;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import com.google.common.net.HttpHeaders;
import com.google.gson.Gson;

public class test7 {

	
		
	public test7(String login) {
		
		
		//, int i, String string2, String string3
		
	}

	public static void sendPostRequest() throws UnsupportedEncodingException {
	    CloseableHttpClient httpClient = HttpClientBuilder.create().build();
	   // HttpPost postRequest = new HttpPost("https://api-2.wifispark.net/subscribers/1340");
	    
	    HttpPut postRequest = new HttpPut("https://api-2.wifispark.net/subscribers/1340");
	    Gson gson = new Gson();
	    
	  //  postRequest.setRequestProperty("Authorization", "Bearer c4ebfb942e6a9bfccdb315d8e2dca00bb35b4816");
	    
	    
	    test7 post = new test7("tester150@gmail.com"); //, 111, "post-title", "post-body"
	 
	    String json = gson.toJson(post);
	    postRequest.setEntity(new StringEntity(json));
	    postRequest.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
	    
	    postRequest.setHeader(HttpHeaders.AUTHORIZATION, "Bearer c4ebfb942e6a9bfccdb315d8e2dca00bb35b4816");
	 
	    try (CloseableHttpResponse httpResponse = httpClient.execute(postRequest)) {
	        String content = EntityUtils.toString(httpResponse.getEntity());
	 
	        int statusCode = httpResponse.getStatusLine().getStatusCode();
	        System.out.println("statusCode = " + statusCode);
	        System.out.println("content = " + content);
	    } catch (IOException e) {
	        //handle exception
	        e.printStackTrace();
	    }
	}
	
	public static void main(String[] abc) throws UnsupportedEncodingException {
		
		test7.sendPostRequest();
	}
}
	
