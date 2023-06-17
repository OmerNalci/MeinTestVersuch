package stepdefs;

import Driver.Driver;
import io.cucumber.java.After;
import org.testng.annotations.AfterTest;

public class Hooks {

    @After
    public void aTest(){
        Driver.quitDriver();
    }
}
