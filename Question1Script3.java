import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Question1Script3 {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
        option.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://www.eazydiner.com/");
        driver.findElement(By.id("help")).click();
        System.out.println("Title of about us page '"+driver.getTitle()+"'");
        System.out.println("CONTACT DETAILS");
        System.out.println(driver.findElement(By.xpath("/html/body/div[8]/div[1]/div[2]/div")).getText());

	}

}
