/**
 * 
 */
package com.quantum.steps;

import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.util.StringUtil;
import com.quantum.utils.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Screen;
import java.net.URISyntaxException;
import java.net.URL;
import com.manulife.ap.genLib;

@QAFTestStepProvider
public class CalcStepsDefs {
	private Screen screen;
	private String basePath;

	@Given("^Compute$")
	public void Compute() throws Throwable {
		//Parameterization
		genLib genLibForver = new genLib();
		//Winium
		DesktopOptions option = new DesktopOptions();
		option.setApplicationPath("C:\\\\Windows\\\\System32\\\\calc.exe");
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
		Thread.sleep(3500);
		driver.findElement(By.name("One")).click();
		driver.findElement(By.name("Two")).click();
		driver.findElement(By.name("Three")).click();
		driver.findElement(By.name("Plus")).click();
		driver.findElement(By.name("Nine")).click();
		driver.findElement(By.name("Eight")).click();
		driver.findElement(By.name("Seven")).click();
        driver.findElement(By.name("Plus")).click();
        driver.findElement(By.name("Six")).click();
        driver.findElement(By.name("Five")).click();
        driver.findElement(By.name("Four")).click();
		driver.findElement(By.name("Equals")).click();
		String output = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");
		System.out.println("Result after addition is: "+output);
		//driver.close();

		//QAF-Selenium
		new WebDriverTestBase().getDriver().get("http://www.google.com/");
		QAFExtendedWebElement searchBoxElement = new QAFExtendedWebElement("search.text.box");
		QAFExtendedWebElement searchBtnElement = new QAFExtendedWebElement("search.button");

		searchBoxElement.clear();
		searchBoxElement.sendKeys(output + " meaning");
		JavascriptExecutor js = (JavascriptExecutor) DeviceUtils.getQAFDriver();
		js.executeScript("arguments[0].click();", searchBtnElement);

		//Sikuli
		screen = new Screen();
		URL resourceFolderURL = this.getClass().getClassLoader().getResource("Sikuli_Images");
		basePath = resourceFolderURL.toURI().getPath() + "/";

		screen.click(basePath + "windows-start.png");
		screen.wait(10.0);
		screen.click(basePath + "windows-time.png");
        screen.wait(7.0);
		screen.click(basePath + "windows-stopwatch.png");
        screen.wait(5.0);
		screen.click(basePath + "windows-stopwatch-play.png");
        screen.wait(5.0);
		screen.click(basePath + "windows-stopwatch-lapsesplit.png");
        screen.wait(5.0);
		screen.click(basePath + "windows-stopwatch-stop.png");
	}

		private void startTest() throws FindFailed {
		clickWindowsStartAndOpenMSWord();
		typeTextInWordAndSave();
	}

	private void clickWindowsStartAndOpenMSWord() throws FindFailed {
		screen.click(basePath + "windows-start.png");
		screen.wait(1.0); //need delay to allow animation to bring start menu
		screen.type("word");
		screen.wait(1.0); //wait for 1 second to show results
		screen.type(Key.ENTER);
	}

	private void typeTextInWordAndSave() throws FindFailed {
		screen.click(basePath + "blank-document.png");
		screen.type("This is a test in Sikuli Automation by JavaPointers.");
		screen.type("s", KeyModifier.CTRL);
		screen.click(basePath + "browse-save.png");
		screen.type("sikuli-test-document");
		screen.click(basePath + "btn-save.png");
	}
}
