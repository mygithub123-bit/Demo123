package auto1;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class API_Test1 {
	
	@Test
	
	
	public static void associateRESTServerWithDefaultUser()throws Exception{
		
		int num=RandomNumber();
		System.out.println(num);
		OkHttpClient client = new OkHttpClient();
		
//
		MediaType mediaType = MediaType.parse("application/json");
		RequestBody body = RequestBody.create(mediaType, "{\r\n\r\n        \"login\": \"trash"+num+"@gmail.com\",\r\n        \"device_macs\":[\"000000000000\"],\r\n        \"user_def01\": \"000000000000\"\r\n\r\n       \r\n\r\n}");
		Request request = new Request.Builder()
		  .url("https://api-2.wifispark.net/subscribers/1365")
		  .put(body)
		  .addHeader("Content-Type", "application/json")
		  .addHeader("Authorization", "Bearer c4ebfb942e6a9bfccdb315d8e2dca00bb35b4816")
		  .addHeader("User-Agent", "PostmanRuntime/7.15.0")
		  .addHeader("Accept", "*/*")
		  .addHeader("Cache-Control", "no-cache")
		  .addHeader("Postman-Token", "7eba39e6-9588-487d-81b7-17ce63906b10,f82f13e3-c78b-4b00-8b47-1405f094a75c")
		  .addHeader("Host", "api-2.wifispark.net")
		  .addHeader("accept-encoding", "gzip, deflate")
		  .addHeader("content-length", "139")
		  .addHeader("Connection", "keep-alive")
		  .addHeader("cache-control", "no-cache")
		  .build();

		Response response = client.newCall(request).execute();
	}
	
	public static int RandomNumber() {
		
		Random rand=new Random();
				
				int rand_int=rand.nextInt(1000);
				
				
				
				return rand_int;
			}

}

	
	
	
	 
							
						
	 


					
