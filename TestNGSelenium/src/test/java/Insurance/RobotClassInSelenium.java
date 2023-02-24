package Insurance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RobotClassInSelenium {
//program using robot class methods
	public WebDriver driver;

	@BeforeTest
	public void loadBrowser() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(
				"http://alamowg.weebly.com/uploads/9/2/9/2/9292252/i-am-malala-pdf-book-by-malala-downloaded-4m-pakistanifun.commalala-yousafzai-christina-lamb.pdf");
		}

	@Test
	public void fileDownload() throws InterruptedException, AWTException {
		// driver.findElement(By.xpath("//button[@id='download']")).click();
		Robot rbFileDownload = new Robot();
		rbFileDownload.keyPress(KeyEvent.VK_CONTROL);//to press Ctrl + S for saving
		rbFileDownload.keyPress(KeyEvent.VK_S);
		
		rbFileDownload.keyRelease(KeyEvent.VK_CONTROL);//after the keypress, we need to release the keys
		rbFileDownload.keyRelease(KeyEvent.VK_S);
		
		
		rbFileDownload.keyPress(KeyEvent.VK_ENTER);//to press the enter button
		rbFileDownload.keyRelease(KeyEvent.VK_ENTER);

	}

	@AfterTest
	public void closeBrowser() throws InterruptedException {
		driver.close();
	}
}
