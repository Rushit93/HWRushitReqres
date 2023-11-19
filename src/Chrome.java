import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://reqres.in/");
        String titelofpage = driver.getTitle();
        System.out.println(titelofpage);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        System.out.println(driver.getPageSource());
        //driver.quit();


    }
}