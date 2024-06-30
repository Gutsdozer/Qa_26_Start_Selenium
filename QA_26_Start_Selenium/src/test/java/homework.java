import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.reporters.XMLConstants;

import java.sql.SQLOutput;

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
      WebElement a1 = wd.findElement(By.cssSelector("a"));

      WebElement button = wd.findElement(By.xpath("//button"));
      WebElement a2 = wd.findElement(By.xpath("//a"));

      //by class
      WebElement login = wd.findElement(By.className("login_login__3EHKB"));
      WebElement login1 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
      WebElement login2 = wd.findElement(By.xpath("//*[@class = 'login_login__3EHKB']"));
      WebElement login3 = wd.findElement(By.xpath("//*[@class = 'login_login__3EHKB']"));


      //by attribute
      WebElement home = wd.findElement(By.cssSelector("[href = '/home']"));
      WebElement home1 = wd.findElement(By.xpath("//*[@href = '/home']"));

      //by id
      WebElement ebo = wd.findElement(By.id("root"));
      WebElement ebo1 = wd.findElement(By.cssSelector("#root"));
      WebElement ebo2 = wd.findElement(By.xpath("//*[@id = 'root']"));
      WebElement ebo3 = wd.findElement(By.xpath("//*[starts-with(@id, 'ro') ]"));
      WebElement el50 = wd.findElement(By.cssSelector("[placeholder*='ss']"));
      WebElement el53 = wd.findElement(By.xpath("//*[contains(@placeholder,'ss')]"));
  }

   @Test
   public void classwork2(){
    WebElement loginButton = wd.findElement(By.cssSelector("[name = 'login']"));
    String text = loginButton.getText();
     System.out.println(text);

     WebElement form = wd.findElement(By.xpath("//form"));
     String textForm = form.getText();
     System.out.println("**********");
     System.out.println(textForm);

     WebElement html = wd.findElement(By.tagName("html"));
     String textAll = html.getText();
     System.out.println("*********");
     System.out.println(textAll);

     WebElement br = wd.findElement(By.tagName("br"));
     System.out.println("text br --->" + br.getText());

   }



    @Test
  public void classWork(){
      //parent
      WebElement par = wd.findElement(By.xpath("//h1/parent::div"));
      WebElement par1 = wd.findElement(By.xpath("//h1/parent::*"));
      WebElement par2 = wd.findElement(By.xpath("//h1/.."));

      //ancestor
      WebElement el3 = wd.findElement(By.xpath("//h1/ancestor::*"));//all
      WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::div"));//two options
      WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div[2]"));//one option

      //ancestor or self
      WebElement el6 = wd.findElement(By.xpath("//h1/ancestor-or-self::*"));

      //preceding-sibling
      WebElement el7 = wd.findElement(By.xpath("//a[last()]/preceding-sibling::a[2]"));
    }


  //@AfterClass
    //public void quit(){
      //wd.quit();
  //}
}
