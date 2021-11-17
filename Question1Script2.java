import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Question1Script2 {

	public static void main(String[] args) throws InterruptedException {
		    ChromeOptions option=new ChromeOptions();
	        option.addArguments("--disable-notifications");
	        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver(option);
	        driver.get("https://www.eazydiner.com/");
	        WebElement mouse = driver.findElement(By.xpath("//*[text()='About Us']"));
	        Actions action = new Actions(driver);
		    action.moveToElement(mouse).click().build().perform();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[text()='About Us']")).click();
		    System.out.println("Title of about us page '"+driver.getTitle()+"'");
		    System.out.println("first FAQ is \n"+driver.findElement(By.xpath("/html/body/div[8]/div[1]/div[2]/div/h2[2]")).getText());
		    System.out.println(driver.findElement(By.xpath("/html/body/div[8]/div[1]/div[2]/div/p[20]")).getText());

	}

}
