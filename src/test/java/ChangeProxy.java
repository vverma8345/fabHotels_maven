/**
 * 
 */


import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Rajesh.Kumar4
 *
 */
public class ChangeProxy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String DriverPath = "C:\\Users\\rajesh.kumar41\\eclipse-workspace\\fabHotel\\lib\\";
		
		System.setProperty("webdriver.gecko.driver", DriverPath+"geckodriver.exe");
		@SuppressWarnings("deprecation")
		WebDriver d = new FirefoxDriver();
		d.get("http://www.google.com");

	}

}
