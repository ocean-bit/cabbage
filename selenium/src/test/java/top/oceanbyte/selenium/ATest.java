package top.oceanbyte.selenium;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ATest {
    static WebDriver driver = null;

    @BeforeAll
    static void beforeAll(){
        System.setProperty("webdriver.chrome.driver", "/Users/ocean/Downloads/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MICROSECONDS);
    }

    @AfterAll
    static void afterAll(){
        driver.quit();
    }

    @Test
    void a() throws InterruptedException {
        // 打开google搜索
        driver.get("http://www.google.com/");
        Thread.sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        Thread.sleep(5000);  // Let the user actually see something!

    }

    @Test
    void b() throws InterruptedException {
        // Test name: baidu
        // Step # | name | target | value
        // 1 | open | / |
        driver.get("https://www.baidu.com/");
        // 2 | setWindowSize | 1147x528 |
        driver.manage().window().setSize(new Dimension(1147, 528));
        // 3 | type | id=kw | java neicunxielou
        driver.findElement(By.id("kw")).sendKeys("java neicunxielou");
        // 4 | sendKeys | id=kw | ${KEY_ENTER}
        driver.findElement(By.id("kw")).sendKeys(Keys.ENTER);
    }
}
