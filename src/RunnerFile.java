import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"OrangeHRMLive\\FeatureFile\\OrangeHRMLive.feature"},
        tags = {"~@ignore"},
        glue={"helpers","pages/LoginPage.java", "pages/EmployeePage.java","pages/AdminPage.java", "pages/DashboardPage.java"},
		dryRun = false,
        monochrome = true
)
public class RunAPITest{

}