import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.annotations.Test;

public class Miscellaneous extends BaseClass{

    @Test
    public void miscellaneous(){
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
        // roatate phone //

        DeviceRotation rotationLandscape = new DeviceRotation(0, 0, 90);
        driver.rotate(rotationLandscape);

        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();

        // clipboard copy paste //

        driver.setClipboardText("No internet");
        driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
        // pressKey function

        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.pressKey(new KeyEvent(AndroidKey.HOME));

        
    }
}
