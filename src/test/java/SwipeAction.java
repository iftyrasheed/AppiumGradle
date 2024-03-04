import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwipeAction extends BaseClass{
    @Test
    public void SwipeMethod(){
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();

        WebElement ImageToGetSwiped = driver.findElement(By.xpath("//android.widget.ImageView[3]"));


        Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[1]")).getAttribute("focusable"),
                "true");

        //Swipe


        SwipeAction(ImageToGetSwiped, "left");



        Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[3]")).getAttribute("focusable"),
                "true");


    }
}
