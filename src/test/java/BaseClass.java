import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseClass {

    AndroidDriver driver;

    @BeforeClass
    public void ConfigureAppium() throws MalformedURLException
    {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Iftysdevice");
        options.setApp("C:\\Coding practice\\Proj3\\AppiumGradle\\src\\test\\resources\\ApiDemos-debug.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), (Capabilities) options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void LongPressAction(WebElement ele){

        ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
                ImmutableMap.of("elementId", ((RemoteWebElement)ele).getId(),
                        "duration", 2000));
    }
    

    public void SwipeAction(WebElement ele, String direction){
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement)ele).getId(),
                "direction", direction,
                "percent", 0.75
        ));
    }

    @AfterClass
    public void TearDown()
    {
        driver.quit();
    }

}
