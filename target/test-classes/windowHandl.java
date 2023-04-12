import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowHandl {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/windows");

        driver.findElement(By.linkText("Click Here")).click();
        String main = driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();
        for (String a : allWindow)
        {
            if (a.equals(main)){
              driver.switchTo().window(a);
            }
             String windowText = driver.findElement(By.tagName("h3")).getText();
            System.out.println(windowText);


        }


    }
}
