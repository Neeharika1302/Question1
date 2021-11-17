import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Question1Script1 {

	public static void main(String[] args) throws InterruptedException {
		
        ChromeOptions option=new ChromeOptions();
        option.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://www.eazydiner.com/");
        Thread.sleep(1000);
        driver.findElement(By.id("srchbar")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Abu Dhabi")).click();
        Thread.sleep(1000);
        WebElement element=driver.findElement(By.id("home-search"));
        element.sendKeys("Barbeque nation");
        Thread.sleep(1000);
        element.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Al Wahda Mall, Al Wahda']")).click();
        Thread.sleep(1000);
        System.out.println("Hotel name is "+ driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/div[2]/div[1]/div[1]/h2")).getText()+ " at "
        +driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/span")).getText());
        driver.findElement(By.xpath("//*[@id='eazy-booking']/div/div/div/div/ul/li[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[18]/div/table/tbody/tr[5]/td[1]/button")).click();
        driver.findElement(By.xpath("//*[@id='eazy-booking']/div/div/div/div/ul/li[2]/select/option[4]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='slotForm']/div/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#guest_name")).sendKeys("Neeharika");
        driver.findElement(By.cssSelector("#guest_email")).sendKeys("pneeharika2000@gmail.com");
        WebElement element1=driver.findElement(By.xpath("//*[@id='guest-form']/div/div[2]/div/div/div/div"));
        element1.click();
        Thread.sleep(1000);
        element1.sendKeys(Keys.ARROW_UP,Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='guest-form']/div/div[2]/div/div/input")).sendKeys("9876543223");
        
	}

}
