package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.openqa.selenium.Keys.ARROW_DOWN;
import static org.openqa.selenium.Keys.ARROW_UP;
import static org.testng.Assert.assertEquals;

public class InputTest extends BaseTest {
    @Test
    public void inputTest_1() {
        driver.get("https://the-internet.herokuapp.com/inputs");
        driver.findElement(By.cssSelector("[type=number]")).sendKeys(ARROW_UP, ARROW_UP);
        driver.findElement(By.cssSelector("[type=number]")).getAttribute("value");
        assertEquals(driver.findElement(By.cssSelector("[type=number]")).getAttribute("value"), "2");
    }

    @Test
    public void inputTests_2() {
        driver.get("https://the-internet.herokuapp.com/inputs");
        driver.findElement(By.cssSelector("[type=number]")).sendKeys(ARROW_DOWN);
        driver.findElement(By.cssSelector("[type=number]")).getAttribute("value");
        assertEquals(driver.findElement(By.cssSelector("[type=number]")).getAttribute("value"), "-1");
    }

    @Test
    public void inputTests_3() {
        driver.get("https://the-internet.herokuapp.com/inputs");
        driver.findElement(By.cssSelector("[type=number]")).sendKeys("password");
        driver.findElement(By.cssSelector("[type=number]")).getAttribute("value");
        assertEquals(driver.findElement(By.cssSelector("[type=number]")).getAttribute("value"), "");
    }
}