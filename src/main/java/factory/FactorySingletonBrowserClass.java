package factory;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FactorySingletonBrowserClass {

	// instancia da classe singleton
	private static FactorySingletonBrowserClass instanceOfSingletonBrowserClass = null;

	/**
	* Instanciar o chromeOptions como global
	* 
	* @author leonardoananias
	* @since 03-01-2020
	* @see BRQ
	*/
	private static ChromeOptions chromeOptions = new ChromeOptions();
	private static String chromeWebDriver = "webdriver.chrome.driver";

	public static WebDriver driver;

	// Construtor
	/**
	* Alterado a forma de iniciar o driver | 06-01-2020
	* 
	* @author leonardoananias
	*/
	private FactorySingletonBrowserClass() {
		if (retornaSistemaOperacional().contains("mac")) {
			System.setProperty(chromeWebDriver, retornaCaminhoDoDriver());
			iniciarNavegador();
		} else {
			System.setProperty(chromeWebDriver, retornaCaminhoDoDriver());
			iniciarNavegador();
		}
	}

	// Criacao de instancia
	public static FactorySingletonBrowserClass getInstanceOfSingletonBrowserClass() {
		if (instanceOfSingletonBrowserClass == null) {
			instanceOfSingletonBrowserClass = new FactorySingletonBrowserClass();
		}
		return instanceOfSingletonBrowserClass;
	}

	// Coleta de driver
	public static WebDriver getDriver() {
		return driver;
	}

	public void managerDriver() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	/**
	* Inicia o navegador google chrome e adiciona os arguemntos
	* 
	* @author leonardoananias
	* @since 03-01-2022
	* @see BRQ
	*/
	private static void iniciarNavegador() {

		
			 

		if (!retornaSistemaOperacional().contains("windows")) {
			chromeOptions.addArguments("--start-maximized");
			chromeOptions.addArguments("--disable-gpu");
			chromeOptions.addArguments("test-type");

			chromeOptions.addArguments("--headless");



		}
		driver = new ChromeDriver(chromeOptions);
	}

	
	private static String retornaSistemaOperacional() {
		return System.getProperty("os.name").toLowerCase();
	}

	/**
	* Retorna o caminho do driver com base no sistema operacional
	 
	* @return Caminho do driver
	* @author leonardoananias
	* @since 06-01-2020
	* @see BRQ
	*/
	private static String retornaCaminhoDoDriver() {
		String caminho = null;
		if (retornaSistemaOperacional().contains("mac")) {
			caminho = "src" + File.separator + "main" + File.separator + "resources" + File.separator + "drivers"
					+ File.separator + "chromedriver";
		} else if (retornaSistemaOperacional().contains("windows")) {
			caminho = "src" + File.separator + "main" + File.separator + "resources" + File.separator + "drivers"
					+ File.separator + "chromedriver.exe";
			
		} else {
			caminho = File.separator + "usr" + File.separator + "bin" + File.separator + "chromedriver";
		}
		return caminho;
	}

}
