package DefAndImpl;

import Utils.CommonUtils;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class TreeStepImpl extends CommonUtils {


    public void setupConfigrationForTreefeApp(String caps1 , String appPackage, String appActivity) throws MalformedURLException {
        Map<String,String> map=new HashMap<>();
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
       map.put("automationName", "UiAutomator2");
        map.put("deviceName", "Pixel 8 Pro API 34");
      // map.put("platformName", "Android");
        map.put("platformVersion", "14");
        map.put("appPackage",appPackage);  // com.android.dialer
        map.put("appActivity",appActivity); //".main.impl.MainActivity"

        desiredCapabilities.setCapability("appium:options",map);
      desiredCapabilities.setCapability("platformName","Android");
//        desiredCapabilities.setCapability("automationName", "UiAutomator2");

        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),desiredCapabilities);

        CommonUtils.androidDriver.set(driver);
    }

    public void  open_treefe_app_and_click_icon() throws InterruptedException {

        ////android.widget.Button[@resource-id="com.android.permissioncontroller:id/permission_allow_button"]
        CommonUtils.androidDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();

        CommonUtils.androidDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.Button[@content-desc=\"Skip\"]")).click();

        // continue with google
        CommonUtils.androidDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Continue with Google\"]")).click();


        // choose kishan pandey account
        CommonUtils.androidDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        CommonUtils.androidDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        CommonUtils.androidDriver.get().findElement(By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.google.android.gms:id/container\"])[1]/android.widget.LinearLayout")).click();
         // click on + bottom navbar
        CommonUtils.androidDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        CommonUtils.androidDriver.get().findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[6]")).click();
        Thread.sleep(3000);
    }

    public void quit_the_app_driver()
    {
       CommonUtils.androidDriver.get().quit();
    }
}
