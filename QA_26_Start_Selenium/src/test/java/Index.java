import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/User/Desktop/Tel-Ran/Auto/21.index.html");
    }

    @Test
    public void tableTest(){
        //Canada
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3) td:last-child"));
        Assert.assertEquals(canada.getText(),"Canada");

        WebElement america = wd.findElement(By.cssSelector("tr:nth-child(1) th:nth-child(3)"));
        Assert.assertEquals(america.getText(), "America");


    }



    @Test
public void cssLocators(){
        //by tagName
    WebElement button =  wd.findElement(By.tagName("button"));
    WebElement button1 = wd.findElement(By.cssSelector("button"));
    List<WebElement> a = wd.findElements(By.tagName("a"));
    List<WebElement> list = wd.findElements(By.tagName("a"));

    //a.size();
    WebElement input = wd.findElement(By.tagName("input"));
    WebElement input1 = wd.findElement(By.cssSelector("a"));

    //by class
    WebElement divContainer = wd.findElement(By.className("container"));
    WebElement divContainer1 = wd.findElement(By.cssSelector(".container"));
    WebElement elementing = wd.findElement(By.xpath("//*[@class = 'container']"));


    List<WebElement> navList = wd.findElements(By.className("nav-item"));
    List<WebElement> navList1 = wd.findElements(By.cssSelector(".nav-item"));

    //by id
    WebElement nav = wd.findElement(By.id("nav"));
    WebElement nav1 = wd.findElement(By.cssSelector("#nav"));
    WebElement nav3 = wd.findElement(By.xpath("//*[@id = 'root']"));

    //by attribute
    WebElement inputName = wd.findElement(By.cssSelector("[placeholder = 'Type your name']"));
        //start with text
    WebElement inputName1 = wd.findElement(By.cssSelector("[placeholder^ = 'Type']"));
        //end with text
    WebElement inputName2 = wd.findElement(By.cssSelector("[placeholder$ = 'name']"));
        //containing text
    WebElement inputName3 = wd.findElement(By.cssSelector("[placeholder* = 'your']"));

    WebElement a2 = wd.findElement(By.cssSelector("[href = '#item3']"));

    WebElement a44 = wd.findElement(By.xpath("//*[@placeholder = 'Email']"));
    WebElement a66 = wd.findElement(By.xpath("//*[starts-with(@placeholder, 'Em')]"));
    WebElement a67 = wd.findElement(By.xpath("//*[contains(@placeholder, 'ma')]"));
    WebElement a68 = wd.findElement(By.xpath("//*[contains(@placeholder, 'il')]"));


    //by name
    WebElement inputS = wd.findElement(By.name("surname"));
    WebElement inputS1 = wd.findElement((By.cssSelector("[name = 'surname']")));

    //By.linkText && By.partialLinkText
        WebElement a3  = wd.findElement(By.linkText("Item 1"));
        WebElement a4  = wd.findElement(By.partialLinkText("m 1"));

}



}
