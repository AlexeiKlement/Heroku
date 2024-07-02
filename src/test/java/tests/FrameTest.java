package tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class FrameTest extends BaseTest {
    @Test
    public void IframeTest() {
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        assertEquals(driver.findElement(By.id("tinymce")).getText(), "Your content goes here.");
    }
}