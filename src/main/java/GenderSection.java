import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenderSection {

    private WebDriver driver;
    private final By maleRadioLabel = new By.ByCssSelector("label[for='gender-radio-1']");
    private final By femaleRadioLabel =new By.ByCssSelector("label[for='gender-radio-2']");
    private final By otherRadioLabel = new By.ByCssSelector("label[for='gender-radio-3']");

    private final By maleRadiotButton = By.id("gender-radio-1");
    private final By femaleRadiotButton = By.id("gender-radio-2");
    private final By otherRadiotButton = By.id("gender-radio-3");

    public enum Genders {MALE , FEMALE , OTHER}

    public GenderSection(WebDriver driver){
        this.driver = driver;
    }

    public void clickRadioButton(Genders gender){
        switch (gender) {
            case FEMALE:
                driver.findElement(femaleRadioLabel).click();
                break;
            case MALE :
                driver.findElement(maleRadioLabel).click();
                break;
            case OTHER :
                driver.findElement(otherRadioLabel).click();
                break;
        }
    }

    public boolean isRadioButtonChecked(Genders gender){
        boolean isChecked = false ;
        switch (gender){
            case FEMALE:
                isChecked = driver.findElement(femaleRadiotButton).isSelected();
                break;
            case MALE:
                isChecked = driver.findElement(maleRadiotButton).isSelected();
                break;
            case OTHER:
                isChecked = driver.findElement(otherRadiotButton).isSelected();
                break;
        }
        return isChecked ;
    }
}
