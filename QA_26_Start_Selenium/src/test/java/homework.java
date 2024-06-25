import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class homework {

  WebDriver wd;

  @BeforeClass
    public void setUp(){
      wd = new ChromeDriver();
      wd.navigate().to("https://telranedu.web.app/login");
  }

  @Test
    public void searching(){
     //by tagName
      WebElement div = wd.findElement(By.tagName("div"));
      WebElement a = wd.findElement(By.tagName("a"));

      //by class
      WebElement login = wd.findElement(By.className("login_login__3EHKB"));
      WebElement login1 = wd.findElement(By.cssSelector(".login_login__3EHKB"));

      //by attribute
      WebElement home = wd.findElement(By.cssSelector("[href = '/home']"));
  }


  @AfterClass
    public void quit(){
      wd.quit();
  }
}
