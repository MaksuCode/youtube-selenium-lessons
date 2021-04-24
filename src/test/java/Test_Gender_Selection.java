import org.junit.jupiter.api.Test;

public class Test_Gender_Selection extends BaseTest{

    @Test
    public void check_male_radio_button(){
        practiceFormPage.genderSection().clickRadioButton(GenderSection.Genders.MALE);
    }

    @Test
    public void check_female_radio_button(){
        practiceFormPage.genderSection().clickRadioButton(GenderSection.Genders.FEMALE);
    }

    @Test
    public void check_other_radio_button(){
        practiceFormPage.genderSection().clickRadioButton(GenderSection.Genders.OTHER);
    }


}
