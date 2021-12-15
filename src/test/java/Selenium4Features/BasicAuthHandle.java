package Selenium4Features;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.binary.Base64;
import org.asynchttpclient.AsyncCompletionHandlerBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v96.network.Network;
import org.openqa.selenium.devtools.v96.network.model.Headers;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicAuthHandle {
	
	private static final String username="admin";
	private static final String password="admin";
	
	public static void main(String[] args) throws EncoderException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		DevTools devTools=((EdgeDriver) driver).getDevTools();
		devTools.createSession();
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		
		Map<String,Object> headers=new HashMap<>();
		String auth="Basic "+new String(new Base64().encode(String.format("%s:%s", username,password).getBytes()));
		
		
		headers.put("Authorization", auth);
		             
		devTools.send(Network.setExtraHTTPHeaders(new Headers(headers)));
		driver.get("https://the-internet.herokuapp.com/basic_auth");
	}

}
