package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TyposTest extends BaseTest {
    @Test
    public void typosTest1() {
        driver.get("https://the-internet.herokuapp.com/typos");
        assertEquals(driver.findElement(By.xpath("//p[text()='This example demonstrates a typo being introduced. It does it randomly on each page load.']")).getText(), "This example demonstrates a typo being introduced. It does it randomly on each page load.");
    }

    @Test
    public void typosTest2() {
        driver.get("https://the-internet.herokuapp.com/typos");
        driver.navigate().refresh();
        driver.navigate().refresh();
        driver.navigate().refresh();
        assertEquals(driver.findElement(By.xpath("//p [2]")).getText(), "Sometimes you'll see a typo, other times you won't.");
    }

    @Test
    public void typosTest3() {
        driver.get("https://the-internet.herokuapp.com/typos");
        assertEquals(driver.findElement(By.xpath("//p [2]")).getText(), "Sometimes you'll see a typo, other times you won,t.");
    }
}