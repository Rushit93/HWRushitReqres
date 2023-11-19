import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        driver.get("https://reqres.in/");
        String titelofpage = driver.getTitle();
        System.out.println(titelofpage);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        System.out.println(driver.getPageSource());
        //driver.quit();


    }
}