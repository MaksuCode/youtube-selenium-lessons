import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_Lastname_Email extends BaseTest{


    @Test
    public void setName() {
        practiceFormPage.setName("Mustafa");
        Assertions.assertEquals("Mustafa",practiceFormPage.getName() , "Name value is not correct!");
    }

    @Test
    public void setLastName(){
        practiceFormPage.setLastName("Aksu");
        Assertions.assertEquals("Aksu",practiceFormPage.getLastname(), "Last name value is not correct!");
    }

    @Test
    public void setEmail(){
        practiceFormPage.setEmail("mustafa123@gmail.com");
        Assertions.assertEquals("mustafa123@gmail.com",practiceFormPage.getEmail(), "Last name value is not correct!");
    }

}
