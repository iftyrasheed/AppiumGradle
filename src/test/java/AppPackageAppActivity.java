import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

public class AppPackageAppActivity extends BaseClass{

    @Test
    public void PackageAndActivity(){

        // opening app with package and activity //

        Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.preference" +
                ".PreferenceDependencies");

        ((JavascriptExecutor) driver).executeScript("mobile: startActivity", ImmutableMap.of("intent", "io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies"));

        driver.findElement(By.className("android.widget.RelativeLayout")).click();
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        driver.findElement(By.id("android:id/edit")).sendKeys("HabiJabi");
        driver.findElement(By.id("android:id/button2")).click();

        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }
}
