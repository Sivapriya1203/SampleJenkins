package LoginDevices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngExample {
    @Test
    public void test1(){
        System.out.println("Hello TestNG");
    }
    @Test
    public void test2(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Hello TestNG 2");
    }
}
