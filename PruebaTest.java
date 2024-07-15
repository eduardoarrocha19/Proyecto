// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class PruebaTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void prueba() {
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.findElement(By.name("username")).sendKeys("Admin");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("admin123");
    driver.findElement(By.cssSelector(".oxd-button")).click();
    driver.findElement(By.linkText("Recruitment")).click();
    driver.findElement(By.cssSelector(".oxd-button--secondary:nth-child(1)")).click();
    driver.findElement(By.name("firstName")).click();
    driver.findElement(By.name("firstName")).sendKeys("oscar");
    driver.findElement(By.name("middleName")).click();
    driver.findElement(By.name("middleName")).sendKeys("andres");
    driver.findElement(By.name("lastName")).click();
    driver.findElement(By.name("lastName")).sendKeys("roa");
    driver.findElement(By.cssSelector(".bi-caret-up-fill")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".orangehrm-file-input .oxd-input-group__label-wrapper"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
  }
}
