package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class DropdownTest extends BaseTest {
    @Test
    public void dropdownTest() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        select.selectByIndex(1);
        assertTrue(select.getFirstSelectedOption().isSelected());
    }
}
