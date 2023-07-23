package Executar;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import com.hpe.alm.octane.OctaneCucumber;

import Ultils.UtilsSteps;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(OctaneCucumber.class)
@CucumberOptions(features = "src/test/resources/features/", 
				 plugin = { "com.cucumber.listener.ExtentCucumberFormatter:","pretty", 
						 "html:src/test/resources/relatorios/cucumber-reports/",
						 "json:src/test/resources/relatorios/cucumber-reports/cucumber.json",
						"junit:src/test/resources/relatorios/cucumber-reports/cucumber-reports/Cucumber.xml" },
				 glue = {"steps"}, tags = "@1242",			
				 snippets = SnippetType.CAMELCASE,
				 monochrome = true, 
				 dryRun = false,
				 strict = false)
public class CucumberExecuteTest {

	public static UtilsSteps ult = new UtilsSteps();

	@BeforeClass
	public static void setarConfiguracoes() {
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		extentProperties.setReportPath("src/test/resources/relatorios/ExtentReport.html");
	}

	@AfterClass
	public static void fecharNavegador() {
		ult.initiate();
		ult.killDriver();
		Reporter.loadXMLConfig(new File("src/main/resources/extent-config.xml"));
	}

}

