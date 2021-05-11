import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected WebDriver driver ;

    @BeforeAll
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        System.out.println("Test initiated.");
    }

    @BeforeEach
    public void beforeMethod(){
        driver = new ChromeDriver();
    }

    @AfterEach
    public void afterMethod(){
        driver.quit();
    }


//    @AfterAll
//    public void tearDown(){
//        driver.quit();
//        System.out.println("Test finished.");
//    }





}
