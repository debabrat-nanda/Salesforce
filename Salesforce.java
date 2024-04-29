package Salesforce;
import org.monte.screenrecorder.ScreenRecorder;
import org.monte.screenrecorder.ScreenRecorderCompactMain;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.Keys;


import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import dev.failsafe.internal.util.Assert;
import java.time.LocalDate;
@Test

public class Salesforce  {
	

	public void Test() throws Exception{ {
		//MyScreenRecorder.startRecording("recording");
				ChromeOptions co = new ChromeOptions();
				co.setBrowserVersion("119");
				//EdgeDriver driver = new EdgeDriver();
				WebDriver driver = new ChromeDriver(co);
				//Login to salesforce
		       driver.manage().window().maximize(); 
		       driver.get("https://dominionenergyops--rls.sandbox.my.salesforce.com/");
		       driver.findElement(By.xpath("//*[@id=\"idp_section_buttons\"]/button/span")).click();
		       //driver.findElement(By.className("button mb12 secondary wide")).click();
		       Thread.sleep(5000);
		       //Username
		       driver.findElement(By.id("input43")).sendKeys("guru.p.pati@dominionenergy.com");
		       driver.findElement(By.xpath("//*[@id=\"form35\"]/div[2]/input")).click();
		       //Password
		       Thread.sleep(5000);
		       driver.findElement(By.id("input75")).sendKeys("CIStest@32");
		       driver.findElement(By.xpath("//*[@id=\"form67\"]/div[2]/input")).click();
		       //Push Notification
		       //driver.findElement(By.cssSelector("#form91 > div.authenticator-verify-list.authenticator-list > div > div:nth-child(2) > div.authenticator-description > div.authenticator-button > a")).click();
		       Thread.sleep(100000);
		       //Providde Service Order #
		       driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[2]")).click();
		       //String X="3100025231227";
		       //WebElement E= driver.findElement(By.xpath("//*[@id=\"oneHeader\"]/div[2]/div[2]/div/button")); 
		       WebElement E= driver.findElement(By.xpath("//*[@id=\"input-106\"]"));
		       E.sendKeys("3100025231227");
		       E.sendKeys(Keys.ENTER);
		       Thread.sleep(5000);
		       driver.findElement(By.linkText("SA-2953005")).click();
		       //driver.findElement(By.xpath("//*[@id=\"brandBand_2\"]/div/div/div[2]/div/div[1]/div/div[1]/div/header/div[2]/div/div[2]/ul/li[1]/a")).click();
		       Thread.sleep(3000);
		       //driver.findElement(By.linkText("Edit")).click();
		       Thread.sleep(5000);
		      // Verify Work type 
		        WebElement WorkType = driver.findElement(By.linkText("BLKBIE"));
		        System.out.println("Element with text(): " + WorkType.getText() );
		     
		        String ActualName = driver.findElement(By.linkText("BLKBIE")).getText().trim();
		        String ExpectedName = driver.findElement(By.linkText("BLKBIE")).getText().trim();
		        assertEquals("BLKBIE", ExpectedName, ActualName);
		        
		     // Verify sERVICEoRDERiD 
		        WebElement ServiceOrderID = driver.findElement(By.xpath("//span[@class='uiOutputText'][normalize-space()='3100025231227']"));
		        System.out.println("Element with text(): " + ServiceOrderID.getText() );
		     
		        String ActualName1 = driver.findElement(By.xpath("//span[@class='uiOutputText'][normalize-space()='3100025231227']")).getText().trim();
		        String ExpectedName1 = driver.findElement(By.xpath("//span[@class='uiOutputText'][normalize-space()='3100025231227']")).getText().trim();
		        System.out.println(ActualName1);
		        System.out.println(ExpectedName1);
		        assertEquals("3100025231227", ExpectedName1, ActualName1);
		        //Browser Back
		        driver.navigate().back();
		        //Select Field Service
		        driver.get("https://dominionenergyops--rls.sandbox.lightning.force.com/lightning/n/FSL__FieldService");
		        Thread.sleep(100000);
		        //Read the value Field Service
		        WebElement FieldService =driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/div/div/span/span"));
		        System.out.println("Element with text(): " + FieldService.getText() );
		        //Iframe
		        WebElement iframeElement=driver.findElement(By.xpath("//iframe[@title='Field Service']"));
		        driver.switchTo().frame(iframeElement);

		        //search resources web element
		        WebElement searchResource=driver.findElement(By.xpath("//input[@ng-model='searchEmployee']"));
		        searchResource.sendKeys("guru");

		        //search service appointment
		        WebElement serviceAppointment=driver.findElement(By.xpath("//input[@id='TaskSearchFilterInput']"));
		        serviceAppointment.sendKeys("SA-2953005");
		       Thread.sleep(5000);
               //driver.findElement(By.xpath("//button[@id=';SearchOnServer']")).click();
               //Search Technicaian Name
               //Drag and drop
               //Creating object of Actions class to build composite actions
               Actions builder = new Actions(driver);
               WebElement fromElement = driver.findElement(By.xpath("//*[@id=\"TaskListItems\"]/div[3]/div"));

               //WebElement to which the above object is dropped
               WebElement toElement = driver.findElement(By.xpath("//*[@id=\"GanttContainer\"]/div[2]/div[3]/div/div[2]/div/div[4]/div[2]"));
               //Building a drag and drop action
               //Perform drag and drop
               builder.dragAndDrop(fromElement, toElement).perform();

               
		        }
	}
		       
	}
	
