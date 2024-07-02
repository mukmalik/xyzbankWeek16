package com.bank.steps;

import com.bank.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BankTest {
    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
    }

    @When("I click on Bank Manager Login tab")
    public void iClickOnBankManagerLoginTab() {
        new HomePage().clickOnBankManagerLoginTab();
    }

    @And("I click on Add Customer tab")
    public void iClickOnAddCustomerTab() {
        new BankManagerLoginPage().clickOnAddCustomerButton();
    }

    @And("Enter FirstName {string}")
    public void enterFirstName(String name) {
        new AddCustomerPage().enterFirstName(name);
    }

    @And("Enter LastName {string}")
    public void enterLastName(String name) {
        new AddCustomerPage().enterLastName(name);
    }

    @And("Enter Postcode {string}")
    public void enterPostcode(String code) {
        new AddCustomerPage().enterPostcode(code);
    }

    @And("click on Add Customer Button")
    public void clickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomerButton();
    }

    @And("popup display")
    public void popupDisplay() {
        new AddCustomerPage().popUpDisplay();
    }

    @Then("I can see message Customer added successfully")
    public void iCanSeeMessageCustomerAddedSuccessfully(String message) {
        new AddCustomerPage().verifyMessage(message);
    }

    @And("I click on OK button on pop up")
    public void iClickOnOKButtonOnPopUp() {
        new AddCustomerPage().clickOnPopUp();
    }

    @And("I click on Open Account tab")
    public void iClickOnOpenAccountTab() {
        new BankManagerLoginPage().clickOnOpenAccountButton();
    }
    @And("I search customer {string}")
    public void iSearchCustomer(String customer) {
        new OpenAccountPage().clickAndSelectCustomerFromDropDown(customer);
    }

    

    @And("I select currency {string}")
    public void iSelectCurrency(String currency) {
        new OpenAccountPage().clickAndSelectCurrencyFromDropDown(currency);

    }

    @And("I click on process button")
    public void iClickOnProcessButton() {
        new OpenAccountPage().clickOnProcessButton();
    }

    @Then("I can see message Account created successfully")
    public void iCanSeeMessageAccountCreatedSuccessfully() {
    }

    @When("I click on Customer Login tab")
    public void iClickOnCustomerLoginTab() {
        new HomePage().clickOnCustomerLoginTab();
    }

    @And("I click on Login Button")
    public void iClickOnLoginButton() {
        new CustomerLoginPage().clickOnLoginButton();
    }

    @Then("I can see Logout tab")
    public void iCanSeeLogoutTab() {
        new CustomerLoginPage().clickOnLoginButton();
    }

    @Then("I can see Your Name text displayed")
    public void iCanSeeYourNameTextDisplayed() {

    }

    @And("I click on Logout")
    public void iClickOnLogout() {
        new CustomerLoginPage().clickOnLogOut();
    }

    @And("I click on Deposit tab")
    public void iClickOnDepositTab() {
        new AccountPage().clickOnDepositTab();
    }

    @And("I enter amount {int}")
    public void iEnterDepositAmount(String depAmt) {
        new AccountPage().enterAmount(depAmt);
    }

    @And("I click on Deposit Button")
    public void iClickOnDepositButton() {
        new AccountPage().clickOnDepositeButton();
    }

    @Then("I can see message Deposit Successful")
    public void iCanSeeMessageDepositSuccessful() {
        Assert.assertEquals(new AccountPage().getTextDepositeSuccess(),"Deposit successful","Error");
    }

    @And("I click on Withdrawal tab")
    public void iClickOnWithdrawalTab() {
        new AccountPage().clickOnWithdrawalTab();
    }

    @And("I enter amount {int}")
    public void iEnterWithdrawAmount(String wthAmt) {
        new AccountPage().enterWithdrawAmount(wthAmt);

    }

    @And("I click on Withdraw button")
    public void iClickOnWithdrawButton(String amount) {
        new AccountPage().enterAmount(amount);
    }


    @Then("I can see message Transaction Successful")
    public void iCanSeeMessageTransactionSuccessful() {
        new AccountPage().verifyTextTransactionSuccess();
    }

    @And("Enter FirstName")
    public void enterFirstName() {

    }

    @And("Enter LastName")
    public void enterLastName() {

    }

    @And("Enter Postcode")
    public void enterPostcode() {

    }



}
