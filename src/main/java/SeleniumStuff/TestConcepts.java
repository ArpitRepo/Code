package SeleniumStuff;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.FileHandler;

public class TestConcepts {
static WebDriver driver =null;

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver" , "/Users/arpit/IdeaProjects/Utils/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5j0bx521tf_e&adgrpid=150668181581&hvpone=&hvptwo=&hvadid=674842289449&hvpos=&hvnetw=g&hvrand=8649000327394163985&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9153978&hvtargid=kwd-10544572015&hydadcr=5621_2359492&gad_source=1");
    /*    driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
*/


WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));


try{
    JavascriptExecutor js = (JavascriptExecutor) driver;
   // js.executeScript("argument[0].click()",ele);
js.executeScript("arguments[0].click();", ele);


    File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    File destFile = new File("/Users/arpit/IdeaProjects/Utils/src/main/OutputResources/Sample.png");
    Files.copy(f.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
}catch(Exception e)
{
    e.printStackTrace();
}
finally {
    driver.quit();
}



    }


}
