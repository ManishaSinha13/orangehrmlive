import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AdminPage extends LoginPage{


    When("^The user navigates to the General Information page$")
    public static void adminMenu() {
        driver.switchTo().defaultcontent();
       driver.findElement(By.cssSelector("a[@id="menu_admin_viewAdminModule"]")).click();
       driver.findElement(By.cssSelector("a[@id="menu_admin_Organization"]")).click();
       driver.findElement(By.cssSelector("a[@id="menu_admin_viewOrganizationGeneralInformation"]")).click();


    }

    Then("^The user edits the details$")
    public static void editDetails(){
        driver.findElement(By.name("btnSaveGenInfo")).click();
        WebElement organizationName= driver.findElement(By.xpath("//*[@id="organization_name"]"));
        organizationName.sendKeys("TestOrganization");
        WebElement taxid= driver.findElement(By.xpath("//*[@id="organization_taxId"]"));
        taxid.sendKeys("121212");
        WebElement regnum= driver.findElement(By.xpath("//*[@id="organization_registraionNumber"]"));
        regnum.sendKeys("M342322");
        driver.findElement(By.id("btnSaveGenInfo")).click();

   }
}