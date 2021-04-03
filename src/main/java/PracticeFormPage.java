import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage {

    private WebDriver driver ;
    private final By name = By.id("firstName");
    private final By lastName = By.id("lastName");
    private final By email = By.id("userEmail");

    public PracticeFormPage(WebDriver driver){
        this.driver = driver;
    }

    public void setName(String nameAsString){
        WebElement nameSpace = driver.findElement(name);
        nameSpace.click();
        nameSpace.sendKeys(nameAsString);
    }

    public void setLastName(String lastNameAsString){
        WebElement lastNameSpace = driver.findElement(lastName);
        lastNameSpace.click();
        lastNameSpace.sendKeys(lastNameAsString);
    }

    public void setEmail(String mailAddress){
        WebElement emailSpace = driver.findElement(email);
        emailSpace.click();
        emailSpace.sendKeys(mailAddress);
    }

    public String getName(){
        WebElement nameSpace = driver.findElement(name);
        return nameSpace.getAttribute("value");
    }

    public String getLastname(){
        WebElement lastNameSpace = driver.findElement(lastName);
        return lastNameSpace.getAttribute("value");
    }

    public String getEmail(){
        WebElement emailSpace = driver.findElement(email);
        return emailSpace.getAttribute("value");
    }




}
