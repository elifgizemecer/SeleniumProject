package com.testinium.methods;
import com.testinium.driver.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import java.util.NoSuchElementException;
public class Methods {
    WebDriver driver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsDriver;
    public Methods(){
        driver= BaseTest.driver;
        wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);

        jsDriver = (JavascriptExecutor) driver;
    }
    public void click(By by){
        findElement(by).click();
    }
    public void waitBySecond(long seconds){
        try {
            Thread.sleep(seconds * 1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void sendKeys(By by, String text){
        findElement(by).sendKeys(text);
    }
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,950)", "");
    }
    public void scrollDown2(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
    }
    public void selectByText(By by, String text){
        getSelect(by).selectByVisibleText(text);
    }
    public boolean isElementVisible(By by) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public WebElement findElement(By by){
        return wait
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }
    public Select getSelect(By by){
        return new Select(findElement(by));
    }

}
