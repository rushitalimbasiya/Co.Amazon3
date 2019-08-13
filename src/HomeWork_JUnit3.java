import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
/*3.	Amazon website, mouse hover on Department  Electronics & computers and taking to
 camera & photo page. Verifying with word 'Digital cameras'
a.	Gettext
b.	Hover ove*/

public class HomeWork_JUnit3 extends Util {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src\\Resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

        // for Hover over on Department
        moveOverMethod(By.xpath("//a[@id='nav-link-shopall']/span[2]"));
        moveOverMethod(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/a[11]/span"));
        // click on Electronics
        clickOnElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[2]/a[11]/span"));

        driver.manage().deleteAllCookies();
        clickOnElement(By.xpath("//div[@class='glow-toaster-footer']/span[1]/span/input[@class='a-button-input']"));

        //click on Camera & Photo
        clickOnElement(By.xpath("//span[@class='a-list-item']/a/span[contains(text(),'Camera & Photo')]"));

        // Verify Digital camera
        String expectedResult="Digital Cameras";
        String actualResult = driver.findElement(By.xpath("//span[contains(text(),'Digital Cameras')]")).getText();
        Assert.assertEquals(expectedResult,actualResult);

             driver.close();
        }


    }













