import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SharelaneRegistrationTest extends BaseTest {

    @Test
    public void fiveDigitsZipCodeTest() {
        // Open register page https://www.sharelane.com/cgi-bin/register.py
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        // Input five digits to zip code field
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        driver.navigate().refresh();
        // Click Continue button
        driver.findElement(By.cssSelector("[value='Continue']")).click();
        driver.findElement(By.cssSelector("[value='Continue']")).click();
        // Check Register button
        WebElement registerButton = driver.findElement(By.cssSelector("[value='Register']"));
        Assert.assertTrue(registerButton.isDisplayed(), "Register button isn't displayed");

//    @Test public void cookiesDemoTest() {
//        driver.get("");
//        Set<Cookie>
//        }

        }
    @Test
    public void loginSwagLabsTest() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standrat");
        driver.findElement(By.id("password")).sendKeys("standrat");
        driver.findElement(By.id("user-name")).sendKeys("standrat");
        System.out.println("");


    }

    //эмуляция клавиатуры
    @Test
    public void inputTest() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.findElement(By.cssSelector("[Type}")).sendKeys(Keys.ARROW_UP);
        System.out.println("");

    }




}
