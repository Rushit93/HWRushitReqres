import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://reqres.in/");
        String titelofpage = driver.getTitle();
        System.out.println(titelofpage);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        System.out.println(driver.getPageSource());
        //driver.quit();


    }
}