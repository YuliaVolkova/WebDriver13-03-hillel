package HW_12;

import HW_12.configuration.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HW12_First_test extends BaseClass {
    static private final

     By byinputName = By.xpath("//*[@id=\"input-name-consultation\"]"),
    byinputeMail = By.xpath("//*[@id=\"input-email-consultation\"]"),
     byinputPhonenumber= By.xpath("//*[@id=\"input-tel-consultation\"]"),

    bysocialsInput= By.xpath("//*[@id=\"field-messenger-consultation\"]/div/div/div/div[2]/button[1]");

    static By name=By.name("tg");





    static private String mainURL = "https://ithillel.ua/";

    public static void main(String[] args) throws InterruptedException {
        driver.get(mainURL);
        driver.findElement(By.id("btn-consultation-hero")).click();


        WebElement inputElement = driver.findElement(byinputName);
        inputElement.sendKeys("Valera");


        WebElement inputMail = driver.findElement(byinputeMail);
        inputMail.sendKeys("dva@gmail.lk");

        WebElement inputPhone = driver.findElement(byinputPhonenumber);
        inputPhone.sendKeys("684563698");

        clickSocials();

        Thread.sleep(2000);
        driver.quit();


    }
    static private void clickSocials() {
        WebElement socialsInput= driver.findElement(bysocialsInput);
        socialsInput.click();



        WebElement socialsInputTG= driver.findElement(name);
        socialsInputTG.sendKeys("@WQ");

            }


        }






