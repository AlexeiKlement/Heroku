package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AddDeleteTest extends BaseTest {
    @Test
    public void addRemoveTest() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Delete']")).click();
        assertEquals(driver.findElements(By.xpath("//button[text()='Delete']")).size(), 1);
    }
}