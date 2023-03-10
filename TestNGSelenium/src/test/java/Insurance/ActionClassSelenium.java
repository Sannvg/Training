package Insurance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionClassSelenium {
	//program for mouse actions using Action class
	public WebDriver driver;

	@BeforeMethod()
	public void getBrowser() {
		driver = new FirefoxDriver();
	}

	@Test(priority=1)
	public void mouseRightClick() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");		
		WebElement username = driver.findElement(By.id("user-name"));
		
		Actions actrc = new Actions(driver);
		actrc.contextClick(username).perform();//to perform mouse right click
	
		driver.close();
	}

	@Test(priority=2)
	public void mouseDoubleClick() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://seleniumbase.io/w3schools/double_click");
		
		WebElement iframe = driver.findElement(By.id("iframeResult"));		
		driver.switchTo().frame(iframe);//switching to the concerned frame
		
		WebElement weparagraph = driver.findElement(By.xpath("//p[contains(text(),'Double')]"));
		
		Actions actdc = new Actions(driver);
		actdc.doubleClick(weparagraph).perform();//to perform mouse double click
		driver.switchTo().defaultContent();//to switch to parent(previous) frame
			
		driver.findElement(By.id("runbtn")).click();		
		
		driver.close();
	}

	@Test(priority=3)
	public void mouseHover() throws InterruptedException {
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
		WebElement weElectronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
		
		Actions mhover = new Actions(driver);
		mhover.moveToElement(weElectronics).perform();//to perform mouse hover on a web element
		Thread.sleep(2000);
		
		WebElement weCamera = driver.findElement(By.xpath("//a[text()='Cameras & Accessories']"));
		new Actions(driver).moveToElement(weCamera).perform();
		weCamera.click();
	
		//Assert.assertEquals(true, driver.findElement(By.xpath("//h1[text()='Cameras']")).isDisplayed());
		driver.close();
	}

	@Test(priority=4)
	public void mouseDragnDrop() throws InterruptedException {
		driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
		
		WebElement wedrag = driver.findElement(By.id("draggable"));
		WebElement wedrop = driver.findElement(By.id("droppable"));
				
		Actions mdragdrop = new Actions(driver);
		mdragdrop.dragAndDrop(wedrag, wedrop).perform();//to drag an element and drop
		
		Assert.assertSame("Dropped!", driver.findElement(By.xpath("//p[text()='Dropped!']")).getText());
		
		driver.close();
	}

}
