package Base;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v114.network.Network;




public class UserAgentOverrride {
	
	public static void main(String[] args)
	{
		
		WebDriver driver =new ChromeDriver();
		DevTools devtools=((ChromeDriver)driver).getDevTools();
		devtools.createSession();
		//devtools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
		//devtools.send(Network.setUserAgentOverride("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64)"
	//+"AppleWebKit/537.36 (KHTML, like Gecko)"
	//+"Chrome/87.0.4280.141 Safari/537.36",Optional.empty(),Optional.empty(),Optional.empty()));
		
	}
	
	
	
	 
	
	
	
}
