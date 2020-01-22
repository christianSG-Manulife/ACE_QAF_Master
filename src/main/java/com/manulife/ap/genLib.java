package com.manulife.ap;
import com.codoid.products.exception.FilloException;
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
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class genLib {
    public void readExcel_Fillo(String filePath,String fileName,String sheetName) throws IOException {
        /*
        Fillo fillo=new Fillo();
        Connection connection = null try {
            connection = fillo.getConnection("C:\\Test.xlsx");
        } catch (FilloException e) {
            e.printStackTrace();
        }
        String strQuery="Update Sheet1 Set Country='US' where ID=100 and name='John'";
        try {
            Recordset recordset = connection.executeQuery(strQuery);
        } catch (FilloException e) {
            e.printStackTrace();
        }
        connection.close();
         */
    }

    public static void readExcel(String filePath, String fileName, String sheetName) {
        /*
        //Create an object of File class to open xlsx file
        File file = new File(filePath + "\\" + fileName);
        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);
        Workbook workbook = null;
        //Find the file extension by splitting file name in substring  and getting only extension name
        String fileExtensionName = fileName.substring(fileName.indexOf("."));
        //Check condition if the file is xlsx file
        if (fileExtensionName.equals(".xlsx")) {
            //If it is xlsx file then create object of XSSFWorkbook class
            workbook = new XSSFWorkbook(inputStream);
        }
         */
    }
}
