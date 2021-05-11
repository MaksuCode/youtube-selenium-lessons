import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenderSection extends BasePage {

    private final By maleLabelLocator = new By.ByCssSelector("label[for='gender-radio-1']");
    private final By femaleLabelLocator =new By.ByCssSelector("label[for='gender-radio-2']");
    private final By otherLabelLocator = new By.ByCssSelector("label[for='gender-radio-3']");

    private final By maleRadiotButtonLocator = By.id("gender-radio-1");
    private final By femaleRadiotButtonLocator = By.id("gender-radio-2");
    private final By otherRadioButtonLocator = By.id("gender-radio-3");

    public enum Genders {MALE , FEMALE , OTHER}

    public GenderSection(WebDriver driver){
        super(driver);
    }

    public void clickRadioButton(Genders gender){
        switch (gender) {
            case FEMALE:
                click(femaleLabelLocator);
                break;
            case MALE :
                click(maleLabelLocator);
                break;
            case OTHER :
                click(otherLabelLocator);
                break;
        }
    }

    public boolean isRadioButtonChecked(Genders gender){
        boolean isChecked = false ;
        switch (gender){
            case FEMALE:
                isChecked = isSelected(femaleRadiotButtonLocator);
                break;
            case MALE:
                isChecked = isSelected(maleRadiotButtonLocator);
                break;
            case OTHER:
                isChecked = isSelected(otherRadioButtonLocator);
                break;
        }
        return isChecked ;
    }
}
