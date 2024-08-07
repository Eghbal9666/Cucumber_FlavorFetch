package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import pages.MerchantLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_019_Stepdefinition {
    MerchantLoginPage merchantLoginPage = new MerchantLoginPage();
    Faker faker = new Faker();
    String fackName = faker.name().fullName();
    String fackPass = faker.internet().password();

    @Given("The user opens the browser.")
    public void the_user_opens_the_browser() {
        Driver.getDriver().get("about: blank");
    }

    @Then("Enters the URL.")
    public void Enters_the_URL() {
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
    }

    @Then("Verify correctness the url of page.")
    public void verify_correctness_the_url_of_page() {
        String expectedURL = ConfigReader.getProperty("urlTitle");
        String actualUrl = merchantLoginPage.titleOfLoginPage.getText();
        Assertions.assertEquals(expectedURL, actualUrl);
    }

    @Then("Verify the presence of the {string} text.")
    public void verify_the_presence_of_the_text(String urlTitle) {
        Assertions.assertTrue(merchantLoginPage.titleOfLoginPage.isDisplayed());
    }

    @Then("The user closes the page.")
    public void the_user_closes_the_page() {
        Driver.quitDriver();
    }

    @When("Verify the presence of the username box.")
    public void verify_the_presence_of_the_username_box() {
        Assertions.assertTrue(merchantLoginPage.userBoxMerchantLogin.isDisplayed());
    }

    @When("Verify the presence of the password box.")
    public void verify_the_presence_of_the_password_box() {
        Assertions.assertTrue(merchantLoginPage.passwordBoxMerchantLogin.isDisplayed());
    }

    @Then("Verify the presence of the sign in button.")
    public void verify_the_presence_of_the_sign_in_button() {
        Assertions.assertTrue(merchantLoginPage.signInButtonMerchantLogin.isDisplayed());
    }

    @Then("Verify the presence of the {string} text in the username box background.")
    public void verify_the_presence_of_the_text_in_the_username_box_background(String string) {
        Assertions.assertTrue(merchantLoginPage.backgroundUserBox.isDisplayed());
    }

    @Then("enter a text in the username box.")
    public void enter_a_text_in_the_username_box() {
        merchantLoginPage.userBoxMerchantLogin.sendKeys(fackName);
    }

    @Then("Delete the written letters from the username box.")
    public void delete_the_written_letters_from_the_username_box() {
        merchantLoginPage.textEnteredUserBox.clear();
    }

    @Then("Verify absence the written lettrs from the username box.")
    public void verify_absence_the_written_lettrs_from_the_username_box() {
        Assertions.assertFalse(merchantLoginPage.textEnteredUserBox.isDisplayed());
    }

    @Then("Verify the presence of the {string} text in the password box in the background.")
    public void verify_the_presence_of_the_text_in_the_password_box_in_the_background(String expectedBackText) {
        expectedBackText = ConfigReader.getProperty("passBoxBackText");
        String actualBackText = merchantLoginPage.backgroundPassBox.getText();
        Assertions.assertEquals(expectedBackText, actualBackText);
    }

    @Then("Verify the presence of the {string} text in the password box in the background.")
    public void verify_the_presence_of_the_text_in_the_password_box_in_the_background(WebElement expectedEyeAsign) {
        Assertions.assertTrue(merchantLoginPage.backgroundPassBox.isDisplayed());
    }

    @When("Enter a text in the password box")
    public void Enter_a_text_in_the_password_box() {
        merchantLoginPage.userBoxMerchantLogin.sendKeys(fackPass);
    }

    @Then("Delete the written letters from the password box.")
    public void delete_the_written_letters_from_the_password_box() {
        merchantLoginPage.passwordPlaceHolder.clear();
    }

    @Then("Verify absence the written lettrs from the password box.")
    public void verify_absence_the_written_lettrs_from_the_password_box() {
        Assertions.assertFalse(merchantLoginPage.passwordPlaceHolder.isDisplayed());
    }
    @Then("Verify the letters are shown by dotes.")
    public void verify_the_letters_are_shown_by_dotes() {
        char[] arrCh = (merchantLoginPage.passwordPlaceHolder.getText()).toCharArray();
        char actualLetter = ' ';
        for (char each : arrCh) {
            actualLetter = each;
        }
        int n = Integer.parseInt(String.valueOf(actualLetter));
        int expectedLetter = 46;
        Assertions.assertEquals(expectedLetter, actualLetter);
    }

    @Then("Click on the eyeAsign.")
    public void click_on_the_eyeAsign (){
merchantLoginPage.eyeAsignInPasswordBox.click();
    }

    @Then("Verify the presence of the eyeAsign in the password box.")
    public void verify_the_presence_of_the_eyeAsign_in_the_password_box(){
Assertions.assertTrue(merchantLoginPage.eyeAsignInPasswordBox.isDisplayed());
    }
    @Then("Verify the presence of the eyeAsign with a Line on it in the password box.")
    public void Verify_the_presence_of_the_eyeAsign_with_a_Line_on_it_in_the_password_box(){
Assertions.assertTrue(merchantLoginPage.eyeAsignWithALine.isDisplayed());
    }

    @Then("Verify visibility of the written letters in the password box.")
    public void verify_visibility_of_the_written_letters_in_the_password_box() {
Assertions.assertTrue(merchantLoginPage.passwordPlaceHolder.isDisplayed());
    }

    @Then("Verify correctness of password.")
    public void verify_correctness_of_password() {
String expectedPass=fackPass;
String actualPass=merchantLoginPage.passwordPlaceHolder.getText();
Assertions.assertEquals(expectedPass,actualPass);
    }


}
