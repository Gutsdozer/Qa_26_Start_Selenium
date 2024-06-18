import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartSelenium {
    WebDriver wd;

    @Test
    public void  test(){
        wd = new ChromeDriver();
        wd.get("https://www.linkedin.com/in/stepan-mirmov-8b90a1195/");
    }

}
