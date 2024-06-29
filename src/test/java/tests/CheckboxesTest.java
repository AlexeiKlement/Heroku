package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckboxesTest extends BaseTest {
    @Test
    public void the_first_checkbox_is_not_activ() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.findElement(By.cssSelector("[type=checkbox]"));
        assertFalse(driver.findElement(By.cssSelector("[type=checkbox]")).isSelected());
    }

    @Test
    public void the_first_checkbox_activ() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.findElement(By.cssSelector("[type=checkbox]")).click();
        assertTrue(driver.findElement(By.cssSelector("[type=checkbox]")).isSelected());
    }

    @Test
    public void the_second_checkbox_is_active() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.findElement(By.xpath("//*[@type='checkbox'][2]"));
        assertTrue(driver.findElement(By.xpath("//*[@type='checkbox'][2]")).isSelected());
    }

    @Test
    public void the_second_checkbox_is_not_active() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.findElement(By.xpath("//*[@type='checkbox'][2]")).click();
        assertFalse(driver.findElement(By.xpath("//*[@type='checkbox'][2]")).isSelected());
    }
}
