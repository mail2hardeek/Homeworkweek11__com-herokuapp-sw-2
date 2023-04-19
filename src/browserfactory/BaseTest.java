package browserfactory;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver dri;                  //Assigned variable for web driver

    public void openBrowser(String baseUrl) {
        dri = new ChromeDriver();                    //Storing driver in variable
        dri.get(baseUrl);                            //Getting Url
        dri.manage().window().fullscreen();          //Maximise webpage
        dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //implicit wait time
    }
    @After
    public void closeBrowser(){                           //Close browser
    }
}
