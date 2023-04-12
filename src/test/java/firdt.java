import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.traffic.TrafficCounter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firdt {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        String googleTitle = driver.getTitle();
        System.out.println("googletitle:"+googleTitle);
        driver.navigate().to("http://www.udemy.com");
        driver.navigate().back();
        String googleUrl = driver.getCurrentUrl();
        System.out.println("googleurl"+ googleUrl);
        driver.manage().window().fullscreen();
        driver.navigate().refresh();
        driver.navigate().forward();
    driver.quit();
    }

}
