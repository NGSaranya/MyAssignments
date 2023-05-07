package week2.day1.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateEditDuplicateLeadTc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HSV");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Januu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("HSJA");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("saraJA");
		driver.findElement(By.name("departmentName")).sendKeys("Infant");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I am a S/w Test");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ja@c.com");
		WebElement findElementState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateOptions = new Select(findElementState);
		stateOptions.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println("Page Title:"+title);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("I am a S/w Tester");
		driver.findElement(By.name("submitButton")).click();
		String title1 = driver.getTitle();
		System.out.println("View Page Title:"+title1);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("JAN");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sara");
		driver.findElement(By.name("submitButton")).click();
		String title2 = driver.getTitle();
		System.out.println("View Page Title:"+title2);
		
		
		

	}

}
