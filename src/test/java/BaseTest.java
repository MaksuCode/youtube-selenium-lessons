import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class BaseTest {

    protected WebDriver driver ;

    @BeforeAll
    public static void setUp(){
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
