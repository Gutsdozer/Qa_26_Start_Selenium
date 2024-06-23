import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class LoginTests {

@BeforeClass
public void preCondition(){
    //open browser;
    //open cite;
}

public void loginSuccess(){
    //open form; (find element and click it);
    //fill form; (find element, click it, clear, type)
    //submit form;
}


public void loginWrongEmail(){

}

    public void loginWrongPassword(){

    }

    public void loginUnregisteredUser(){

    }

@AfterClass
public void postCondition(){
    //close browser;
}

}
