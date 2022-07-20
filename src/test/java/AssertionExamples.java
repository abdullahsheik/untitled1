import javafx.scene.layout.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionExamples {
    WebDriver driver;
   @BeforeClass
   @Test(priority=1)
    void setup()
    {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Abdullah/Downloads/chromedriver_win32/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");

    }
    @Test(priority = 2)
    void logoTest()
    {
        WebElement logo=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
        Assert.assertTrue(logo.isDisplayed(), "logo not displayed on the page");

    }
    @Test
    void homePageTitle()
    {
    String title=driver.getTitle();
            Assert.assertEquals("Google",title, "Title is not matched");

    }
    @AfterClass
    void tearDown()
    {
    driver.quit();
    }
}
