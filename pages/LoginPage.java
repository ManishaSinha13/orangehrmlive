import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage{

    public WebDriver driver;

    @Given("^The user is on landing page$")
    public static void Launch() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @When("^The user provides the username and password$")
    public static void Login(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
    }
    @Then("^Verify if the user able to login successfully$")
    public static void verifyloginsuccessful()throws Exception
    {
       WebElement welcomelinkwait;
       welcomelinkwait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"welcome\"]")));
       boolean welcomeMessage= driver.findElement(By.xpath("//*[@id=\"welcome\"]")).isDisplayed();
       Assert.assertTrue(welcomeMessage);

    }
    @Then("^The user closes the browser$")
    public static void closebrowser() {
        driver.close();
    }

}