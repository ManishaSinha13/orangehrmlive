import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.interactions.Actions;


public class DashboardPage extends LoginPage {

    When("^The user navigates to the Dashboard page$")
    public static void dashboardnavigation() {
        driver.switchTo().defaultcontent();
        driver.findElement(By.cssSelector("a[@id="menu_dashboard_index"]")).click();

    }
    Then("^The user mouse hovers on the subunit graph$")
    public static void mousehoverGraph() {
    WebElement subunitgraph = driver.findElement(By.xpath("*[@id=\"div_graph_display_emp_distribution\"]/canvas[2]"));
    Actions action = new Actions(driver);
    action.moveToElement(subunitgraph).build().perform();
}
