import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnterKeyExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        Thread.sleep(1000);
        WebElement searchBox=driver.findElement(By.name("q"));
        Thread.sleep(1000);
        searchBox.sendKeys("Selenium Automation");
        Thread.sleep(1000);
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.quit();

    }
}
