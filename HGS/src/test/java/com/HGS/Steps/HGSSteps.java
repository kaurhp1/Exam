package com.HGS.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class HGSSteps {
    WebDriver driver = new ChromeDriver();
    @Given("I am on the HGS homepage")
    public void i_am_on_the_hgs_homepage() {

        driver.manage().window().maximize();
        driver.get("https://www.herschel.slough.sch.uk/");

    }

    //@When("I enter term dates in the search button")
    public void i_enter_term_dates_in_the_search_button() {

       // driver.findElement(By.xpath("//*[@id=\"mainNav\"]/ul/li[4]/a")).click();
        //driver.findElement(By.xpath("//*[@id=\"mainNav\"]/ul/li[4]/ul/div/div[1]/li[1]/a")).click();
        //driver.findElement(By.xpath("//*[@id=\"mainInner\"]/div/div[1]/div[1]/div/div[2]/ul/li[1]/a")).click();
        //driver.findElement(By.xpath("//*[@id=\"searchBox\"]/div/form/input")).sendKeys("term dates");
        //driver.findElement(By.xpath("//*[@id=\"searchBox\"]/div/form/input")).sendKeys(keys.enter);
        //driver.findElement(By.id("Value")).sendKeys(Keys.ENTER);
        //driver.findElement(By.xpath("//*[@id=\"searchBox\"]/div/form/input")).sendKeys(Keys.ENTER);

        //driver.findElement(By.id("Value")).sendKeys(Keys.ENTER)
        //driver.findElement(By.xpath("//*[@id=\"mainHeadInner\"]/div[2]/div[1]/a[2]/i")).click();


    }


    @When("I enter term  dates in the search box")
    public void i_enter_term_dates_in_the_search_box() {
        driver.findElement(By.xpath("//*[@id=\"mainNav\"]/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"mainNav\"]/ul/li[4]/ul/div/div[1]/li[1]/a")).click();
    }
    @When("I click on the enter button")
    public void i_click_on_the_enter_button() {

    }
 @Then("it should displaythe link for term dates")
 {

 }
}
******************************
WebDriver driver = new ChromeDriver();
@Given("I am on the HGS homepage")
public void i_am_on_the_hgs_homepage() {
    driver.manage().window().maximize();
    driver.get("https://www.herschel.slough.sch.uk/");
}
@When("I enter term  dates in the search box")
public void i_enter_term_dates_in_the_search_box() {

}
@When("I click on the enter button")
public void i_click_on_the_enter_button() {

}
@Then("It should display the link for Term dates as a result Title")
public void it_should_display_the_link_for_term_dates_as_a_result_title() {

}
