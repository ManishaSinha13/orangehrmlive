import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class EmployeePage extends LoginPage {

    When("^The user navigates to the Add Employee page$")
    public static void pimList(){
        driver.switchTo().defaultcontent();
        driver.findElement(By.cssSelector("a[@id="menu_pim_viewPimModule"]")).click();
        driver.findElement(By.cssSelector("a[@id="menu_pim_addEmployee"]")).click();
    }

    Then("^The user provide the details for adding employee$")
    public static void addEmployee(){

        driver.findElement(By.id("firstName")).sendKeys("abcde");
        driver.findElement(By.id("lastName")).sendKeys("fghij");
        driver.findElement(By.id("employeeId")).sendKeys("15678");

    }

    Then("^The user uploads the photo$")
    public static void uploadPhoto(){
         WebElemnt uploadele = driver.findElement(BY.id("photofile"));
         uploadele.send_keys("C:\testfile.jpg");
    }

    Then("^The user saves all the details$")
    public static void saveDetails(){

        driver.findElement(By.id("btnSave")).click();
    }
}