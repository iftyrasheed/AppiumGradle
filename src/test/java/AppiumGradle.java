import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppiumGradle extends BaseClass{

    @Test
    public void AppiumBasics() {

        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();

        String AlertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(AlertTitle, "WiFi settings");

        driver.findElement(By.id("android:id/edit")).sendKeys("No internet");
        driver.findElements(By.className("android.widget.Button")).get(0).click();

    }
}
