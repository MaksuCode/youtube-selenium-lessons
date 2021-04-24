import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenderSection {

    private WebDriver driver;
    private final By maleRadioButton = new By.ByCssSelector("label[for='gender-radio-1']");
    private final By femaleRadioButton =new By.ByCssSelector("label[for='gender-radio-2']");
    private final By otherRadioButton = new By.ByCssSelector("label[for='gender-radio-3']");

    public enum Genders {MALE , FEMALE , OTHER}

    public GenderSection(WebDriver driver){
        this.driver = driver;
    }

    public void clickRadioButton(Genders gender){
        switch (gender) {
            case FEMALE:
                driver.findElement(femaleRadioButton).click();
                break;
            case MALE :
                driver.findElement(maleRadioButton).click();
                break;
            case OTHER :
                driver.findElement(otherRadioButton).click();
                break;
        }
    }

    public boolean isRadioButtonChecked(Genders genders){
        return true;
    }
}
